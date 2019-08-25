package com.example.demo.testOther.designPattern.build;

public class Director {
    public void constructMarkComputer(Builder builder) {
        builder.buildCPU();
        builder.buildMainboard();
        builder.buildHD();
    }
}
