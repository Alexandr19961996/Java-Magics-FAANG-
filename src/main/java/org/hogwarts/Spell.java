package org.hogwarts;

public class Spell {
    private String tittle;
    private int power;

    public Spell(String tittle, int power) {
        this.tittle = tittle;
        this.power = power;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
