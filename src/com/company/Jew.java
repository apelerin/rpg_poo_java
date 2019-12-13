package com.company;

import java.util.Scanner;

public class Jew extends Character {
    protected int heal;
    protected String job = "Jew";
    protected int maxHp;

    public String getJob() {
        return this.job;
    }

    public int getHeal() {
        return this.heal;
    }

    public void setHeal(int amount) {
    	this.maxHp = amount;
        this.heal = amount;
    }

    public int strenght() {
        healHp();
        return this.damage;
    }
    
    public int getHpMax() {
    	return this.maxHp;
    }

    public void healHp() {
    	if (this.getHp() + this.getHeal() < getHpMax()) {
    		System.out.println(this.name + " Healed himself for " + this.heal + " Hp !");
    		this.hp = this.hp + this.heal;
    		System.out.println(this.name + " has now " + this.hp + " Hp !");
    	}
    	else {
    	    this.hp = getHpMax();
    	    System.out.println(this.name + " Fully healed !");
        }
    }

    /*public String toString() {
        return this.getName() + " " + this.getStrenght() + " " + this.getHp() + " " + this.getInitiative() + " " + this.getHeal() + " " + this.getHpMax() + " " + this.getJob();
    }*/

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