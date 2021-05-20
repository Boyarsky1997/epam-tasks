package com.github.boyarsky1997.task.collections;

import java.util.Comparator;
import java.util.List;

public class MainGenerator {
    public static void main(String[] args) throws Exception {
        Generator generator = new Generator("src\\main\\resources\\Country.txt");
        List<MyClass> list = generator.generator();

        Comparator<MyClass> compareByName = Comparator
                .comparing(MyClass::getNameCountry)
                .thenComparing(MyClass::getNameCapital);

        list.sort(new X());

        list.forEach(System.out::println);
    }
}
