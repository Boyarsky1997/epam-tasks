package com.github.boyarsky1997.task;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reading {
    public static String read(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }
    }
}
