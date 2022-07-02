package com.company.ext.lessons5;

public class String2 {
    public static void main(String[] args) {
        int a = 3;
        int b = 56;
        String s;

        StringBuffer sb = new StringBuffer(7);
        s = sb.append(a).append("+").append(b).append("=").append(a+b + "\n").
                append(a).append("-").append(b).append("=").append(a-b + "\n").
                append(a).append("*").append(b).append("=").append(a*b + "\n").toString();
        System.out.println(s);

//        s = sb.deleteCharAt(4).insert(4, "равно").
//                deleteCharAt(16).insert(16, "равно").
//                deleteCharAt(29).insert(29, "равно").toString();
//        System.out.println(s);


        s = sb.replace(4,5, "равно").
                replace(16, 17,"равно").
                replace(29, 30,"равно").toString();
        System.out.println(s);
    }
}
