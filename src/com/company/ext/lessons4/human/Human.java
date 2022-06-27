package com.company.ext.lessons4.human;

public class Human {
    private String fullName;
    private int age;

    public Human(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    public Human() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public  void move(){
        System.out.println(fullName + " говорит, что ему " + age + " лет");
    }

    public void talk(){
        System.out.println(fullName + " говорит, что ему " + age + " лет");
    }

    @Override
    public String toString() {
        return  "Human{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }
}
