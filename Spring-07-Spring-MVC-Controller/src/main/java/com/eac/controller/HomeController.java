package com.eac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/alexa")
    public String home(){
        return "home.html";
    }

    @RequestMapping("/welcome")
    public String home2(){
        return "welcome.html";
    }

    @RequestMapping("/anime")
    public String home3(){
        return "anime.html";
    }


}
