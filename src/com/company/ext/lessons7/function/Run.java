package com.company.ext.lessons7.function;

public class Run {
    public static void main(String[] args) {

        Function<Integer, String> function = i -> {
                String res= "Ноль";
           if(i > 0) {
               res = "Положительное число";
           }else if(i < 0){
               res = "Отрицательное число";
           }
           return res;
           };
        System.out.println(function.nic(0));
        System.out.println(function.nic(2));
        System.out.println(function.nic(-2));
    }
}
