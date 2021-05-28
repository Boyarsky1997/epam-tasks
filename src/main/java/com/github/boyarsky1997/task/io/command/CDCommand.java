package com.github.boyarsky1997.task.io.command;


import com.github.boyarsky1997.task.io.Command;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CDCommand extends Command {


    public static String clip(String path) {
        String[] arrays = path.split("\\\\");
        List<String> result = new ArrayList<>(Arrays.asList(arrays).subList(0, arrays.length - 1));
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < result.size(); i++) {
            stringBuilder.append(result.get(i));
            if (i != result.size() - 1) {
                stringBuilder.append("\\");
            }
        }
        return String.valueOf(stringBuilder);

    }


    @Override
    public void execute(String[] args) {
        String t = this.getPath();
        String[] tmp = t.split("");
        StringBuilder path = new StringBuilder();
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[tmp.length - 1].equals(".") && tmp[tmp.length - 2].equals("\\")) {
                if (i == tmp.length - 1 || i == tmp.length - 2) {

                } else {
                    path.append(tmp[i]);
                }

            } else {
                path.append(tmp[i]);
            }
        }
        if (args.length == 1) {


            System.out.println(path);
        } else {
            if (args[1].contains("..")) {
                String s = clip(path.toString());
                this.setPath(s);
                t = s;
                System.out.println(t);
            } else {
                String[] mas = args[1].split("\\\\");
                String dd = path + "\\" + mas[0];
                if (new File(dd).exists()) {
                    setPath(dd);
                    System.out.println(this.getPath());
                } else {
                    throw new RuntimeException("Немає такої деректорії");
                }
            }
        }
    }
}
