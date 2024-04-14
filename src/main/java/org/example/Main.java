package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*// Variables and data types.
        // task 1.
        System.out.println("Oh, you’re a magician, friend! Welcome to Hogwarts!" + "\n");

        // task 2.
        String teachers = "School teachers:";
        String dumbledore = "Dumbledore";
        String mcgonagall = "Mcgonagall";
        String snape = "Snape";
        String lupin = "Lupin";
        String hugrid = "Hugrid";
        System.out.println(teachers + "\n" + dumbledore + "\n" + mcgonagall + "\n" +
                snape + "\n" + lupin + "\n" + hugrid + "\n");

        // task 3.
        int grade1 = new Random().nextInt(1, 10);
        int grade2 = new Random().nextInt(1, 10);
        boolean result = grade1 > 5 && grade2 > 5;
        System.out.println("grade1: " + grade1 + "\n" + "grade2: " + grade2 + "\n" +
                "result: " + result);
        System.out.println((double) (grade1 + grade2) / 2 + "\n");

        // task 4.
        System.out.println(4199 % 13 + 4199 % 14 + 4199 % 15 + 4199 % 16 + 4199 % 17 + 4199 % 19);*/

        /*// Lines.
        // task 1.
        StringBuilder stringBuilder = new StringBuilder(new Random().nextInt())
                .append(new Random().nextInt())
                .append(new Random().nextInt())
                .append(new Random().nextInt())
                .append(new Random().nextInt());
        String line1 = String.valueOf(stringBuilder).replace('1', 'i');
        String line2 = line1.replace("-", "");
        String line3 = line2.replace('0', 'o');
        String line4 = line3.replace('6', 'b');
        boolean answer = line4.contains("23");
        int index = line4.indexOf("ob");

        System.out.println("\n" + stringBuilder + "\n" + line1 + "\n" + line2 + "\n" + line3 + "\n" + line4);
        System.out.println(answer);
        System.out.println(index);

        //task 2.
        castSpell();*/

        /*// Branching.
        // task 1.
        int numberOne = new Random().nextInt();
        int numberTwo = new Random().nextInt();
        if (numberOne % 2 == 0 && numberTwo % 2 == 0) {
            System.out.println(numberOne / 2 + numberTwo / 2);
        } else if (numberOne % 2 == 0) {
            System.out.println(numberOne / 2 + numberTwo);
        } else if (numberTwo % 2 == 0) {
            System.out.println(numberTwo / 2);
        } else {
            System.out.println(numberOne + numberTwo);
        }

        SoringHat soringHat = new SoringHat();
        System.out.println(soringHat.sort()); */

        // Cycles.
        // task 1.
        Quidditch quidditch = new Quidditch();
        quidditch.getBalls();

        // task 2.
        quidditch.playGame();

        // task 3.
        int result = 0;
        for (int i = 222; i <= 444; i++) {
            if (i % 2 == 0) {
                result += i;
            }
        }
        System.out.println(result);
    }

    public static void castSpell() {
        String line = "ARDENTIS VERUM LUMINOS ET FULGUR SYLVESTRA ELIXIA";
        String line1 = line.toLowerCase();
        int start = new Random().nextInt(0, 50);
        String line2 = line1.substring(start);
        StringBuilder spell = new StringBuilder(line2);
        String line3 = String.valueOf(spell.reverse());
        String line4 = String.valueOf(spell.replace(0, 1, String.valueOf(line3.charAt(1))));
        String line5 = String.valueOf(spell.replace(1, 2, String.valueOf(line3.charAt(0))));

        System.out.println("\n" + line + "\n" + line1 + "\n" + start + "\n" + line2 + "\n" + line3 + "\n" + line4 + "\n" + line5);
    }
}