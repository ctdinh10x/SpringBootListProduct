package com.samsung.basicsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {
    @GetMapping("/login")
    public String Login()
    {
        return "Auth/login";
    }

    @GetMapping("/welcome")
    public String Welcome()
    {
        return "Auth/welcome";
    }
}
