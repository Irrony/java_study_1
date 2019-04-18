package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        List<Integer> resultlist = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int n = i+j;
                resultlist.add(i+j,array[i][j]) ;
            }
        }
        return resultlist;
        //throw new NotImplementedException();
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        List<Integer> resultlist = new ArrayList<>();
        List<Integer> resultlist1 = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
                resultlist.addAll(Arrays.asList(array[i]));
                for (int j = 0; j < array[i].length; j++){
                    if (resultlist.contains(array[i][j])){
                        continue;
                    }
                    else {resultlist.addAll(Arrays.asList(array[i+1][j]));}
                }
        }
        for (int k = 0; k < resultlist.size(); k++){
            if (!(resultlist1.contains(resultlist.get(k)))){
                resultlist1.add(resultlist.get(k));
            }
        }
        return resultlist1;
        //throw new NotImplementedException();
    }
}
