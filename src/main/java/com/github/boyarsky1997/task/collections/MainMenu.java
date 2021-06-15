package com.github.boyarsky1997.task.collections;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) throws Exception {
        while (true) {
              ResourceBundle  resourceBundle = ResourceBundle.getBundle("resurses",new Locale("en","US"));
                System.out.println(resourceBundle.getString("value"));
                System.out.println(resourceBundle.getString("valueOne"));


            while (true) {
                Scanner scanner = new Scanner(System.in);
                String command = scanner.nextLine();
                MenuItems.from(command).execute();
            }
        }
    }
}
