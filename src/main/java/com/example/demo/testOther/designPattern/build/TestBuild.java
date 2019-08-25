package com.example.demo.testOther.designPattern.build;

public class TestBuild {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new ConcreateBuilder();

        director.constructMarkComputer(builder);

        Computer computer = builder.getComputer();
        computer.show();
    }
}
