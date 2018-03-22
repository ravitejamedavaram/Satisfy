package my.trial.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

//
@Configuration
@EnableWebSecurity
public class Authentication extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/views/login.html").anonymous()
                .and()
                .formLogin()
//                .loginProcessingrl("/loginProcessor")
//                .usernameParameter("username")
//                .passwordParameter("password")
                .loginPage("/views/login.html")
                .loginProcessingUrl("/loginProcessor")
                .usernameParameter("username").passwordParameter("password")
                .defaultSuccessUrl("/views/a.html", true)
                .failureUrl("/views/login.html")
//                .permitAll()
                .and()
                .logout()
                .and().csrf().disable();
//                .permitAll();


    }

//    @Bean
//    @Override
//    public UserDetailsService userDetailsService() {
//        UserDetails user =
//                User.withDefaultPasswordEncoder()
//                        .username("user")
//                        .password("user")
//                        .roles("USER")
//                        .build();
////        user = User.builder().build()
//
//        return new InMemoryUserDetailsManager(user);
//    }

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

//        auth.
    }



}
