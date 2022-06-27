package com.company.ext.lessons4.printable;

public class Book implements Printable{
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Печатаю " + getName());

    }

    public static void printBooks(Printable[] printable){
    for (Printable p : printable) {
        if (p instanceof Book)
            p.print();
    }
}
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}
