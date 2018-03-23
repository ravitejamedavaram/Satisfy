package my.trial.controllers;

import my.trial.dto.NewBrithdayAdd;
import my.trial.service.BirthdayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Birthday {

    @Autowired
    BirthdayService birthdayService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public NewBrithdayAdd addData(@RequestBody NewBrithdayAdd newBrithdayAdd) {
        return birthdayService.newBrithdayAdd(newBrithdayAdd);
    }
}
