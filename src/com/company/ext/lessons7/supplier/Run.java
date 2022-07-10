package com.company.ext.lessons7.supplier;

public class Run {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> (int) (Math.random()*10);

        System.out.println(supplier.get());
    }
}
