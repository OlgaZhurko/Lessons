package com.company.ext.lessons3.transport;

public abstract class Transport {
    private int power;
    private double maxSpeed;
    private int mass;
    private String brand;

    public Transport(int power, double maxSpeed, int mass, String brand){
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.mass = mass;
        this.brand = brand;
    }

    private String getPowerKilowatt(){
        return "" + this.power * 0.74;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", mass=" + mass +
                ", brand='" + brand + '\'' +
                '}';
    }
}
