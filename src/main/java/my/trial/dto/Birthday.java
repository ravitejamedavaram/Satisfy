package my.trial.dto;


import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Birthday {
    private boolean added;
    public String dob;
    public String name;
    public boolean auto_wish;

    public Birthday() {

    }

    public Birthday(String dob, String name, boolean auto_wish) {
        this.dob = dob;
        this.name = name;
        this.auto_wish = auto_wish;
    }

    public String getDob() {

        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public boolean getAuto_wish() {
        return auto_wish;
    }

    public void setAuto_wish(boolean auto_wish) {
        this.auto_wish = auto_wish;
    }

    public boolean isAdded() {
        return added;
    }

    public void setAdded(boolean added) {
        this.added = added;
    }

    public Birthday(boolean added) {
        this.added = added;
    }


}

