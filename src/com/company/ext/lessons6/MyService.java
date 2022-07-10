package com.company.ext.lessons6;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

@Retention(RetentionPolicy.RUNTIME)
@interface Version {
    String name();
    double num();
}

@Version(name = "Nougat", num = 7.1)
public class MyService {
    private String name;
    private double num;

    public MyService() {
    }

    public MyService(String name, double num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyService myService = (MyService) o;
        return Double.compare(myService.num, num) == 0 && Objects.equals(name, myService.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, num);
    }

    private void thisClassInfo(){

    }

    @Override
    public String toString() {
        return "MyService{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }
}
