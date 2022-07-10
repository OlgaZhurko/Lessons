package com.company.ext.lessons6;

import java.lang.annotation.Annotation;

public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        //Class <?> cl = myService.getClass();

        if(myService.getClass().getAnnotations().length > 0) {
            System.out.println("Для класса 'MyService' применены следующие аннотации: ");
            for(Annotation annotationName: myService.getClass().getAnnotations()) {
                System.out.println(annotationName);
            }
        } else {
            System.out.println("К классу 'MyService' не применены какие-либо аннотации.");
        }
    }
}
