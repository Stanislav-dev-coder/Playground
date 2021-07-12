package com.stanislav.playground.rest;

import com.stanislav.playground.core.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RestController
public class CalculatorController {

    private final CalculatorService calculatorService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/calc")
    public Integer calc(@RequestParam(name = "a") Integer a, @RequestParam(name = "b") Integer b){
        Integer res = calculatorService.sum(a, b);
        return res;
    }

//    @PostMapping(value = "/multiply", consumes = "application/json", produces = "application/json")
//    public Integer multiply(){
//
//    }
}
