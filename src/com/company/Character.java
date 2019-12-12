package com.company;

import java.util.Scanner;

public class Character {
    protected String name;
    protected int damage;
    protected int hp;
    protected int initiative;
    protected String job = "Basic";
    
    public String getJob() {
    	return this.job;
    }
    
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
    
    //Never used if the character have a class, but serve as a blueprint
    public void setAttrib() {
    	Scanner sc = new Scanner(System.in);
    	int entryInt;
    	String entry;
    	System.out.println("Type here, the stats of your character...");
        System.out.println("What is the name of your character ?");
        entry = sc.nextLine();
        System.out.println(" ");
		this.setName(entry);
        System.out.println("What is the strenght of your character ?");
        entryInt = sc.nextInt();
        System.out.println(" ");
        this.setDamage(entryInt);
        System.out.println("What is the vitality of your character ?");
        entryInt = sc.nextInt();
        System.out.println(" ");
        this.setHp(entryInt);
        System.out.println("What is the speed of your character ?");
        entryInt = sc.nextInt();
        System.out.println(" ");
        this.setInitiative(entryInt);
    }
}