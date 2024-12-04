package com.example.lawander.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LawanderController {

    @GetMapping("/")
    public String showTest() {
        return "test";
    }
}