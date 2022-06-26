package com.company.ext.lessons4.student;

public class Run {
    public static void main(String[] args) {
        Student student = new Student("Petr", "Petrov", "Group1", 9);
        Aspirant aspirant = new Aspirant("Ira","ivanova", "Group2", 4,"Work1");
        Student aspirant1 = new Aspirant("Sasha", "Fedin", "Group3", 10, "Work2");
        Student[] students = {student, aspirant, aspirant1};
        for (Student s: students){
            System.out.println(s.getSchoolarship());
        }

    }

}
