package com.company.ext.lessons3.transport;

public class Cargo extends Ground {
    private int loadCapacity;

    public Cargo(int power, double maxSpeed, int mass, String brand, int wheels, double fuel, int loadCapacity) {
        super(power, maxSpeed, mass, brand, wheels, fuel);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
    public boolean cargoGoods(int goods){
        if(goods >= 3000){
            System.out.println("Грузовик загружен");
        }else {
            System.out.println("Вам нужен грузовик побольше");
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "Cargo{" +
                "loadCapacity=" + loadCapacity +
                '}';
    }
}
