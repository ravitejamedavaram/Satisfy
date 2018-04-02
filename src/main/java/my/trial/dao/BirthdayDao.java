package my.trial.dao;

import my.trial.db.DBConnection;
import my.trial.dto.Birthday;
import my.trial.mapper.BirthdayMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@Component
public class BirthdayDao {
    private  JdbcTemplate jdbcTemplate;

    public BirthdayDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public Birthday addBirthday(String dob, String name, boolean auto_wish, String photo, Integer created_by) {
        jdbcTemplate.update("Insert into wishes.birthday(dob, name, auto_wish, photo, created_by)" +
                " VALUES (?,?,?,?,?)", dob, name, auto_wish, photo, created_by);
        return new Birthday(true);
    }

    public  List<Birthday> getAllBirthdays(){

        List<Birthday> birthdays = jdbcTemplate.query("SELECT * from wishes.birthday",  new BirthdayMapper());
        return birthdays;
    }


    public Birthday getBirthdayByName(String name) {
        List<Birthday> query = jdbcTemplate.query("SELECT * from wishes.birthday where name = " + name, new BirthdayMapper());
        //todo
        return null;
    }
}
