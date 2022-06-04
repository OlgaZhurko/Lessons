package com.company.ext.lessons1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        int i = 869222;
        int minute;
        int sek;
        int chas;
        int day;
        int week;

        minute = i / 60;
        sek = i % 60;
        System.out.println("Минут " + minute + " секунд " + sek);

        chas = i / 3600;
        minute = i / 60 % 60;
        sek = i % 60;
        System.out.println("Часов " + chas + " минут " + minute + " секунд " + sek);

        day = i / 86400;
        chas = i / 3600 % 60;
        minute = i / 60 % 60;
        sek = i % 60;
        System.out.println("Дней " + day + " часов " + chas + " минут " + minute + " секунд " + sek);

        week = i / 604800;
        day = (i / 86400 % 60) - 7;
        chas = i / 3600 % 60;
        minute = i / 60 % 60;
        sek = i % 60;
        System.out.println("Недель " + week + " дней " + day + " часов " + chas + " минут " + minute + " секунд " + sek + "\n");

        //2.Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа различны?
        System.out.println("Введите четырехзначное число: ");
        int[] arrays = new int[4];
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        if (num < 1000 || num > 9999) {
            System.out.println("Ошибка! Вы ввели не четырехзначное число.");
            System.exit(0);
        }
        for (int a = 0; a < arrays.length; a++) {
            arrays[a] = num % 10;
            num /= 10;
        }
        System.out.println(Arrays.toString(arrays));
        if (arrays[0] != arrays[1] && arrays[1] != arrays[2] && arrays[2] != arrays[3] && arrays[3] != arrays[0]) {
            System.out.println("Цифры все различны!");
        } else {
            System.out.println("Есть одинаковые цифры!" );
        }
        System.out.println("\n");

        //3.Создайте число. Определите, является ли число трехзначным.
        // Определите, является ли его последняя цифра семеркой.
        // Определите, является ли число четным.
        System.out.println("Введите трехзначное число: ");
        int[] arr = new int[3];
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        if (numb < 100 || numb > 999) {
            System.out.println("Ошибка! Вы ввели не трехзначное число.");
            System.exit(0);
        }
        for (int f = 0; f < arr.length; f++) {
            arr[f] = numb % 10;
            numb /= 10;
        }
        System.out.println(Arrays.toString(arr));
        if (arr[0] != arr[1] && arr[1] != arr[2] && arr[0] != arr[2]) {
            System.out.println("Цифры все различны!");
        }else {
            System.out.println("Есть одинаковые числа!");
        }
        if (arr[0] == 7){
            System.out.println("Последнее число 7!");
        }else {
            System.out.println("Последнее число не 7");
        }
            if (arr[0] %2 == 0){
                System.out.println("четное трехзначное число");
            }else{
                System.out.println("нечетное трехзначное число");
        }System.out.println("\n");

        //4.Имеется целове число (задать с помощью Random rand = new Random(); int x = rand.nextInt() ).
        // Это число – количесво денег в рублях.
        // Вывести это число, добавив к нему слово «рублей» в правильном падеже.
        int min = 1;
        int max = 10;
        int tt = max - min;
        Random rand = new Random();
        int x = rand.nextInt(tt + 1) + min;
        switch (x) {
            case 1:
                System.out.println(x + " рубль");
                break;
            case 2:
                System.out.println(x + " рубля");
                break;
            default:
                System.out.println(x + " рублей");
                break;
        }System.out.println("\n");

        //5.Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).
        int result = 1;
        for (int d = 10; d <=15; d++) {
            result = result * d;
            System.out.println(result);
        }System.out.println("\n");

        //6.Имеется целое число, определить является ли это число простым, т.е. делится без остатка только на 1 и себя
        int n = 43;
        for (int l = 2; l < n; l++)
        {
            if ( n%l == 0)
            {
                System.out.println("Не простое число");
                return;
            }
        }
        System.out.println("Простое число");
        System.out.println("\n");

        //7.Найдите сумму первых n целых чисел, которые делятся на 3.
        int sum = 0;
        for (int h = 1; h <= 6; h++)
        {
            if (h% 3 == 0)
            {
                sum = sum + 1;
            }
        }
        System.out.println(sum);
        System.out.println("\n");

        //8.Создать массив оценок произвольной длины, вывести максимальную и минимальную оценку, её (их) номера.
        int min2;
        int max2;
        int[] ars = {1,2,3,4,5,6,7,8,9,10};
        min2 = ars[0];
        max2 = ars[0];
        for (int j = 0; j < ars.length; j++){
            if(min2 > ars[j]){
                min2 = ars[j];
            }
            if (max2 < ars[j]){
                max2 = ars[j];
            }
        }
        System.out.println(min2);
        System.out.println(max2);
        System.out.println("\n");

        //9.Создать массив, заполнить его случайными элементами, распечатать, перевернуть, и снова распечатать (при переворачивании нежелательно создавать еще один массив).
        System.out.println("Созданный массив");
        int p = 8;
        int nub[] = new int[p];
        for (int r = 0; r < p; r++)
        {
            nub[r] = (int)(Math.random()*10+1);
            System.out.print(" " + nub[r]);
        }
        for (int r = 0; r < p/2; r++)
        {
            int j = nub[r];
            nub[r] = nub[p-1-r];
            nub[p-1-r] = j;
            System.out.println("\n");
        }
        System.out.println("Перевернутый массив");
        for (int r = 0; r < p; r++) {
            System.out.print(" " + nub[r]);
        }System.out.println("\n");
    }
}
