package com.github.boyarsky1997.task.generic;

public class Droid {
    private String name;


    public Droid(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "name " + name;
    }

}
