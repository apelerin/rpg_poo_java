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
        this.heal = amount;
    }

    public void setMaxHp(int amount) {
    	this.maxHp = amount;
    }
    
    public int strenght() {
        healHp();
        return this.damage;
    }
    
    public int getHpMax() {
    	return this.maxHp;
    }

    //Heal to health + heal OR heal to max health.
    public void healHp() {
    	if (this.getHp() + this.getHeal() < getHpMax()) {
    		System.out.println(this.getName() + " Healed himself for " + this.getHeal() + " Hp !");
    		this.setHp(this.getHp() + this.getHeal());
    		System.out.println(this.getName() + " has now " + this.getHp() + " Hp !");
    	}
    	else {
    	    this.setHp(this.getHpMax());
    	    System.out.println(this.name + " Fully healed !");
        }
    }

    public String toString() {
        return "Name : " + this.getName() + "\nDamages : " + this.getDamage() + "\nHealh : " + this.getHp() + "\nInitiative : " + this.getInitiative() + "\nHeal : " + this.getHeal() + "\nMax Health : " + this.getHpMax() + "\nClass : " + this.getJob();
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
        this.setMaxHp(entryInt);
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