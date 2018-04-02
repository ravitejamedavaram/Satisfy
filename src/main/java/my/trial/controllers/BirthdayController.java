package my.trial.controllers;

import my.trial.service.BirthdayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import my.trial.dto.Birthday;

import java.util.List;

@Controller
public class BirthdayController {

    @Autowired
    BirthdayService birthdayService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Birthday addData(@RequestBody Birthday birthday) {
        return birthdayService.newBrithdayAdd(birthday);
    }

    @RequestMapping(value = "/getAllBirthdays", method = RequestMethod.GET)
    @ResponseBody
    public List<Birthday> getAllBirthdays(){
        return birthdayService.getAllBirthdays();
    }

    @RequestMapping(value = "getBirthdayByName", method = RequestMethod.GET)
    @ResponseBody
    public Birthday getBirthdayByName(@RequestBody String name){
        return birthdayService.getBirthdayByName(name);
    }
}
