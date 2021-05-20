package com.github.boyarsky1997.task.collections;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) throws Exception {
        System.out.println("Exit     Saved     Delete     Open");
        System.out.println("Enter the command ...");
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        MenuItems.from(command).execute();
    }
}
