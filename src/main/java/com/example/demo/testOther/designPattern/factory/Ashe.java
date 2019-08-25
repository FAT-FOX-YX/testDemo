package com.example.demo.testOther.designPattern.factory;

public class Ashe implements Heros {

    @Override
    public void buyHeroSuccess() {
        System.out.println("get Ashe");
    }

    @Override
    public void useHeroSkill() {
        System.out.println("use skill ：鹰击长空");
    }
}
