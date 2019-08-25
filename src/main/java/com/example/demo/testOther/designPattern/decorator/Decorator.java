package com.example.demo.testOther.designPattern.decorator;

public class Decorator implements Beverage {

    private String des = "只是一个装饰类，不做具体操作";

    @Override
    public String getDescription() {
        return des;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
