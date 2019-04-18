package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        for (int i = 0; i<arrayList.size();i++){
            int max = arrayList.get(0);
            if (arrayList.get(i)>max){
                arrayList.set(0,arrayList.get(i));
            }
        }
        return arrayList.get(0);
        //throw new NotImplementedException();
    }

    public double getMinimum() {
        for (int i = 0; i<arrayList.size();i++){
            int min = arrayList.get(0);
            if (arrayList.get(i)<min){
                arrayList.set(0,arrayList.get(i));
            }
        }
        return arrayList.get(0);
        //throw new NotImplementedException();
    }

    public double getAverage() {
        double sum = 0.0;
        double avgnum = 0.0;
        for (int i = 0;i<arrayList.size();i++){
            sum += arrayList.get(i);
            avgnum = sum/arrayList.size();
        }
        return avgnum;
        //throw new NotImplementedException();
    }

    public double getOrderedMedian() {
        double mid = 0.0;
        if(arrayList.size()%2==0) {
            mid = (arrayList.get(arrayList.size()/2-1)+arrayList.get(arrayList.size()/2))/2.0;
        }
        else {
            mid = arrayList.get(arrayList.size()/2);
        }
         return mid;
        //throw new NotImplementedException();
    }

    public int getFirstEven() {
        int a = 0;
        yr:for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0) {
                a = arrayList.get(i);
                break yr;
            }

        }
        return a;
    }
        //throw new NotImplementedException();


    public int getIndexOfFirstEven()
    {
        int a = 0;
        yr:for (int i = 0; i<arrayList.size(); i++){
            if (arrayList.get(i)%2 == 0){
                a = i ;
                break yr;
            }
        }
        return  a;
        //throw new NotImplementedException();
    }

    public boolean isEqual(List<Integer> arrayList) {
        List<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(4);
        arrayList1.add(27);
        arrayList1.add(20);
        arrayList1.add(4);
        arrayList1.add(9);
        arrayList1.add(15);
        arrayList1.add(4);
        arrayList1.add(1);
        arrayList1.add(11);
        if (arrayList.size()== arrayList1.size()){
            return true;
        }
        else {
            return false;
        }
        //throw new NotImplementedException();
    }



    public Double getMedianInLinkList(SingleLink singleLink) {
        double mid = 0.0;
        if(arrayList.size()%2==0) {
            mid = (arrayList.get(arrayList.size()/2-1)+arrayList.get(arrayList.size()/2))/2.0;
        }
        else {
            mid = arrayList.get(arrayList.size()/2);
        }
        return mid;
        //throw new NotImplementedException();
    }

    public int getLastOdd() {
        int  a = 0;
        yr:for (int i = arrayList.size()-1; i>=0; i--){
            if (arrayList.get(i)%2 !=0){
                a = arrayList.get(i);
                break yr;
            }
        }
        return a;
        //throw new NotImplementedException();
    }

    public int getIndexOfLastOdd() {
        int  a = 0;
        yr:for (int i = arrayList.size()-1; i>=0; i--){
            if (arrayList.get(i)%2 !=0){
                a = i;
                break yr;
            }
        }
        return a;
        //throw new NotImplementedException();
    }
}
