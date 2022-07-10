package com.company.ext.lessons7.consumer;

public class HeavyBox {
    private int n;

    public HeavyBox(int n) {
        this.n = n;
    }

    public HeavyBox() {
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "n=" + n +
                '}';
    }
}
