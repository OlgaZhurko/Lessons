package com.company.ext.lessons4.seasons;

public enum Seasons {
    WINTER(-25.2),
    SPRING(15.6),
    SUMMER(28.2){
        @Override
        public String getDescription() {
           return "Теплое время года";
        }
    },
    AUTUMN(10.1);
    private double tem;

    Seasons(double tem) {
        this.tem = tem;
    }

    public double getTem() {
        return tem;
    }

    public void setTem(double tem) {
        this.tem = tem;
    }
    public String getDescription(){
        return "Холодное время года";
    }
}
