package syksy24.testiprojekti.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {

    @RequestMapping("/index")
    public String index() {
        return "This is the main page";
    }
    @RequestMapping("/contact")
    public String contact() {
        return "This is the contact page";
    }
    @RequestMapping("/hello")
    public String moi(@RequestParam(name="location") String yourLocation, @RequestParam(name="name") String yourName) {
        return "Welcome to the " + yourLocation + " " + yourName + "!";
    }
}