package com.company.ext.lessons3;

public abstract class Air extends Transport{
    private int wings;
    private int stripLength;

    public Air(int power, double maxSpeed, int mass, String brand, int wings, int stripLength) {
        super(power, maxSpeed, mass, brand);
        this.wings = wings;
        this.stripLength = stripLength;
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    public int getStripLength() {
        return stripLength;
    }

    public void setStripLength(int stripLength) {
        this.stripLength = stripLength;
    }

    @Override
    public String toString() {
        return super.toString() + "Air{" +
                "wings=" + wings +
                ", stripLength=" + stripLength +
                '}';
    }
}
