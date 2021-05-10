package com.github.boyarsky1997.task.oop;

import com.github.boyarsky1997.task.Reading;
import com.github.boyarsky1997.task.exceptions.MyExceptionClass;

import java.io.IOException;

/**
 * Battle among droids:
 * Use all your knowledge.
 * Droids should have health, energy level, impact level etc.
 * Use your creativity.
 */
public class Main {
    public static void main(String[] args) throws MyExceptionClass, IOException {
//        Battle battle = new Battle(new Droid("Megatron", 25, 50, 8), new Droid("Optimus", 20, 40, 10));
//        try {
//            battle.fight();
//        }catch (MyExceptionClass e){
//            System.out.println(e.getMessage());
//        }

        String read = Reading.read("src\\main\\resources\\text.text");
        System.out.println(read);

    }
}
