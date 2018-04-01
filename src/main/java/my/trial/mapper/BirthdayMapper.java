package my.trial.mapper;

import my.trial.dto.Birthday;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BirthdayMapper implements RowMapper<Birthday> {

    @Nullable
    @Override
    public Birthday mapRow(ResultSet resultSet, int i) throws SQLException {
        Birthday birthday = new Birthday();
        birthday.setAuto_wish(resultSet.getBoolean("auto_wish"));
        birthday.setDob(resultSet.getString("dob"));
        birthday.setName(resultSet.getString("name"));
        return birthday;
    }
}