package my.trial.dao;

import my.trial.dto.Birthday;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class BirthdayDao {
    private JdbcTemplate jdbcTemplate;

    public BirthdayDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public Birthday addBirthday(String dob, String name, boolean auto_wish, String photo, Integer created_by) {
        jdbcTemplate.update("Insert into wishes.birthday(dob, name, auto_wish, photo, created_by)" +
                " VALUES (?,?,?,?,?)", dob, name, auto_wish, photo, created_by);
        return new Birthday(true);
    }
}
