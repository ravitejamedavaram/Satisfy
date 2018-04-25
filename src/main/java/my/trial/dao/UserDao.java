package my.trial.dao;

import my.trial.dto.UserDto;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import javax.sql.DataSource;

@Component
public class UserDao {
    private JdbcTemplate jdbcTemplate;

    public UserDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public UserDto adduser(String username, String password, String email, int role) {
        jdbcTemplate.update("INSERT INTO wishes.person(id,username, password, email, role_id)\n" +
                "  VALUES (DEFAULT ,(?),(?),(?),1)", username, password, email);
        return new UserDto(true);
    }
}
