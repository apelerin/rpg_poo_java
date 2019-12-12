package com.company;

import java.util.Scanner;

public class Warrior extends Character {
    protected int shield;
    protected String job = "Warrior";

    public String getJob() {
        return this.job;
    }

    public int getShield() {
        return this.shield;
    }
    
    public void setShield(int amount) {
    	this.shield = amount;
    }

    public void receiveDamages(int amount) {
    	System.out.println(this.getName() + " blocked " + this.getShield() + " damages.");
    	this.hp = this.hp - (amount - this.getShield());
    }
    
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
        System.out.println("What is the shield value of your warrior?");
        entryInt = sc.nextInt();
        System.out.println(" ");
        this.setShield(entryInt);
    }
}