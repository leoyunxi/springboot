package com.example.demospringboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;

@Controller
public class HelloController {

    @RequestMapping("/test")
    public String hello(Model m) throws Exception {
        m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
        // thymeleaf
        m.addAttribute("name", "thymeleaf");
        return "hello";
    }
}
