package org.example;

import java.util.Random;

public class Quidditch {
    public void getBalls() {
        for (int i = 1; i <= 3; i++) {
            if (i == 1) {
                System.out.println("Quaffle");
            } else if (i == 2) {
                System.out.println("Bludger");
            } else {
                System.out.println("Golden Snitch");
            }
        }
    }

    public void playGame() {
        while (true) {
            Random random = new Random();
            int control = random.nextInt(101);
            if (control == 5) {
                System.out.println("Snitch is catching!");
                break;
            }
            System.out.println("!");
        }
    }
}
