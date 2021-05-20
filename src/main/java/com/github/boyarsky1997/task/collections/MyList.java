package com.github.boyarsky1997.task.collections;

import java.util.Arrays;

public class MyList {

    private String[] array;
    private int maxIndex;

    public MyList() {
        this.array = new String[100];
        this.maxIndex=0;
    }

    public MyList(String[] array) {
        this.array = array;
        this.maxIndex=array.length;
    }

    public void add(String addLine) {
        if (maxIndex >= array.length) {
            array = Arrays.copyOf(array, array.length + (array.length / 2));
        }

        array[maxIndex] = addLine;
        maxIndex++;
    }

    public String get(int index) throws Exception {
        return array[index];
    }

}
