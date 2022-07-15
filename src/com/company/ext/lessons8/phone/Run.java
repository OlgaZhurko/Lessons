package com.company.ext.lessons8.phone;

import java.util.*;

public class Run {
    public static void main(String[] args) {
        comparable();
        System.out.println();
        comparator();
        System.out.println();
        comparator1();
    }

    private static void comparable() {
        List<Phone> phoneList = new ArrayList<>();
        phoneList.add(new Phone(1236,"iphone",355));
        phoneList.add(new Phone(4569,"samsung",322));
        phoneList.add(new Phone(7896,"nokia",366));
        Collections.sort(phoneList);
        for (Phone p : phoneList){
            System.out.println(p);
        }
    }

    private static void comparator() {
        PhoneComparator phoneComparator = new PhoneComparator();
        List<Phone> phoneList = new ArrayList<>();
        phoneList.add(new Phone(1236,"iphone",355));
        phoneList.add(new Phone(4569,"samsung",322));
        phoneList.add(new Phone(7896,"nokia",366));
        Collections.sort(phoneList,Phone::compareTo);
        for (Phone p : phoneList){
            System.out.println(p);
        }
    }

    private static void comparator1() {
        PhoneComparator phoneComparator = new PhoneComparator();
        SortedSet<Phone> set = new TreeSet<>(phoneComparator);
        set.add(new Phone(244,"iphone",360));
        set.add(new Phone(123,"samsung",232));
        set.add(new Phone(123,"samsung",230));
        set.add(new Phone(333,"nokia",345));
        set.forEach(System.out::println);
    }
}
