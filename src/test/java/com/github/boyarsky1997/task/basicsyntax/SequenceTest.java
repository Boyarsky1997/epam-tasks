package com.github.boyarsky1997.task.basicsyntax;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SequenceTest extends TestCase {

    @Test
    public void testCreateArray() {

        int[] actual = Sequence.createArray(2, 5);

        Assert.assertEquals(3, actual.length);
        Assert.assertEquals(2, actual[0]);
        Assert.assertEquals(3, actual[1]);
        Assert.assertEquals(4, actual[2]);
    }

    @Test
    public void testSum() {
        int[] tmp = {2, 3, 4, 5};

        int actual = Sequence.sum(tmp);

        Assert.assertEquals(14, actual);
    }

    @Test
    public void testMax() {
        int[] tmp = {2, 3, 4, 5};

        int actual = Sequence.max(tmp);

        Assert.assertEquals(5, actual);
    }

    @Test
    public void testAsPrimitiveArray() {
        List<Integer> tmp = Arrays.asList(1, 2, 3, 4, 5);

        int[] actual = Sequence.asPrimitiveArray(tmp);

        Assert.assertEquals(5, actual.length);
        Assert.assertEquals(1, actual[0]);
        Assert.assertEquals(2, actual[1]);
        Assert.assertEquals(3, actual[2]);
        Assert.assertEquals(4, actual[3]);
        Assert.assertEquals(5, actual[4]);
    }

    @Test
    public void testGetEvenArray() {
        Sequence sequence = new Sequence(3, 7);

        int[] actual = sequence.getEvenArray();

        Assert.assertEquals(2, actual.length);
        Assert.assertEquals(4, actual[0]);
        Assert.assertEquals(6, actual[1]);
    }

    @Test
    public void testGetOddArray() {
        Sequence sequence = new Sequence(3, 7);

        int[] actual = sequence.getOddArray();

        Assert.assertEquals(2, actual.length);
        Assert.assertEquals(3, actual[0]);
        Assert.assertEquals(5, actual[1]);
    }

    @Test
    public void testSumEven(){
        Sequence sequence = new Sequence(2,8);

        int actual = sequence.sumEven();

        Assert.assertEquals(12,actual);
    }

    @Test
    public void testSumOdd(){
        Sequence sequence = new Sequence(2,8);

        int actual = sequence.sumOdd();

        Assert.assertEquals(15,actual);
    }

    @Test
    public void testMaxOdd(){
        Sequence sequence = new Sequence(2,8);

        int actual = sequence.maxOdd();

        Assert.assertEquals(7,actual);
    }

    @Test
    public void testMaxEven(){
        Sequence sequence = new Sequence(2,8);

        int actual = sequence.maxEven();

        Assert.assertEquals(6,actual);
    }
}