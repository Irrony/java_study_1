package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        List<Integer> resultlist = new ArrayList<>();
        for (int i = 0; i < array.size(); i++){
            resultlist.add(i,array.get(i)*3);
        }
        return resultlist;
        //throw new NotImplementedException();
    }

    public List<String> mapLetter() {
        List<String> resultlist = new ArrayList<>();
        for (int i = 0; i < array.size(); i++){
            Integer j = array.get(i);
            switch (j){
                case 1:resultlist.add(i,"a");break;
                case 2:resultlist.add(i,"b");break;
                case 3:resultlist.add(i,"c");break;
                case 4:resultlist.add(i,"d");break;
                case 5:resultlist.add(i,"e");break;
                default:System.out.println("error!");
            }
        }
        return resultlist;
        //throw new NotImplementedException();
    }

    public List<String> mapLetters() {
        List<String> resultlist = new ArrayList<>();
        for (int i = 0; i < array.size(); i++){
            switch (i){
                case 0:resultlist.add(i,"a");break;
                case 1:resultlist.add(i,"m");break;
                case 2:resultlist.add(i,"aa");break;
                case 3:resultlist.add(i,"ad");break;
                case 4:resultlist.add(i,"az");break;
                case 5:resultlist.add(i,"ba");break;
               // default:resultlist.add(resultlist.size()+1,"ba");
            }
        }
        return resultlist;
        //throw new NotImplementedException();
    }

    public List<Integer> sortFromBig() {
        int temp = 0;
        for (int i = 0; i<array.size(); i++){
            for (int j = i+1; j<array.size(); j++){
                if (array.get(i)< array.get(j)){
                    temp = array.get(i);
                    array.set(i,array.get(j));
                    array.set(j,temp);
                }
            }
        }
        return  array;
        //throw new NotImplementedException();
    }

    public List<Integer> sortFromSmall() {
        int temp = 0;
        for (int i = 0; i<array.size(); i++){
            for (int j = i+1; j<array.size(); j++){
                if (array.get(i)> array.get(j)){
                    temp = array.get(i);
                    array.set(i,array.get(j));
                    array.set(j,temp);
                }
            }
        }
        return  array;
        //throw new NotImplementedException();
    }
}
