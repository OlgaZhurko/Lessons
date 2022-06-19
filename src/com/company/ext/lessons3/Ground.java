package com.company.ext.lessons3;

public abstract class Ground extends Transport{
    private int wheels;
    private double fuel;

    public Ground(int power, double maxSpeed, int mass, String brand, int wheels, double fuel) {
        super(power, maxSpeed, mass, brand);
        this.wheels = wheels;
        this.fuel =fuel;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return super.toString() + "Ground{" +
                "wheels=" + wheels +
                ", fuel=" + fuel +
                '}';
    }
}
