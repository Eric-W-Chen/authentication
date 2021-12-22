package com.authentication.authentication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
    @GetMapping("")
    public String viewLoginPage() {
        return "index";
    }

    @GetMapping("/help")
    public String viewHelp() {
        return "help";
    }

    @GetMapping("/homepage")
    public String viewHomePage() {
        return "homepage";
    }


}
