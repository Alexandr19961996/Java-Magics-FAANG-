package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Variables and data types
        // task 0
        System.out.println("Oh, you’re a magician, friend! Welcome to Hogwarts!" + "\n");

        // task 1
        String teachers = "School teachers:";
        String dumbledore = "Dumbledore";
        String mcgonagall = "Mcgonagall";
        String snape = "Snape";
        String lupin = "Lupin";
        String hugrid = "Hugrid";
        System.out.println(teachers + "\n" + dumbledore + "\n" + mcgonagall + "\n" +
                snape + "\n" + lupin + "\n" + hugrid + "\n");

        // task 2
        int grade1 = new Random().nextInt(1, 10);
        int grade2 = new Random().nextInt(1, 10);
        boolean result = grade1 > 5 && grade2 > 5;
        System.out.println("grade1: " + grade1 + "\n" + "grade2: " + grade2 + "\n" +
                "result: " + result);
        System.out.println((double) (grade1 + grade2) / 2 + "\n");

        // task 3
        System.out.println(4199 % 13 + 4199 % 14 + 4199 % 15 + 4199 % 16 + 4199 % 17 + 4199 % 19);
    }
}