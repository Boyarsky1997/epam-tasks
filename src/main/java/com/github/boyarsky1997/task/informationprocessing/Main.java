package com.github.boyarsky1997.task.informationprocessing;

import java.util.Arrays;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        StringUtils stringUtils = new StringUtils("ddd", 2.2, "fsfsfsf", 1F, 1, "deddwd");
//        System.out.println(stringUtils.result());

        Pattern pattern = Pattern.compile("\\b[^.!?]+[.!?]+");
        Matcher matcher = pattern.matcher("Foman boyarrrcd d dvdvdvd.");
        if (matcher.matches()) {
            System.out.println("Ура!");
        }
        System.out.println("");

        String[] s = "Foman boya  the rrrcd you d dvdvdvd.".split("you|the");
        System.out.println(Arrays.toString(s));


        String[] consonant = {"q","w","r","t","p","s","d","f"
                ,"g","h","j","k","l","z","x",
                "c","v","b","n","m"};
        Random generator = new Random();
        String d = "AA A aaaa a  a a a a aa a".replaceAll("[AaEeIiOoUuYy]", consonant[(int) (Math.random() * consonant.length)]);
        System.out.println(d);



    }

}
