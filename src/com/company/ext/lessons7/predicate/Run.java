package com.company.ext.lessons7.predicate;

public class Run {
    public static void main(String[] args) {
        //– Создать лямбда выражение, которое возвращает значение true,
        // если строка не null, используя функциональный интерфейс Predicate.
        //– Создать лямбда выражение, которое проверяет, что строка не пуста,
        // используя функциональный интерфейс Predicate.

//        Predicate<String> predicate = (s) -> s != null;
//        Predicate<String> predicate1 = (s) -> !s.isEmpty();
//
//        System.out.println(predicate.nic(null));
//        System.out.println(predicate.nic(""));
//        System.out.println(predicate1.nic(""));
//        System.out.println(predicate1.nic("some"));


        //– Написать программу проверяющую, что строка не null и не пуста,
        // используя метод and() функционального интерфейса Predicate.

//        Predicate<String> predicate = (s) -> s != null && !s.isEmpty();
//        Predicate<String> predicate1 = predicate.and(predicate);
//
//        System.out.println(predicate1.nic(null));
//        System.out.println(predicate1.nic(""));
//        System.out.println(predicate1.nic("some"));


        //Написать программу, которая проверяет, что строка начинается буквой “J”или “N”
        // и заканчивается “A”. Используем функциональный интерфейс Predicate.

        Predicate<String> predicate1 = (s) -> s.startsWith("J");
        Predicate<String> predicate2 = (s) -> s.startsWith("N");
        Predicate<String> predicate3 = (s) -> s.endsWith("A");

        Predicate<String> predicate = predicate1.or(predicate2).and(predicate3);

        System.out.println(predicate.nic("Jema"));
        System.out.println(predicate.nic("JavA"));
        System.out.println(predicate.nic("Neva"));
        System.out.println(predicate.nic("NevA"));
    }
}
