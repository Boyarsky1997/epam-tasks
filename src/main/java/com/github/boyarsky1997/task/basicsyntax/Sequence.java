package com.github.boyarsky1997.task.basicsyntax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Sequence implements Iterable<Integer> {

    private final int[] array;

    public Sequence(int start, int finish) {
        this(Sequence.createArray(start, finish));
    }

    public Sequence(int[] array) {
        this.array = array;
    }

    private static int[] createArray(int start, int finish) {
        int[] result = new int[finish - start];
        for (int i = 0; i < result.length; i++) {
            result[i] = start++;
        }

        return result;
    }

    private static int[] asPrimitiveArray(List<Integer> list) {
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    private static int sum(int[] array) {
        int sum = 0;
        for (Integer item : array) {
            sum = sum + item;
        }

        return sum;
    }

    private static int max(int[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    public int[] getEvenArray() {
        List<Integer> list = new ArrayList<Integer>();
        for (int item : array) {
            if (item % 2 == 0) {
                list.add(item);
            }
        }

        return Sequence.asPrimitiveArray(list);
    }

    public int[] getOddArray() {
        List<Integer> list = new ArrayList<Integer>();
        for (int item : array) {
            if (item % 2 != 0) {
                list.add(item);
            }
        }

        return Sequence.asPrimitiveArray(list);
    }

    public int sumEven() {
        return Sequence.sum(this.getEvenArray());
    }

    public int sumOdd() {
        return Sequence.sum(this.getOddArray());
    }

    public int maxOdd() {
        return Sequence.max(this.getOddArray());
    }

    public int maxEven() {
        return Sequence.max(this.getEvenArray());
    }

    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            private int index = -1;

            public boolean hasNext() {
                return ++index < array.length;
            }

            public Integer next() {
                return array[index];
            }

            public void remove() {
                throw new IllegalStateException("method not supported");
            }
        };
    }

}
