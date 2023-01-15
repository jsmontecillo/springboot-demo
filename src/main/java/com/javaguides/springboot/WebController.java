package com.javaguides.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
    @RequestMapping("/hello")
    public String sayHello(Model model) {
        System.out.println("saying hello spring boot");
        model.addAttribute("message", "Greetings from Los Angeles");
        return "hello";
    }
}
