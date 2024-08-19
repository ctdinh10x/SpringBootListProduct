package com.samsung.basicsecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    PasswordEncoder passwordEncoder;
    @GetMapping("/")
    public String welcome()
    {
        return "welcome";
    }

    @GetMapping("/home")
    public String Home()
    {
        return "welcome";
    }
}
