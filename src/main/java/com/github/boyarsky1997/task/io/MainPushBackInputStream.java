package com.github.boyarsky1997.task.io;

import java.io.*;

public class MainPushBackInputStream {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("C:\\Users\\roman\\IdeaProjects\\epam-tasks\\src\\main\\resources\\k.text");
        // Create BufferedInputStream object.
        BufferedInputStream bis = new BufferedInputStream(is);

        MyPushBackInputStream pis = new MyPushBackInputStream(bis, 2);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int fileIdx = 0;

        int code;
        while ((code = pis.read()) != -1) {
            if (code == (int) '@') {
                int next1 = pis.read();
                int next2 = pis.read();

                if (next1 == '@' && next2 == '@') {
                    byte[] imageData = baos.toByteArray();
                    fileIdx++;
                    writeToFile(imageData, fileIdx); // Write Image file.

                    baos = new ByteArrayOutputStream();
                } else {
                    baos.write(code);
                    pis.unread(next2);
                    pis.unread(next1);
                }
            } else {
                baos.write(code);
            }
        }
        byte[] imageData = baos.toByteArray();
        fileIdx++;
        writeToFile(imageData, fileIdx);  // Write Image file.

        pis.close();
    }

    private static void writeToFile(byte[] data, int fileIdx) throws IOException {
        File file = new File("C:\\Users\\roman\\IdeaProjects\\epam-tasks\\src\\main\\resources" + "/" + fileIdx + ".txt");
        file.getParentFile().mkdirs();
        System.out.println("Write file: " + file.getAbsolutePath());

        FileOutputStream fos = new FileOutputStream(file);
        fos.write(data);
        fos.close();
    }
}
