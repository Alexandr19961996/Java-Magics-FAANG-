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
}
