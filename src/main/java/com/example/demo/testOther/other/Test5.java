package com.example.demo.testOther.other;

import java.util.*;

public class Test5 {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; ++i) {
            int value = random.nextInt(100);
            apples.add(new Apple(String.valueOf(value), value));
        }
        apples.sort(Comparator.comparing(Apple::getWeight));

        System.out.println(apples);
    }
}


class Apple {
    private String name;

    private int weight;

    public Apple(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
