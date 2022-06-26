package com.company.ext.lessons3.transport;

public class Run3 {
    public static void main(String args[]){
        Transport transport = new Passenger(150, 250, 2800, "Audi", 4, 12.5, "sedan",5);
        String tur = transport.toString();
        System.out.println(tur);
        Passenger passenger = new Passenger(150, 250, 2800, "Audi", 4, 12.5, "sedan",5);
        passenger.counting(360);
       Cargo cargo =  new Cargo(120,240,3000, "Mercedes", 4, 12.5, 6 );
        Boolean tr = cargo.cargoGoods(2500);
        System.out.println(tr);


    }
}
