package com.github.boyarsky1997.task.basicsyntax;

import org.junit.Assert;
import org.junit.Test;

public  class FibonacciTest {
    @Test
    public void testNumberFibonacci() {
      Fibonacci fibonacci = new Fibonacci(1,2,4);

        long[] actual = fibonacci.numberFibonacci();

        Assert.assertEquals(4,actual.length);
        Assert.assertEquals(1,actual[0]);
        Assert.assertEquals(2,actual[1]);
        Assert.assertEquals(3,actual[2]);
        Assert.assertEquals(5,actual[3]);
    }
}