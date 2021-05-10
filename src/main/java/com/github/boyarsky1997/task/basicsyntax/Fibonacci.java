package com.github.boyarsky1997.task.basicsyntax;

import com.github.boyarsky1997.task.exceptions.MyExceptionClass;

public class Fibonacci {

    private final int oneNumber;
    private final int twoNumber;
    private final int n;

    public Fibonacci(int oneNumber, int twoNumber, int n) {
        this.oneNumber = oneNumber;
        this.twoNumber = twoNumber;
        this.n = n;
    }

    public long[] numberFibonacci() throws MyExceptionClass {
        long[] tmp = new long[n];
        tmp[0] = oneNumber;
        tmp[1] = twoNumber;
        for (int i = 2; i < tmp.length; i++) {


            if ( tmp[i - 1] + tmp[i - 2]>400){
                throw new MyExceptionClass("MyExceptionClass");
            }
            tmp[i] = tmp[i - 1] + tmp[i - 2];
        }

        return tmp;
    }

    public void printPercentage() throws MyExceptionClass {
        long odd = 0;
        long even = 0;
        for (long ma : numberFibonacci()) {
            if (ma % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        double e = (100.0 * even) / (even + odd);
        double o = 100.0 - e;
        System.out.println("Even: " + e);
        System.out.println("Odd: " + o);
    }

}
