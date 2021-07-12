package com.stanislav.playground.core;

public class CalculatorService {

    private final int a;
    private final int b;
    private int result;

    public CalculatorService(int a, int b, int result) {
        this.a = a;
        this.b = b;
        this.result = result;
    }

    public int getFirsrt(){
        return a;
    }

    public int getSecond(){
        return b;
    }

    public int getSum(){
        return  result = a + b;
    }

    public int getPr(){
        return  result = a + b;
    }

    public int getPart(){
        return  result = a + b;
    }
}
