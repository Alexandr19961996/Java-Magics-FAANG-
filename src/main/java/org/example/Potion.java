package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Potion {
    public boolean prepare() {
        Scanner scanner = new Scanner(System.in);
        String[] requiredIngredients = {"Драконий коготь", "Лист мандрагоры", "Корень шершавой астрелии"};
        System.out.println("Добро пожаловать влабораторию зелий!");
        System.out.println("Введите ингредиенты, которые у вас есть (через запятую):");
        String input = scanner.nextLine();
        String[] userIngredients = input.split(", ");
        int countTrueIngredients = 0;
        for (String valueUserMass : userIngredients) {
            for (String valueReqMass : requiredIngredients) {
                if (valueReqMass.equals(valueUserMass)) {
                    countTrueIngredients++;
                    break;
                }
            }
        }
        if (countTrueIngredients == 3) {
            System.out.println("У вас есть все необходимые ингредиенты для зелья! Можете начинать создание.");
            return true;
        } else {
            System.out.println("У вас не хватает некоторых ингердиентов. Нельзя приступать к созданию зелья.");
            return false;
        }
    }
}
