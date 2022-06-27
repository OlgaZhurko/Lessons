package com.company.ext.lessons4.tool;

public class Guitar implements Tool{
    private int strings;

    public Guitar(int strings) {
        this.strings = strings;
    }

    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара в " + KEY + " с характеристикой 'количеством струн' " + getStrings());
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "strings=" + strings +
                '}';
    }
}
