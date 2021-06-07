package com.github.boyarsky1997.task.unittesting;

import com.github.boyarsky1997.task.io.Droid;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Processes {

    public  void writing(ObjectOutputStream os, Droid droid) {
        try (ObjectOutputStream oos = os) {
            oos.writeObject(droid);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    public  void writing(String path, Droid droid) throws IOException {
        writing(new ObjectOutputStream(new FileOutputStream(path)), droid);
    }

    public double div(int a, int b) {
        return (double) a / b;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public boolean check(int a, int b) {
        return a == b;
    }

    public String returnObject(String a) {
        if (a.equals("roman")) {
            return a;
        } else {
            return null;
        }
    }

    private String privateMethod(String a, String b) {
        return a + b;
    }

}
