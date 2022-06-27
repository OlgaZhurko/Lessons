package com.company.ext.lessons4.printable;

public class Magazine implements Printable{
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    public Magazine() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Продается " + getName());
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                '}';
    }
    public static void printMagazines(Printable[] printable){
        for (Printable p : printable) {
            if (p instanceof Magazine)
                p.print();
        }

    }
}
