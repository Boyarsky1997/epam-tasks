package com.github.boyarsky1997.task.annotation;

import com.github.boyarsky1997.task.annotation.annotations.FieldAnnotation;

public class MyClass {
    @FieldAnnotation(name = "name",value = 3)
    private String name;
    @FieldAnnotation(name = "111",value = 2)
    public String surname;
    public int year;

    @Override
    public String toString() {
        return "MyFieldClass{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                '}';
    }

    public MyClass(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
