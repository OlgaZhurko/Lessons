package com.company.ext.lessons4.phone;

public class Run {
    public static void main(String[] args) {
        Phone samsung = new Phone(22222222, "Samsung", 100);
        Phone sony = new Phone(11111111, "Sony", 200);
        Phone philips = new Phone(33333333, "Philips", 200);
        System.out.println(samsung);
        System.out.println(sony);
        System.out.println(philips);
        samsung.receiveCall("Tom");
        System.out.println(samsung.getNumber());
        samsung.receiveCall("Jek", 44444444);
        samsung.sendMessage(66666666,77777777,88888888);
    }
}
