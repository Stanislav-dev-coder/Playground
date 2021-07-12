package com.stanislav.playground.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class CalculatorController {

    @GetMapping("/hello")
    public String greetingToClient() {
        return "index1";
    }

}
