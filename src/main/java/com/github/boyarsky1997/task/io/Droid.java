package com.github.boyarsky1997.task.io;

import java.io.Serializable;

public class Droid implements Serializable {
    private String name;
    private transient int age;

    public Droid(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Droid{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
