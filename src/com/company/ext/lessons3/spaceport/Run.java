package com.company.ext.lessons3.spaceport;

public class Run {
    public static void main(String[] args) {
       IStart start = new Shuttle();
       Spaceport spaceport = new Spaceport();
       spaceport.launch(start);

    }
}
