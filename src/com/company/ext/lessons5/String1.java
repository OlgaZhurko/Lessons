package com.company.ext.lessons5;

import java.util.Locale;

public class String1 {
    public static void main(String[] args){

        comString("I like Java!!!");
        comString("I love Java!");
    }

    public static void comString(String str) {
        System.out.println(str);
        System.out.println(str.charAt(7));
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I like"));
        System.out.println(str.contains("Java"));
        System.out.println(str.indexOf("Java"));
        System.out.println(str.replace('a','o'));
        System.out.println(str.toUpperCase(Locale.ROOT));
        System.out.println(str.toLowerCase(Locale.ROOT));
        System.out.println(str.substring(0,6));
    }
}
