package com.example.demo.testOther.designPattern.decorator;

public class CoffeeBean1 implements Beverage {

    private String description = "选择了第一种咖啡";

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return 50;
    }
}
