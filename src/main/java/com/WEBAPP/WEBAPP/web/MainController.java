package com.WEBAPP.WEBAPP.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {


    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/pomoc")
    public String pomoc() {
        return "pomoc";
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }

}
