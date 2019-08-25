package com.example.demo.testOther.designPattern.decorator;

public class AddMilk extends Decorator {
    private String description = "add Milk";
    private Beverage beverage = null;
    public AddMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " = " + description;
    }

    @Override
    public double getPrice() {
        return beverage.getPrice() + 20;
    }
}
