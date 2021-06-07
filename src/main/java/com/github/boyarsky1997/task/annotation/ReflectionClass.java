package com.github.boyarsky1997.task.annotation;

public class ReflectionClass {
    public static String method3(String surname) {
        surname = "Boyarski";
        return surname;
    }

    public void method1() {
        System.out.println("Hello ");
    }

    private String method2(String name) {
        return name + " B";
    }
}
