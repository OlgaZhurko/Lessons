package com.company.ext.lessons7.consumer;

public class Run {
    public static void main(String[] args) {
        Consumer<HeavyBox> consumer1 = heavyBox -> System.out.println("Отгрузили ящик с весом " + heavyBox);

        consumer1.andThen(new HeavyBox(200));
    }
}
