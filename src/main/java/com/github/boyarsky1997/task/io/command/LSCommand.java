package com.github.boyarsky1997.task.io.command;


import com.github.boyarsky1997.task.io.Command;

import java.io.File;
import java.util.Objects;

public class LSCommand extends Command {

    @Override
    public void execute(String[] args) {
        for (File file : Objects.requireNonNull(new File(getPath()).listFiles())) {
            System.out.println(file.getName());
        }
        ;

    }
}
