package com.github.boyarsky1997.task.generic;

import java.util.ArrayList;
import java.util.List;

public class MainTest2 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<Integer>();
        integers.add(5);
        List objects = integers;
        Object r = "roman";
        objects.add(r);
        System.out.println(objects);
        System.out.println(integers);
        System.out.println(objects.get(0));
        System.out.println(objects.get(1));
        System.out.println(integers.get(0));
        System.out.println(integers.get(1));
        Object o=objects.get(1);
        Integer o1=integers.get(1);

    }
}
