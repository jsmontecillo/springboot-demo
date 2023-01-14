package com.javaguides.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {
    @RequestMapping("/hello")
    public String sayHello() {
        System.out.println("saying hello spring boot");
        return "hello";
    }
}
