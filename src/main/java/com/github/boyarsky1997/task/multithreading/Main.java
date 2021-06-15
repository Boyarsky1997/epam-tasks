package com.github.boyarsky1997.task.multithreading;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Object a = new Object();
        Runnable p1 = new PingPong("ping", a);
        Thread t1 = new Thread(p1);
        t1.start();

        Runnable p2 = new PingPong("pong", a);
        Thread t2 = new Thread(p2);
        t2.start();

    }
}
