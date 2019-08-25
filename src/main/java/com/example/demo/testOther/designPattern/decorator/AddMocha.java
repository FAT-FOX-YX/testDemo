package com.example.demo.testOther.designPattern.decorator;

public class AddMocha extends Decorator {

    private String description = "add Mocha";
    private Beverage beverage = null;
    public AddMocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " = " + description;
    }

    @Override
    public double getPrice() {
        return beverage.getPrice() + 49;
    }
}
