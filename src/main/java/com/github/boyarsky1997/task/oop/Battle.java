package com.github.boyarsky1997.task.oop;

import com.github.boyarsky1997.task.exceptions.MyExceptionClass;

public class Battle {
    private Droid droid1;
    private Droid droid2;

    public Battle(Droid droid1, Droid droid2) {
        this.droid1 = droid1;
        this.droid2 = droid2;
    }

    public void fight() throws MyExceptionClass {
        boolean tmp = false;
        while (!tmp) {
            droid1.attack(droid2);
            if (droid2.isStatus()) {
                tmp = true;
            }
            droid2.attack(droid1);
            if (droid1.isStatus()) {
                tmp = true;
            }
        }
    }
}
