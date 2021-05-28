package com.github.boyarsky1997.task.io;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MyPushBackInputStream extends InputStream  {
    private InputStream inputStream;
    private int size;
    private byte[] bytes;

    public MyPushBackInputStream(InputStream inputStream, int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("size <= 0");
        }
        this.inputStream = inputStream;
        this.bytes = new byte[size];
        this.size = size;
    }



    public void unread(int a) throws IOException {
        if (size == 0) {
            throw new IOException("Push back buffer is full");
        } else {
            bytes[--size] = (byte) a;
        }

    }

    public int read() throws IOException {
        return inputStream.read();
    }

    public  void close() throws IOException {
        if (inputStream == null)
            return;
        inputStream.close();
        inputStream = null;
        bytes = null;
    }

}
