package com.company.ext.lessons3;

public class Passenger extends Ground{
    private String bodyType;
    private int pass;

    public Passenger(int power, double maxSpeed, int mass, String brand, int wheels, double fuel, String bodyType, int pass) {
        super(power, maxSpeed, mass, brand, wheels, fuel);
        this.bodyType = bodyType;
        this.pass = pass;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public boolean counting(double second){
        double passes = getMaxSpeed() * (second/60/60);
        System.out.println("Машина проедет " + passes + " км и израсходует " + fuelConsumption(passes) + " топлива.");
        return false;
    }

    private double fuelConsumption(double passes){
        return passes/100*getFuel();
    }

    @Override
    public String toString() {
        return super.toString() + "Passenger{" +
                "bodyType=" + bodyType +
                ", pass=" + pass +
                '}';
    }
}

