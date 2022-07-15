package com.company.ext.lessons8.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Run {
    public static void main(String[] args) {
        Deque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("Petya");
        arrayDeque.add("Olga");
        arrayDeque.add("Ira");
        arrayDeque.add("Misha");
        arrayDeque.add("Sasha");
        System.out.println(arrayDeque);

        for (String s : arrayDeque){
            System.out.println(s);
        }
        System.out.println();
        arrayDeque.removeFirst();
        arrayDeque.removeLast();
        System.out.println(arrayDeque);

        System.out.println();
        arrayDeque.addFirst("Nic");
        arrayDeque.addLast("Mic");
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.getFirst());
        System.out.println(arrayDeque.getLast());

        System.out.println();
        Queue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Petya");
        priorityQueue.add("Olga");
        priorityQueue.add("Ira");
        priorityQueue.add("Misha");
        priorityQueue.add("Sasha");
        while (priorityQueue.size() != 0){
            System.out.println(priorityQueue.remove());
        }
    }
}
