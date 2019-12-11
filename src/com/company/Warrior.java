package com.company;

public class Warrior extends Character {
    int shield;

    public int getShield() {
        return this.shield;
    }

    public void receiveDamages(int amount) {
    	this.hp = this.hp - amount - this.getShield();
    }
}