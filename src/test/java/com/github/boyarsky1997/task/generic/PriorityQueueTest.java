package com.github.boyarsky1997.task.generic;

import org.junit.Assert;
import org.junit.Test;

public class PriorityQueueTest {
    @Test
    public void testGet() {
        PriorityQueue<Droid> droids= new PriorityQueue<>();
        droids.add(0.1, new Droid("Roman"));
        droids.add(0.4, new Droid("Tom"));

        Assert.assertEquals("Tom", droids.get().getName());
        Assert.assertEquals("Roman", droids.get().getName());
        Assert.assertNull(droids.get());
    }

    @Test
    public void testAddWhenQueueEmpty() {
        PriorityQueue<Droid> droids = new PriorityQueue<>();
        droids.add(0.1, new Droid("Roman"));
        droids.add(0.4, new Droid("Tom"));
        droids.add(0.5, new Droid("Bill"));
        droids.add(0.3, new Droid("Vitalik"));

        Assert.assertEquals(4, droids.size());

        Assert.assertEquals("Bill", droids.get().getName());
        Assert.assertEquals("Tom", droids.get().getName());
        Assert.assertEquals("Vitalik", droids.get().getName());
        Assert.assertEquals("Roman", droids.get().getName());
        Assert.assertNull(droids.get());
        Assert.assertNull(droids.get());
    }

    @Test
    public void testAdd() {
        PriorityQueue<Droid> droids = new PriorityQueue<>();
        droids.add(0.1, new Droid("Roman"));
        droids.add(0.4, new Droid("Tom"));
        droids.add(0.5, new Droid("Bill"));
        droids.add(0.3, new Droid("Vitalik"));

        Assert.assertEquals(4, droids.size());

        Assert.assertEquals("Bill", droids.get().getName());
        Assert.assertEquals("Tom", droids.get().getName());
        Assert.assertEquals("Vitalik", droids.get().getName());
        Assert.assertEquals("Roman", droids.get().getName());
    }

    @Test
    public void testAddWhenPrioritySame() {
        PriorityQueue<Droid> droids = new PriorityQueue<>();
        droids.add(0.2, new Droid("Roman"));
        droids.add(0.2, new Droid("Tom"));
        droids.add(0.2, new Droid("Bill"));
        droids.add(0.2, new Droid("Vitalik"));

        Assert.assertEquals(4, droids.size());

        Assert.assertEquals("Roman", droids.get().getName());
        Assert.assertEquals("Tom", droids.get().getName());
        Assert.assertEquals("Bill", droids.get().getName());
        Assert.assertEquals("Vitalik", droids.get().getName());
    }

    @Test(expected = RuntimeException.class)
    public void testAddWhenPriorityMoreOne() {
        PriorityQueue<Droid> droids = new PriorityQueue<>();
        droids.add(1.1, new Droid("Roman"));
    }

    @Test(expected = RuntimeException.class)
    public void testAddWhenPriorityLessZero() {
        PriorityQueue<Droid> droids = new PriorityQueue<>();
        droids.add(-0.1, new Droid("Roman"));
    }

    @Test
    public void testSize() {
        PriorityQueue<Droid> droids = new PriorityQueue<>();
        droids.add(0.1, new Droid("Roman"));
        droids.add(0.4, new Droid("Tom"));
        droids.add(0.5, new Droid("Bill"));
        droids.add(0.3, new Droid("Vitalik"));

        int actual = droids.size();

        Assert.assertEquals(4, actual);
    }
}