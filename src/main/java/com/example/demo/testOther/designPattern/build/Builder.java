package com.example.demo.testOther.designPattern.build;

public abstract class Builder {

    public abstract void buildCPU();

    public abstract void buildMainboard();

    public abstract void buildHD();

    public abstract Computer getComputer();
}
