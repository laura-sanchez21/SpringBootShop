package com.lausan.store;
  
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping("/test")
    public @ResponseBody String test() {
        System.out.println(">>> test() controller called");
        return "This is a test response";
    }
}

