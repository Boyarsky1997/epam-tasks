package com.github.boyarsky1997.task.collections;


import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;

import java.util.ArrayList;
import java.util.List;

public class MyListBenchmark {

    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(args);
    }

    @Benchmark
    @Fork(value = 1, warmups = 2)
    @BenchmarkMode(Mode.Throughput)
    public void testMyList() {
        MyList myList = new MyList();
        for (int i = 0; i < 1_000; i++) {
            myList.add("hello");
        }
    }

    @Benchmark
    @Fork(value = 1, warmups = 2)
    @BenchmarkMode(Mode.Throughput)
    public void testArrayList() {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < 1_000; i++) {
            stringList.add("hello");
        }
    }
    @Benchmark
    @Fork(value = 1, warmups = 2)
    @BenchmarkMode(Mode.Throughput)
    public void testVitalikList() {
        VitalikList stringList = new VitalikList();
        for (int i = 0; i < 1_000; i++) {
            stringList.add("hello");
        }
    }

}