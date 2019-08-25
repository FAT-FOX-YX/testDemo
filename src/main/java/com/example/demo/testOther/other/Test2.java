package com.example.demo.testOther.other;

public class Test2 {
    public static void main(String[] args) {
        /*AParent a = new AChild();
        a.sayHello();*/

        AChild b = new AChild();
        b.sayHello();
    }
}


class AParent {
    private String name = "hhhhh";

    public AParent() {
        System.out.println(name);
    }

    public void sayHello() {
        System.out.println("AParent say hell;");
    }
}

class AChild extends AParent {

    private String name;

    public AChild() {
        name = "ooooooooooooooo";
        System.out.println(name);
    }

    public void sayHello() {
        System.out.println("AChild say hell;");
    }
}
