package com.jpa.jparticle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class FirstController {
    @GetMapping("/hi")
    public String niceToMeetYou() {
        return "greetings";
    }
}