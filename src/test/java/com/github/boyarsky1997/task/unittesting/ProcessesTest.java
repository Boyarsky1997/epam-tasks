package com.github.boyarsky1997.task.unittesting;

import com.github.boyarsky1997.task.io.Droid;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ProcessesTest  {
    @Mock
    private ObjectOutputStream mockObjectOutputStream;
    @Mock
    private Droid mockDroid;


    private Processes processes;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.openMocks(this).close();
        processes = new Processes();
    }

    @Test
    public void testWriting() throws IOException {
        Droid droid = new Droid("d",11);

        processes.writing(mockObjectOutputStream, mockDroid);

        Mockito.verify(mockObjectOutputStream).writeObject(mockDroid);
    }

    @Test
    public void testAdd() {
        Processes processes = new Processes();
        int actual = processes.add(5, 10);
        Assert.assertEquals(15, actual);
    }

//    @Test(expected = ArithmeticException.class)
//    public void testDivOnZero() {
//        Processes processes = new Processes();
//        processes.div(2, 0);
//
//    }

    @Test
    public void testCheckIfEquals() {
        Processes processes = new Processes();
        boolean actual = processes.check(1, 1);

        Assert.assertTrue(actual);
    }

    @Test
    public void testCheckIfNotEquals() {
        Processes processes = new Processes();
        boolean actual = processes.check(2, 1);

        Assert.assertFalse(actual);
    }

    @Test
    public void testReturnObject() {
        Processes processes = new Processes();

        String actual = processes.returnObject("roman");

        Assert.assertNotNull(actual);
    }


    @Test
    public void testReturnNull() {
        Processes processes = new Processes();

        String actual = processes.returnObject("a");

        Assert.assertNull(actual);
    }

    @Test
    public void testPrivateMethod() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Processes> clazz = Processes.class;
        Method method = clazz.getDeclaredMethod("privateMethod", String.class, String.class);
        method.setAccessible(true);
        String actual = (String) method.invoke(new Processes(), "ro", "man");

        Assert.assertEquals("roman", actual);
    }

    @Test
    public void testPrivateMethodNotEquals() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Processes> clazz = Processes.class;
        Method method = clazz.getDeclaredMethod("privateMethod", String.class, String.class);
        method.setAccessible(true);
        String actual = (String) method.invoke(new Processes(), "ro", "man");

        Assert.assertNotEquals("roan", actual);
    }

}