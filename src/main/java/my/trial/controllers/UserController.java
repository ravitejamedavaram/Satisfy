package my.trial.controllers;

import my.trial.dto.UserDto;
import my.trial.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.activation.MimeType;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/signUp", method = RequestMethod.POST)
    @ResponseBody
    public UserDto adduser(@RequestBody UserDto userDto){
        return userService.adduser(userDto);
    }

    @RequestMapping(value = "/signUpPage", method = RequestMethod.GET)
    public String signUp(){
        return "signUpPage.html";
    }
}
