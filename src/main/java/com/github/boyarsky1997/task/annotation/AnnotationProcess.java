package com.github.boyarsky1997.task.annotation;

import com.github.boyarsky1997.task.annotation.annotations.FieldAnnotation;

import java.lang.reflect.Field;

public class AnnotationProcess {
    public static void main(String[] args) {
        inspectMyFieldClassName(MyClass.class);
        MyClass myFieldClass = new MyClass("name", "surname", 12);

    }

    static void inspectMyFieldClass(Class<?> myFieldClass) {
        for (Field field : myFieldClass.getFields()) {
            if (field.isAnnotationPresent(FieldAnnotation.class)) {
                System.out.println(field);
            } else {
                System.out.println("Немає");
            }
        }
    }

    static void inspectMyFieldClassName(Class<?> myFieldClass) {
        for (Field field : myFieldClass.getDeclaredFields()) {
            if (field.isAnnotationPresent(FieldAnnotation.class)) {
                System.out.println(field.getName() + " : name= " + field.getAnnotation(FieldAnnotation.class).name());
            } else {
                System.out.println("Немає");
            }
        }
    }
}
