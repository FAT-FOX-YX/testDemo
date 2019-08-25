package com.example.demo.testOther.designPattern.decorator;

public class TestDecorator {
    public static void main(String[] args) {
        Beverage beverage = new CoffeeBean1();
        beverage = new AddMocha(beverage);
        beverage = new AddMilk(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.getPrice());
    }
}
