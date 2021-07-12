package com.stanislav.playground.core;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public Integer sum(Integer a, Integer b){
        return a + b;
    }

    public Integer multiply(Integer a, Integer b){
        return a * b;
    }

}
