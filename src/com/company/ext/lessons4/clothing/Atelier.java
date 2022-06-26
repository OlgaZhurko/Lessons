package com.company.ext.lessons4.clothing;

public class Atelier {

    public void dressMen(Clothing[] clothing4) {
        for (Clothing c : clothing4) {
            if(c instanceof Tie || c instanceof Shirt || c instanceof Pants){
                System.out.println(c);
            }
        }
    }

    public void dressWomen(Clothing[] clothing4) {
        for (Clothing c : clothing4) {
            if(c instanceof Skirt || c instanceof Shirt || c instanceof Pants){
                System.out.println(c);
            }
        }
    }
}
