package com.example.demo.testOther.designPattern.factory;

import com.alibaba.druid.util.StringUtils;

public class HeroFactory {

    public Heros getDifferentHero(String heroType) {
        if (StringUtils.isEmpty(heroType)) {
            return null;
        }

        if ("Ashe".equalsIgnoreCase(heroType)) {
            return new Ashe();
        }else if ("MasterYi".equalsIgnoreCase(heroType)) {
            return new MasterYi();
        }

        return null;
    }
}
