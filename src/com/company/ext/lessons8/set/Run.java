package com.company.ext.lessons8.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Run {
    public static void main(String[] args) {
        hashSet();
        System.out.println();
        linkedHashSet();
        System.out.println();
        treeSet();
    }

    private static void hashSet() {
        HashSet<String> set = new HashSet<>();
        set.add("Katya");
        set.add("Sveta");
        set.add("Olga");
        set.add("Valya");
        set.add("Yana");
        System.out.println(set);
        set.remove("Olga");
        System.out.println(set);
        System.out.println(set.contains("Yana"));
        for (String s :set){
            System.out.println(s);
        }
    }

    private static void linkedHashSet() {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Yana");
        linkedHashSet.add("Sveta");
        linkedHashSet.add("Olga");
        linkedHashSet.add("Valya");
        linkedHashSet.add("Katya");
        System.out.println(linkedHashSet);
        linkedHashSet.remove("Olga");
        System.out.println(linkedHashSet);
        System.out.println(linkedHashSet.contains("Yana"));
        for (String s : linkedHashSet){
            System.out.println(s);
        }
    }

    private static void treeSet() {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Katya");
        treeSet.add("Sveta");
        treeSet.add("Olga");
        treeSet.add("Valya");
        treeSet.add("Yana");
        System.out.println(treeSet);
        treeSet.remove("Olga");
        System.out.println(treeSet);
        System.out.println(treeSet.contains("Yana"));
        for (String s : treeSet){
            System.out.println(s);
        }
    }
}
