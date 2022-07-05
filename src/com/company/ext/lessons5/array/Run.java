package com.company.ext.lessons5.array;

public class Run {
    public static void main(String[] args) {


        List<String> list1 = new MyArrayList<>();
        list1.add("5");
        list1.add("4");
        list1.add("6");
        list1.add("7");
        list1.add("8");
        list1.add("9");
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");
        list1.add("4");
        list1.add("3");
        System.out.println(list1);
    Boolean str =  list1.remove(-1);
        System.out.println(list1);
        System.out.println("ghf");
    }
}
