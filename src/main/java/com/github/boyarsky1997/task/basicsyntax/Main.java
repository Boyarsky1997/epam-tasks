package com.github.boyarsky1997.task.basicsyntax;

import com.github.boyarsky1997.task.exceptions.MyExceptionClass;

import java.util.Arrays;

/**
 * Compile and run java app from console.
 * Write program, which will pass requirements:
 * - User enter the interval (for example: [1;100]);
 * - Program prints odd numbers from start to the end of interval and even from end to start;
 * Program prints the sum of odd and even numbers;
 * Program build Fibonacci numbers: F1 will be the biggest odd number and F2 – the biggest even number, user can enter the size of set (N);
 * Program prints percentage of odd and even Fibonacci numbers;
 * Object-Oriented analysis and design.
 */
public class Main {
    public static void main(String[] args) {
        Sequence sequence = new Sequence(43, 55);
//        System.out.println("Odd: " + Arrays.toString(sequence.getOddArray()));
//        System.out.println("Even: " + Arrays.toString(sequence.getEvenArray()));
//        System.out.println("Sum odd: " + sequence.sumOdd());
//        System.out.println("Sum even: " + sequence.sumEven());
        System.out.println("Max odd: " + sequence.maxOdd());
        System.out.println("Max even: " + sequence.maxEven());

        Fibonacci fibonacci = new Fibonacci(sequence.maxEven(), sequence.maxOdd(), 6);
        try {
            System.out.println("Fibonacci: " + Arrays.toString(fibonacci.numberFibonacci()));
        }catch (MyExceptionClass e){
            System.out.println(e.toString());
        }

    }

}
