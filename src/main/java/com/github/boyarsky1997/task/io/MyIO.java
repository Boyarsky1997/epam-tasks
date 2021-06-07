package com.github.boyarsky1997.task.io;

import java.io.*;

public class MyIO {
    public static void usualWriting(String path, String text) {

        try (Writer writer = new OutputStreamWriter(new FileOutputStream(path), "UTF8")) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void usualReading(String path) throws IOException {

        StringBuffer sb = new StringBuffer();
        try (InputStreamReader input
                     = new InputStreamReader(new FileInputStream(path))) {

            int ch = 0;
            while ((ch = input.read()) != -1) {
                sb.append((char)ch);
            }

            System.out.println(sb.toString().length());
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public static void bufferedReading(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            StringBuffer sb = new StringBuffer();
            while ((line = reader.readLine()) != null) {
                sb.append(line).append(System.lineSeparator());
            }
            System.out.println(sb.toString().length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void bufferedWriting(String path, String text) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.write(text);
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

}
