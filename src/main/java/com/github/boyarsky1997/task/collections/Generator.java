package com.github.boyarsky1997.task.collections;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Generator {
    private String path;

    public Generator(String path) throws IOException, IOException {
        this.path = path;
    }

    public List<MyClass> generator() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line;
        List<MyClass> result = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            String[] s = line.split(" ");
            result.add(new MyClass(s[0], s[1]));
        }
        return result;
    }
}