package com.github.boyarsky1997.task.io.command;

import com.github.boyarsky1997.task.io.Command;

public class ExitCommand extends Command {
    @Override
    public void execute(String [] args) {
        System.exit(0);
    }
}
