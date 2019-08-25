package com.example.demo.testOther.designPattern.factory;

public class TestFactory {
    public static void main(String[] args) {
        HeroFactory factory = new HeroFactory();
        Heros ashe = factory.getDifferentHero("Ashe");
        ashe.buyHeroSuccess();
        ashe.useHeroSkill();
        System.out.println("=========================================");
        Heros masterYi = factory.getDifferentHero("MasterYi");
        masterYi.buyHeroSuccess();
        masterYi.useHeroSkill();
    }
}

