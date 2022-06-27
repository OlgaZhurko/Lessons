package com.company.ext.lessons4.student;

public class Aspirant extends Student{
    private String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    public Aspirant() {
    }

    public String getScientificWork() {
        return scientificWork;
    }

    public void setScientificWork(String scientificWork) {
        this.scientificWork = scientificWork;
    }

    @Override
    public double getSchoolarship() {

        return getAverageMark() >= 9 && getAverageMark() <= 10 ? 200 : getAverageMark() < 9 && getAverageMark() >= 5 ? 180 : 0;

    }

    @Override
    public String toString() {
        return super.toString() + "scientificWork='" + scientificWork + '\'';
    }
}
