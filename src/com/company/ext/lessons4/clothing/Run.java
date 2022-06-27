package com.company.ext.lessons4.clothing;

public class Run {
    public static void main(String[] args) {
        Clothing clothing = new Shirt(36,120.5,"голубой");
        Clothing clothing1 = new Skirt(38, 150.5, "красный");
        Clothing clothing2 = new Pants(40,200.4,"зеленый");
        Clothing clothing3 = new Tie(32,100.3,"желтый");
        Clothing[] clothing4 = {clothing,clothing1,clothing2,clothing3};
        Atelier atelier = new Atelier();
        //atelier.dressMen(clothing4);
        atelier.dressWomen(clothing4);
    }
}
