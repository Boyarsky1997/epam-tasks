package com.github.boyarsky1997.task.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MyJavaReader {
    private String path = "C:\\Users\\roman\\IdeaProjects\\epam-tasks\\src\\main\\java\\com\\github\\boyarsky1997\\task\\io\\";

    public MyJavaReader() {
    }

    private static String bufferedReading(String path) {
        StringBuffer sb = new StringBuffer();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] chars = line.split("");
                if (chars[0].equals("/") && chars[1].equals("/")) {
                    sb.append(line).append(System.lineSeparator());
                }
                if (chars[0].equals("/") && chars[1].equals("*")) {
                    sb.append(line).append(System.lineSeparator());
                }else if (chars[chars.length-1].equals("/")&&chars[chars.length-2].equals("*")){
                    sb.append(line).append(System.lineSeparator());
                }
                if (chars[0].equals("*")||chars[1].equals("*")){
                    sb.append(line).append(System.lineSeparator());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return String.valueOf(sb);
    }

    public void reader() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a file name.....");
        String nameFile = scanner.nextLine();
        scanner.close();
        String textJava = bufferedReading(path + nameFile + ".java");
        System.out.println("comments:");
        System.out.println(textJava);
    }
}
