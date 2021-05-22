package com.github.boyarsky1997.task.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Process {
    public static void reading(String path) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            Droid droid = (Droid) ois.readObject();
            System.out.println("Name: " + droid.getName() + " Age: " + droid.getAge());
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
    }

    public static void writing(String path, Droid droid) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            oos.writeObject(droid);
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
    }
}
