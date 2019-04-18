package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {

        List<Integer> resultlist = new ArrayList<>();
        if (left < right){
            for(int i = left; i <=right; i++) {
                resultlist.add(i);
            }
        }
        else {
            for(int i = right; i <=left; i++) {
                resultlist.add(i);
            }
            for(int i=0;i<resultlist.size();i++) {
                for(int j=0;j<resultlist.size()-i-1;j++) {
                    if(resultlist.get(j)<resultlist.get(j+1)) {
                        Integer temp =resultlist.get(j);
                        Integer temp_1=resultlist.get(j+1);
                        resultlist.set(j,temp_1);
                        resultlist.set(j+1,temp);
                    }
                }
            }
        }
        return resultlist;
        //throw new NotImplementedException();
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> resultlist = new ArrayList<>();
        if (left < right){
            for(int i = left; i <=right; i++) {
                if (i % 2 ==0){resultlist.add(i);}
            }
        }
        else {
            for(int k = right; k <=left; k++) {
                if (k % 2 ==0){resultlist.add(k);}
            }
            for(int i=0;i<resultlist.size();i++) {
                for(int j=0;j<resultlist.size()-i-1;j++) {
                    if(resultlist.get(j)<resultlist.get(j+1)) {
                        Integer temp =resultlist.get(j);
                        Integer temp_1=resultlist.get(j+1);
                        resultlist.set(j,temp_1);
                        resultlist.set(j+1,temp);
                    }
                }

            }
        }

        return resultlist;
        //throw new NotImplementedException();
    }


    public List<Integer> popEvenElments(int[] array) {
        List<Integer> resultlist = new ArrayList<>();
        for (int i=0; i< array.length; i++){
            if (array[i] % 2 ==0){
                resultlist.add(array[i]);
            }
        }
        return resultlist;
        //throw new NotImplementedException();
    }

    public int popLastElment(int[] array) {
        int element = 0,len = array.length;
        element = array[len-1];
        return element;
        // throw new NotImplementedException();
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> resultlist = new ArrayList<>();
        for (int i = 0; i < firstArray.length; i++){
            for (int j = 0; j < secondArray.length; j++){
                if (firstArray[i]==secondArray[j]){
                    resultlist.add(firstArray[i]);
                }
            }
        }
        return resultlist;
        //throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> resultlist = new ArrayList<>();
        for (int i = 0; i < firstArray.length; i++){
            resultlist.add(firstArray[i]);
        }
            for (int j = 0; j < secondArray.length; j++){
                if (resultlist.contains(secondArray[j])){
                    continue;
                }
                else {resultlist.add(secondArray[j]);}
            }
        return resultlist;
        //throw new NotImplementedException();
    }
}
