package com.company.ext.lessons3.transport;

import com.company.ext.lessons3.transport.Air;

public class Military extends Air {
    private boolean ejection;
    private int missiles;

    public Military(int power, double maxSpeed, int mass, String brand, int wings, int stripLength, boolean ejection,int missiles) {
        super(power, maxSpeed, mass, brand, wings, stripLength);
        this.ejection = ejection;
        this.missiles = missiles;
    }

    public boolean isEjection() {
        return ejection;
    }

    public void setEjection(boolean ejection) {
        this.ejection = ejection;
    }

    public int getMissiles() {
        return missiles;
    }

    public void setMissiles(int missiles) {
        this.missiles = missiles;
    }

    public void militaryShot(int shot){
        if(shot !=0){
            System.out.println("Ракета пошла...");
        }else {
            if (shot == 0){
                System.out.println("Боеприпасы отсутствуют");
            }
        }
    }

    public  void  militaryCatapulting (boolean сatapulting){
        if (сatapulting == true){
            System.out.println("Катапультирование прошло успешно");
        }else {
            System.out.println("У вас нет такой системы ");
        }
    }
    @Override
    public String toString() {
        return super.toString() + "Military{" +
                "ejection=" + ejection +
                ", missiles=" + missiles +
                '}';
    }
}
