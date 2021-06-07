package com.github.boyarsky1997.task.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class InformationMain {
    public static void main(String[] args) {
        info();

    }

    static void info() {
        System.out.println("Class methods:");
        Class<String> clazz = String.class;
        for (Method declaredMethod : clazz.getDeclaredMethods()) {
            System.out.println(declaredMethod.getName());
        }
        System.out.println("Class fields:");
        for (Field declaredField : clazz.getDeclaredFields()) {
            System.out.println(declaredField.getName());
        }

        System.out.println("Class constructors:");
        for (Constructor<?> declaredConstructor : clazz.getDeclaredConstructors()) {
            System.out.println(declaredConstructor.getName());
        }
        System.out.println("Class annotations:");
        for (Annotation declaredAnnotation : clazz.getDeclaredAnnotations()) {
            System.out.println(declaredAnnotation.annotationType().getName());
        }

    }

}
