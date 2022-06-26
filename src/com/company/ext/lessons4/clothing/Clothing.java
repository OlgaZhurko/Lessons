package com.company.ext.lessons4.clothing;

public abstract class Clothing {
    private int size;
    private double summa;
    private String color;

    public Clothing(int size, double summa, String color) {
        this.size = size;
        this.summa = summa;
        this.color = color;
    }

    public Clothing() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getSumma() {
        return summa;
    }

    public void setSumma(double summa) {
        this.summa = summa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "size=" + size +
                ", summa=" + summa +
                ", color='" + color + '\'' +
                '}';
    }
}
