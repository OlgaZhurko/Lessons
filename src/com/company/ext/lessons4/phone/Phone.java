package com.company.ext.lessons4.phone;

public class Phone {
    private int number;
    private String model;
    private double weight;

    public Phone() {
    }

    public Phone(int number, String model) {
        this(number, model, 0.0);
        this.number = number;
        this.model = model;

    }
    public Phone(int number, String model, double weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void receiveCall(String name){
        System.out.println("Звонит " + name);
    }

    public void sendMessage(int...numbers) {
        for (int number : numbers) {
            System.out.println("Сообщение отправлено номеру: " + number);
        }
    }
        public void receiveCall (String name,int number){
            System.out.println("Звонит " + name);
            System.out.println("Его номер " + number);
        }

        @Override
        public String toString () {
            return "Phone " +
                    " number=" + number +
                    ", model='" + model + '\'' +
                    ", weight=" + weight;
        }

}
