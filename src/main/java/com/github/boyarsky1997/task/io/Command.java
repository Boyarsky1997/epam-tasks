package com.github.boyarsky1997.task.io;

import java.io.File;

public abstract class Command {
    static String path = new File(".").getAbsolutePath();


    public abstract void execute(String[] args);

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
