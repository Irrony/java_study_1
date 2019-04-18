package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {

        int sum_value=0;
        if (leftBorder < rightBorder){
            for (int i = leftBorder; i <= rightBorder; i++){
                if (i % 2 == 0){
                    sum_value += i;
                }
            }
        }
        if (leftBorder > rightBorder){
            for (int i = rightBorder; i <= leftBorder; i++){
                if (i % 2 == 0){
                    sum_value += i;
                }
            }
        }
        return sum_value;
        //throw new NotImplementedException();
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {

        int sum_value=0;
        if (leftBorder < rightBorder){
            for (int i = leftBorder; i <= rightBorder; i++){
                if (i % 2 == 0){
                    continue;
                }
                else {sum_value += i;}
            }
        }
        if (leftBorder > rightBorder){
            for (int i = rightBorder; i <= leftBorder; i++){
                if (i % 2 == 0){
                    continue;
                }
                else {sum_value += i;}
            }
        }
        return sum_value;
        //throw new NotImplementedException();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int sum_value = 0;
        for (int i = 0; i < arrayList.size(); i++){
            sum_value += arrayList.get(i)*3+2;
    }
        return sum_value;
        //throw new NotImplementedException();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {

        for (int i = 0; i < arrayList.size(); i++){
            if (arrayList.get(i) % 2 == 0){
                continue;
            }
            else {
                arrayList.set(i,arrayList.get(i)*3+2);}
        }
        return arrayList;
        //throw new NotImplementedException();
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {

        int sum_value = 0;
        for (int i = 0; i < arrayList.size(); i++){
            if (arrayList.get(i) % 2 == 0){
                continue;
            }
            else {sum_value += (arrayList.get(i)*3)+5;}
        }
        return sum_value;
        //throw new NotImplementedException();
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        double median_value = 0.0,sum_value = 0.0;
        List<Integer> result = new ArrayList<>() ;
        for (int i = 0; i < arrayList.size(); i++){
            if (arrayList.get(i) % 2 ==0){
                result.add(arrayList.get(i));
            }
        }
        for (int j = 0; j < result.size(); j++){
            sum_value += result.get(j);
            median_value = sum_value/2;
        }
        return median_value;
        //throw new NotImplementedException();
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        double median_value = 0.0,sum_value = 0.0;
        List<Integer> result = new ArrayList<>() ;
        for (int i = 0; i < arrayList.size(); i++){
            if (arrayList.get(i) % 2 ==0){
                result.add(arrayList.get(i));
            }
        }
        for (int j = 0; j < result.size(); j++){
            sum_value += result.get(j);
        }
        median_value = sum_value/result.size();
        return median_value;
        //throw new NotImplementedException();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++){
            if (arrayList.get(i) % 2 ==0){
                result.add(arrayList.get(i));
            }
        }
        for (int j = 0; j < result.size(); j++){
            if (result.get(j).equals(specialElment)){
                return true;
            }
            else {return false;}
        }
        //return Arrays.asList(result).contains(specialElment);
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arrayList.size()-1; i++){
            if (arrayList.get(i).equals(arrayList.get(i+1))){
                arrayList.remove(i);
            }
            if (arrayList.get(i) % 2 ==0){
                result.add (arrayList.get(i));
            }
        }
        return result;
        //throw new NotImplementedException();
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> result = new ArrayList<>();
        List<Integer> result1 = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++){
            if (arrayList.get(i) % 2 ==0){
                result1.add(arrayList.get(i));
            }
            else { result2.add(arrayList.get(i));}
        }
        for (int p = 0; p < result1.size();p++){
            result.add(result1.get(p));
        }
        for(int i=0;i<result2.size();i++) {
            for(int j=0;j<result2.size()-i-1;j++) {
                if(result2.get(j)<result2.get(j+1)) {
                    Integer temp =result2.get(j);
                    Integer temp_1=result2.get(j+1);
                    result2.set(j,temp_1);
                    result2.set(j+1,temp);
                }
            }
        }
        for (int q = 0; q < result2.size();q++){
            result.add(result2.get(q));
        }
        return result;
        //throw new NotImplementedException();
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> result = new ArrayList<>() ;
        for (int i = 0; i < arrayList.size()-1; i++) {
            if (arrayList.get(i) % 2 == 0) {
                continue;
            } else {
                arrayList.set(i, (arrayList.get(i) + arrayList.get(i + 1)) * 3);
            }
        }
        for (int j = 0; j < arrayList.size()-1; j++){
            result.add(arrayList.get(j));
        }
        return result;
        //throw new NotImplementedException();
    }
}
