package com.github.boyarsky1997.task.io;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MyPushBackInputStreamTest extends TestCase {

    @Test
    public void testRead() throws IOException {
        InputStream inputStream = new FileInputStream("C:\\Users\\roman\\IdeaProjects\\epam-tasks\\src\\main\\resources\\test1.txt");
        MyPushBackInputStream myPushBackInputStream = new MyPushBackInputStream(new BufferedInputStream(inputStream), 1);

        char[] expected = {'r', 'o', 'm', 'a', 'n'};
        for (char c : expected) {
            int actual = myPushBackInputStream.read();
            Assert.assertEquals(c, (char) actual);
        }
    }

    @Test
    public void testUnread() throws IOException {
        InputStream inputStream = new FileInputStream("C:\\Users\\roman\\IdeaProjects\\epam-tasks\\src\\main\\resources\\test1.txt");
        MyPushBackInputStream myPushBackInputStream = new MyPushBackInputStream(new BufferedInputStream(inputStream), 1);
        myPushBackInputStream.unread(myPushBackInputStream.read());

        Assert.assertEquals('r', myPushBackInputStream.getBytes()[0]);
    }

    @Test
    public void testClose() throws IOException {
        InputStream inputStream = new FileInputStream("C:\\Users\\roman\\IdeaProjects\\epam-tasks\\src\\main\\resources\\test1.txt");
        MyPushBackInputStream myPushBackInputStream = new MyPushBackInputStream(new BufferedInputStream(inputStream), 1);
        myPushBackInputStream.close();
        Assert.assertNull(myPushBackInputStream.getBytes());
        Assert.assertNull(myPushBackInputStream.getInputStream());
    }
}