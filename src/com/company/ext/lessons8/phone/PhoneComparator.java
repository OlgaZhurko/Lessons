package com.company.ext.lessons8.phone;

import java.util.Comparator;

public class PhoneComparator implements Comparator<Phone> {
    @Override
    public int compare(Phone o1, Phone o2) {
        int result = o1.getModel().compareTo(o2.getModel());
        if (result != 0){
            return result;
        }else {
            return Double.compare(o1.getWeight(),o2.getWeight());
        }
    }
}
