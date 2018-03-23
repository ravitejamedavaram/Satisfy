package my.trial;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceView;

import javax.activation.MimeType;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;

@Controller
public class SayHello {

    @RequestMapping("/hello")
    @ResponseBody
    public String reply() {
        return "Hello my fans";
    }

    private class Person {
        private String name;
        private String designation;

        public Person(String name, String designation) {
            this.name = name;
            this.designation = designation;
        }

        public String getName() {
            return name;
        }

        public String getDesignation() {
            return designation;
        }
    }

//    @RequestMapping(value = "/", method = RequestMethod.GET )
//    @ResponseBody
//    public Person index(HttpServletRequest request, HttpServletResponse response) throws Exception{
//        return new Person("Ravi", "SSE");
//    }

//    @RequestMapping(value = "/", method = RequestMethod.GET )
//    public String index() throws Exception{
//        return "/views/login.html";
////            return new InternalResourceView("/views/login.html");
//    }


}
