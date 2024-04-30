package com.example.quiztunes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping(value = "/")
    public String home() {
        return "home";
    }
    @GetMapping(value = "/main")
    public String main() {
        return "main";
    }
    @GetMapping(value = "/room")
    public String room() {
        return "room";
    }
    @GetMapping(value = "/waiting")
    public String waiting() {
        return "waiting";
    }
}
