package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InverseReduce {

    private Random random = new Random();

    public InverseReduce() {}

    public InverseReduce(Random random) {
        this.random = random;
    }

    public List<Integer> divideToSmaller(int number) {
        List<Integer> resultlist = new ArrayList<>();
        for (int i = 0; i < 4;i++){
            number -= 2;
            resultlist.add(number);
        }
        return resultlist;
        //throw new NotImplementedException();
    }
}
