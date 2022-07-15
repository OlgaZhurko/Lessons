package com.company.ext.lessons8.map;

import java.util.*;

public class Run {
    public static void main(String[] args) {
        hashMap();
        System.out.println();
        linkedHashMap();
        System.out.println();
        treeMap();
    }

    private static void hashMap(){
    Map<Integer, String> map = new HashMap<>();
        map.put(1,"Ira");
        map.put(2,"Olga");
        map.put(3,"Masha");
        map.put(4,"Petya");
        map.put(5,"Sasha");
        System.out.println(map);

        System.out.println();
        Set<Integer> keys = map.keySet();
        for (Integer i : keys){
            System.out.println(i);
        }
        System.out.println();
        Collection<String> values = map.values();
        for (String s : values){
            System.out.println(s);
        }
        System.out.println();
        for(Map.Entry<Integer, String> item : map.entrySet())
            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
    }

    private static void linkedHashMap() {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1,"Ira");
        map.put(2,"Olga");
        map.put(3,"Masha");
        map.put(4,"Petya");
        map.put(5,"Sasha");
        System.out.println(map);

        System.out.println();
        Set<Integer> keys = map.keySet();
        for (Integer i : keys){
            System.out.println(i);
        }
        System.out.println();
        Collection<String> values = map.values();
        for (String s : values){
            System.out.println(s);
        }
        System.out.println();
        for(Map.Entry<Integer, String> item : map.entrySet())
            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
    }

    private static void treeMap() {
        Map<Integer, String> map = new TreeMap<>();
        map.put(1,"Ira");
        map.put(2,"Olga");
        map.put(3,"Masha");
        map.put(4,"Petya");
        map.put(5,"Sasha");
        System.out.println(map);

        System.out.println();
        Set<Integer> keys = map.keySet();
        for (Integer i : keys){
            System.out.println(i);
        }
        System.out.println();
        Collection<String> values = map.values();
        for (String s : values){
            System.out.println(s);
        }
        System.out.println();
        for(Map.Entry<Integer, String> item : map.entrySet())
            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
    }
}
