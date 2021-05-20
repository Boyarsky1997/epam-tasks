package com.github.boyarsky1997.task.collections;

import java.util.Comparator;

public class X implements Comparator<MyClass> {

    @Override
    public int compare(MyClass o1, MyClass o2) {
        int sComp = o1.getNameCountry().compareTo(o2.getNameCountry());
        if (sComp != 0) {
            return sComp;
        }

       return o1.getNameCapital().compareTo(o2.getNameCapital());
    }
}
