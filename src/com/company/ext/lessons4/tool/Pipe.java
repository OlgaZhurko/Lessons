package com.company.ext.lessons4.tool;

public class Pipe implements Tool{
    private double diameter;

    public Pipe(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Играет труба в " + KEY + " с характеристикой 'диаметр' " + getDiameter());
    }

    @Override
    public String toString() {
        return "Pipe{" +
                "diameter=" + diameter +
                '}';
    }
}
