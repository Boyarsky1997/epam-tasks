package com.github.boyarsky1997.task.collections;

import java.util.Comparator;

public class ComparatorCountry implements Comparator<MyClass> {
    @Override
    public int compare(MyClass o1, MyClass o2) {
        return o1.getNameCountry().compareTo(o2.getNameCountry());
    }
}
