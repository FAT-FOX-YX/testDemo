package com.example.demo.testOther.designPattern.build;

public class ConcreateBuilder extends Builder {

    Computer computer = new Computer();

    @Override
    public void buildCPU() {
        computer.add("buildCPU");
    }

    @Override
    public void buildMainboard() {
        computer.add("buildMainboard");
    }

    @Override
    public void buildHD() {
        computer.add("buildHD");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }


}
