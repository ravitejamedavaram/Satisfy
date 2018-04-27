package my.trial.security;

import my.trial.db.DBConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;


@Configuration
@EnableWebSecurity
public class Authentication extends WebSecurityConfigurerAdapter {
    private DataSource dataSource;

    public Authentication(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                .authorizeRequests()
                .antMatchers("/", "/views/login.html").anonymous()
                .and()
                .formLogin()
                .loginPage("/views/login.html")
                .loginProcessingUrl("/loginProcessor")
                .usernameParameter("username").passwordParameter("password")
                .defaultSuccessUrl("/home", true)
                .failureUrl("/403")
                .and()
                .logout()
                .and().csrf().disable();

    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user")
                .password("{noop}user")
                .roles("USER");
        auth.inMemoryAuthentication()
                .withUser("prithvi")
                .password("{noop}ch3coona")
                .roles("ADMIN");
        String userQuery = "Select username, password, TRUE from wishes.person where username = (?)";
        System.out.println("userquery" + userQuery);
        auth.jdbcAuthentication().dataSource(dataSource)
                .usersByUsernameQuery(userQuery)
                .authoritiesByUsernameQuery("Select username, 'ADMIN' from wishes.person where username = (?)")
                .passwordEncoder(passwordEncoder());


    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new Encoder();
    }


}
