package com.company.ext.lessons5.array;

import java.util.Arrays;

public class MyArrayList <T> implements List<T> {
    private Integer con;
    private Object[] arr;

    public MyArrayList() {
        con = 16;
        arr = new Object[con];
    }

    private  Object[] metod(){
        int arraySize = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arraySize = i;
                break;
            }
        }
        Object[] newArraySize = new Object[arraySize];
        for (int i = 0; i < newArraySize.length; i++) {
            newArraySize[i] = arr[i];
        }return newArraySize;
    }

    @Override
    public boolean remove(int index) {
        if (con - 1 > index && index>0) {
            Object[] newArr = new Object[con];
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
        }else {

            try {
                throw new MyException("Ошибка");
            } catch (MyException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }

        }
        return false;
    }

    @Override
    public boolean add(T i) {
        for (int j = 0; j < con; j++) {
            if (j < con * 0.75 - 1) {
                if (arr[j] == null) {
                    arr[j] = i;
                    return true;
                }
            }else {
                Object[] copy = arr.clone();
                con *= 2;
                arr = new Object[con];
                for (int f = 0; f < copy.length; f++){
                    arr[f] = copy[f];
                }j--;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "con=" + con +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }
}
//    public void sort(){
//        Integer[] newArr = metod();
//        for (int i = 0; i < newArr.length; i++){
//            newArr[i] = arr[i];
//        }
//        for (int i = 0; i < newArr.length; i++){
//            if((i+1) != newArr.length && newArr[i] > newArr[i+1]){
//                int m;
//                m = newArr[i];
//                newArr[i] = newArr[i+1];
//                newArr[i+1] = m;
//                i=-1;
//            }
//        }
//        arr = newArr;
//    }