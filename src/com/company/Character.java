package com.company;

public class Character {
    private int name;
    private int damage;
    private int hp;
    private int initiative;

    public int getName() {
        return this.name;
    }

    public int getHp() {
        return this.hp;
    }

    public int getInitiative() {
        return this.initiative;
    }

    public int strenght() {
        return this.damage;
    }
    
    public void receiveDamages(int amount) {
    	this.hp = this.hp - amount;
    }
    
    public String toString() {
    	return name + " " + damage + " " + hp + " " + initiative;
    }
}