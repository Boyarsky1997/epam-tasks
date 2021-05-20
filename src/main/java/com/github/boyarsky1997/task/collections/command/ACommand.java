package com.github.boyarsky1997.task.collections.command;

import com.github.boyarsky1997.task.collections.Command;

public class ACommand implements Command {
    @Override
    public void execute() {
        System.out.println("A");
    }
}
