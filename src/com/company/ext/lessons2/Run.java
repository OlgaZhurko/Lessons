package com.company.ext.lessons2;

public class Run {
    public static void main(String args[]){
        MyArrayList arrayList = new MyArrayList();
        System.out.println(arrayList);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(3);
        System.out.println(arrayList);
        arrayList.add(88);
        System.out.println(arrayList);
        arrayList.remove(8);
        System.out.println(arrayList);
        arrayList.sort();
        System.out.println(arrayList);
}
}
