package my.trial.dao;

import my.trial.dto.NewBrithdayAdd;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class BirthdayDao {
    private JdbcTemplate jdbcTemplate;

    public BirthdayDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public NewBrithdayAdd addBirthday(String dob, String name, int auto_wish, String photo, Integer created_by) {
        jdbcTemplate.update("Insert into birthday(dob, name, auto_wish, photo, created_by)" +
                " VALUES (?,?,?,?,?)", dob, name, auto_wish, photo, created_by);
        return new NewBrithdayAdd(true);
    }
}
