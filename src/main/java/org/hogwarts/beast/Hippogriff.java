package org.hogwarts.beast;

import org.hogwarts.Student;

import java.util.Random;

public class Hippogriff {
    private String name;
    private int age;
    private String color;
    private String specialSkill;

    public Hippogriff() {

    }

    public Hippogriff(String name) {
        this.name = name;
    }

    public Hippogriff(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Hippogriff(String name, int age, String color, String specialSkill) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.specialSkill = specialSkill;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getSpecialSkill() {
        return specialSkill;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(String food) {
        if (food.equals("Bird")) {
            System.out.println("Hippogriff is eating of birds.");
        } else {
            System.out.println("Hippogriff is hungry now!");
        }
    }

    public String fly() {
        if (this.age > 2) {
            return "Hippogriff " + this.name + " is flying.";
        }
        return "Hippogriff can't fly. Is is too small.";
    }

    public String giveRide(Student student) {
        Random random = new Random();
        int isGivingRide = random.nextInt(10) + 1;
        if (isGivingRide > 0 && isGivingRide < 4) {
            return "Hippogriff " + this.name + " gibe ride " + student.getName();
        } else if (isGivingRide >= 4 && isGivingRide <= 8) {
            return "Hippogriff " + this.name + " turn away from " + student.getName() + " and refuse to fly!";
        } else {
            return student.getName() + " shoud to try again!";
        }
    }
}
