package com.github.boyarsky1997.task.multithreading;

public class PingPong implements Runnable {
    private String word;
    private Object a;

    public PingPong(String word, Object a) {
        this.word = word;
        this.a = a;
    }


    public void run() {

        synchronized (a) {
            for (int i = 0; i < 10; i++) {
                System.out.println(word + i);
                try {

                    a.notifyAll();
                    a.wait();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
