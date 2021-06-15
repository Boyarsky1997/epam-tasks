package com.github.boyarsky1997.task.collections;

import com.github.boyarsky1997.task.collections.command.*;

enum MenuItems {
    Open(new ACommand()), Save(new BCommand()), Delete(new CCommand()), Exit(new DCommand()) ,Language(new ECommand());


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
