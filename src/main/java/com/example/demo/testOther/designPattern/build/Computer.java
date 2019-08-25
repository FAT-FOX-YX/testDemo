package com.example.demo.testOther.designPattern.build;

import java.util.ArrayList;
import java.util.List;

public class Computer {

    private List<String> parts = new ArrayList<>();

    public void add(String buildPart) {
        parts.add(buildPart);
    }

    public void show() {
        for (String part : parts) {
            System.out.println("组件： "+ part + " 装好了");
        }
        System.out.println("computer finished!!");
    }
}
