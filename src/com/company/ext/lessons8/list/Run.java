package com.company.ext.lessons8.list;

import java.util.Collections;
import java.util.LinkedList;

public class Run {
    public static void main(String[] args) {
        arrayList();
        linkedList();
        System.out.println();
    }

    private static void linkedList() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Yura");
        linkedList.add("Yura");
        linkedList.add("Katya");
        linkedList.add("Katya");
        linkedList.add("Sasha");
        linkedList.add("Sasha");
        linkedList.add("Valya");
        linkedList.add("Valya");
        System.out.println(linkedList);
        linkedList.remove(1);
        linkedList.remove("Sasha");
        System.out.println(linkedList);
        System.out.println(linkedList.get(2));
        linkedList.sort((t1,t2) -> t1.compareTo(t2));
        System.out.println(linkedList);
        System.out.println(linkedList.get(Collections.binarySearch(linkedList,"Valya")));
        for (String name : linkedList){
            System.out.println(name);
        }
    }

    private static void arrayList() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Petya");
        list.add("Petya");
        list.add("Olga");
        list.add("Olga");
        list.add("Ira");
        list.add("Ira");
        list.add("Misha");
        list.add("Misha");
        System.out.println(list);
        list.remove(1);
        list.remove("Misha");
        System.out.println(list);
        System.out.println(list.get(2));
        list.sort((t1, t2) -> t1.compareTo(t2));
        System.out.println(list);
        System.out.println(list.get(Collections.binarySearch(list,"Olga")));
        for (String name : list){
            System.out.println(name);
        }
    }
}
