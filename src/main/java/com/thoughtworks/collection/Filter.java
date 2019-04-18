package com.thoughtworks.collection;

import jdk.nashorn.internal.runtime.arrays.IntElements;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> resultlist= array.stream().filter(item->item % 2 == 0).collect(Collectors.toList());
        return resultlist;
        //throw new NotImplementedException();
         }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> resultlist = array.stream().filter(item -> item % 3 ==0).collect(Collectors.toList());
        return resultlist;
        //throw new NotImplementedException();
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        return firstList.stream()
                .filter(item1 -> secondList.stream().anyMatch(item2-> item2.equals(item1)))
                .collect(Collectors.toList());
        //throw new NotImplementedException();
    }

    public List<Integer> getDifferentElements() {
        List<Integer> resultlist = array.stream().distinct().collect(Collectors.toList());
        return resultlist;
        //throw new NotImplementedException();
    }
}