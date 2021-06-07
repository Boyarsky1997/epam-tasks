package com.github.boyarsky1997.task.io;

import com.github.boyarsky1997.task.io.command.CDCommand;
import com.github.boyarsky1997.task.io.command.ExitCommand;
import com.github.boyarsky1997.task.io.command.LSCommand;

import java.util.HashMap;
import java.util.Map;

public class MenuItems {
    private String path;
    private Command command;

    public MenuItems(Command command) {
        this.command = command;
    }

    public static Command from(String str) {
        Map<String, Command> commands = new HashMap<>();
        commands.put("cd", new CDCommand());
        commands.put("ls", new LSCommand());
        commands.put("exit", new ExitCommand());
        return commands.get(str);
    }

}
