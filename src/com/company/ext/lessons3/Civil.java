package com.company.ext.lessons3;

public class Civil extends Air{
    private int namPass;
    private boolean businessClass;

    public Civil(int power, double maxSpeed, int mass, String brand, int wings, int stripLength, int namPass,boolean businessClass) {
        super(power, maxSpeed, mass, brand, wings, stripLength);
        this.namPass = namPass;
        this.businessClass = businessClass;
    }

    public int getNamPass() {
        return namPass;
    }

    public void setNamPass(int namPass) {
        this.namPass = namPass;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }

    public void civilPass(int pass){
        if(pass == 250){
            System.out.println("Самолет загружен");
        }else {
            if (pass < 250){
                System.out.println("Самелет летит с недостаточным количеством пассажиров");
            }else {
                if(pass > 250){
                    System.out.println("Самолет перегружен");
                }
            }

        }
    }
    @Override
    public String toString() {
        return super.toString() + "Civil{" +
                "namPass=" + namPass +
                ", businessClass=" + businessClass +
                '}';
    }
}
