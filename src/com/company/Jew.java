package com.company;

import java.util.Scanner;

public class Jew extends Character {
    protected int heal;
    protected String job = "Jew";
    
    public int getHeal() {
    	return this.heal;
    }
    
    public void setHeal(int amount) {
    	this.heal = amount;
    }

    public int strenght() {
        healHp();
        return this.damage;
    }

    public void healHp() {
        System.out.println(this.name + " Healed himself for " + this.heal + " Hp !");
        this.hp = this.hp + this.heal;
        System.out.println(this.name + " has now " + this.hp + " Hp !");
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
        System.out.println("What is the heal value of your priest?");
        entryInt = sc.nextInt();
        System.out.println(" ");
        this.setHeal(entryInt);
    }
}