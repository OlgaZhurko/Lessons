package com.company.ext.lessons4.tool;

public class Drum implements Tool{
    private String size;

    public Drum(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Играет барабан в " + KEY + " с характеристикой 'размер' " + getSize());
    }

    @Override
    public String toString() {
        return "Drum{" +
                "size='" + size + '\'' +
                '}';
    }
}
