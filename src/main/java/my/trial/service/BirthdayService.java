package my.trial.service;

import my.trial.dao.BirthdayDao;
import my.trial.dto.NewBrithdayAdd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BirthdayService {

    @Autowired
    BirthdayDao birthdayDao;

    public NewBrithdayAdd newBrithdayAdd(NewBrithdayAdd newBrithdayAdd) {
        return birthdayDao.addBirthday(newBrithdayAdd.getDob(), newBrithdayAdd.getName()
                , newBrithdayAdd.getAuto_wish(), "", null);
    }
}
