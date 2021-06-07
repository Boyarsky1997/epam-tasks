package com.github.boyarsky1997.task.annotation;

public class Demo implements Cloneable {
    private final String value = "Value";
    public int id = 1;
    private String name = "PrintDemo";

    public void myMethod(String a, int[] array) {
        System.out.println("method with two arguments");
    }

    public void myMethod(String[] array) {
        System.out.println("method with one arguments");
    }
}
