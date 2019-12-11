package com.company;

public class Mage extends Character {
    private int power;

    public int getPower() {
        return this.power;
    }

    public int strenght() {
        int damagePower = this.damage + this.power;
        this.power = this.power / 2;
        return damagePower;
    }
}