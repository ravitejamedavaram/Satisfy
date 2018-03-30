package my.trial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHello {

    @RequestMapping("/hello")
    @ResponseBody
    public String reply() {
        return "Hello my fans";
    }


    @RequestMapping(value = "/" )
    public String index() throws Exception{
        return "login";
    }

    @RequestMapping(value = "/home" )
    public String home() throws Exception{
        return "Home";
    }

}
