package com.example.demo.testOther.designPattern.factory;

public class MasterYi implements Heros {

    @Override
    public void buyHeroSuccess() {
        System.out.println("get MasterYi");
    }

    @Override
    public void useHeroSkill() {
        System.out.println("use skill: 无极剑道");
    }
}
