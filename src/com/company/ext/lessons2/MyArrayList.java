package com.company.ext.lessons2;


import java.util.Arrays;

public class MyArrayList {
    private Integer con;
    private Integer[] arr;

    public MyArrayList() {
        con = 16;
        arr = new Integer[con];
    }

    public boolean add(int i) {
        for (int j = 0; j < con; j++) {
            if (j < con * 0.75 - 1) {
                if (arr[j] == null) {
                    arr[j] = i;
                    return true;
                }
            }else {
                Integer[] copy = arr.clone();
                con *= 2;
                arr = new Integer[con];
                for (int f = 0; f < copy.length; f++){
                    arr[f] = copy[f];
                }j--;
            }
        }
        return false;
    }
    public boolean remove(int index) {
        if (con - 1 > index) {
            Integer[] newArr = new Integer[con];
            int j = 0;
            for(int i = 0; i < con; i++){
                if(i == index){
                    continue;
                }else {
                    if (arr[i] == null){
                        for (int s = 0; s < newArr.length; s++){
                            arr[s] = newArr [s];
                        }
                        return true;
                    }else {
                        newArr[j] = arr[i];
                        j++;
                    }
                }
            }
        }
        return false;
    }
    public void sort(){
        Integer[] newArr = metod();
        for (int i = 0; i < newArr.length; i++){
            newArr[i] = arr[i];
        }
        for (int i = 0; i < newArr.length; i++){
            if((i+1) != newArr.length && newArr[i] > newArr[i+1]){
               int m;
                m = newArr[i];
                newArr[i] = newArr[i+1];
                newArr[i+1] = m;
                i=-1;
            }
        }
        arr = newArr;
    }
   private  Integer[] metod(){
        int arraySize = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arraySize = i;
               break;
            }

        }
        Integer[] newArraySize = new Integer[arraySize];
        for (int i = 0; i < newArraySize.length; i++) {
            newArraySize[i] = arr[i];
        }return newArraySize;
    }
    @Override
    public String toString() {
        return "MyArrayList{" +
                Arrays.toString(arr) +
                '}';
    }
}