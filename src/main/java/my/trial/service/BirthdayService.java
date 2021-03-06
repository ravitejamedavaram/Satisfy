package my.trial.service;

import my.trial.dao.BirthdayDao;
import my.trial.dto.Birthday;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BirthdayService {

    @Autowired
    BirthdayDao birthdayDao;

    public Birthday newBrithdayAdd(Birthday birthday) {
        return birthdayDao.addBirthday(birthday.getDob(), birthday.getName()
                , birthday.getAuto_wish(), null, null);
    }

    public List getAllBirthdays() {
        return birthdayDao.getAllBirthdays();
    }

    public Birthday getBirthdayByName(String name) {
        return birthdayDao.getBirthdayByName(name);
    }
}
