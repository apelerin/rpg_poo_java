package com.company;

public class Character {
    private String name;
    private int damage;
    private int hp;
    private int initiative;

    public String getName() {
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
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public void setHp(int hp) {
    	this.hp = hp;
    }

    public void setDamage(int damage) {
    	this.damage = damage;
    }
    
    public void setInitiative(int initiative) {
    	this.initiative = initiative;
    }
    
    public String toString() {
    	return name + " " + damage + " " + hp + " " + initiative;
    }
}