package com.github.boyarsky1997.task.collections;

import com.github.boyarsky1997.task.collections.command.ACommand;
import com.github.boyarsky1997.task.collections.command.BCommand;
import com.github.boyarsky1997.task.collections.command.CCommand;
import com.github.boyarsky1997.task.collections.command.DCommand;

enum MenuItems {
    Open(new ACommand()), Save(new BCommand()), Delete(new CCommand()), Exit(new DCommand());


    private final Command command;

    MenuItems(Command command) {
        this.command = command;
    }

    public static Command from(String str) {
        for (MenuItems value : values()) {
            if (value.toString().equalsIgnoreCase(str))
                return value.command;
        }
        return null;
    }

}
