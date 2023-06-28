package com.simplon.concepthotelmineur.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping("/")
    public String home() {
        return ("index");
    }
    @GetMapping("/login")
    public String login(){
        return ("login");
    }
    @GetMapping("/inscription")
    public String register(){
        return ("userRegister");
    }
    @GetMapping("/reservation")
    public String booking(){
        return ("booking");
    }

    @GetMapping("/hotel")
    public String hotel(){
        return ("hostel");
    }
    @GetMapping("/avis_clients")
    public String reviews(){
        return ("reviews");
    }

}
