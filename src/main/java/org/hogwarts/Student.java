package org.hogwarts;

public class Student {
    private String name;
    private String faculty;
    private int age;
    private String[] specialSkills = new String[3];

    public Student(String name, String faculty, int age, String[] specialSkills) {
        this.name = name;
        this.faculty = faculty;
        this.age = age;
        this.specialSkills = specialSkills;
    }

    public String getName() {
        return name;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getAge() {
        return age;
    }

    public String[] getSpecialSkills() {
        return specialSkills;
    }

    public void castSpell(Spell spell) {
        if (this.age <= 11) {
            if (spell.getPower() == 1) {
                System.out.println(this.name + " использовал заклинание " + spell.getTittle());
            } else {
                throw new SpellCastException(name + " еще слишком юн, чтобы использовать заклинание " + spell.getTittle());
            }
        } else if (this.age == 12) {
            if (spell.getPower() <= 2) {
                System.out.println(this.name + " использовал заклинание " + spell.getTittle());
            } else {
                throw new SpellCastException(this.name + " еще слишком юн, чтобы использовать заклинание " + spell.getTittle());
            }
        } else if (this.age == 13) {
            if (spell.getPower() <= 3) {
                System.out.println(this.name + " использовал заклинание " + spell.getTittle());
            } else {
                throw new SpellCastException(this.name + " еще слишком юн, чтобы использовать заклинание " + spell.getTittle());
            }
        } else if (this.age == 14) {
            if (spell.getPower() <= 4) {
                System.out.println(this.name + " использовал заклинание " + spell.getTittle());
            } else {
                throw new SpellCastException(this.name + " еще слишком юн, чтобы использовать заклинание " + spell.getTittle());
            }
        } else if (this.age == 15) {
            if (spell.getPower() <= 5) {
                System.out.println(this.name + " использовал заклинание " + spell.getTittle());
            } else {
                throw new SpellCastException(this.name + " еще слишком юн, чтобы использовать заклинание " + spell.getTittle());
            }
        } else if (this.age == 16) {
            if (spell.getPower() <= 6) {
                System.out.println(this.name + " использовал заклинание " + spell.getTittle());
            } else {
                throw new SpellCastException(this.name + " еще слишком юн, чтобы использовать заклинание " + spell.getTittle());
            }
        } else {
            System.out.println(this.name + " использовал заклинание " + spell.getTittle());
        }
    }
}