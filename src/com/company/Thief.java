package com.company;

import java.util.Scanner;

public class Thief extends Character {
	protected int dodgeChance;
	protected int critChance;
	protected boolean haveCrit = false;
	protected String job = "Thief";

	public String getJob() {
		return this.job;
	}

	public int strenght() {
		if (this.haveCrit == false && critChance < 0 + (int)(Math.random() * ((100 - 0) + 1))) {
			this.haveCrit = true;
			System.out.println("Critic!");
			return this.damage * 2;
		}
		this.haveCrit = false;
		return this.damage;
	}
	
	public void setCritChance(int amount) {
		this.critChance = amount;
	}
	
	public void setDodgeChance(int amount) {
		this.dodgeChance = amount;
	}
	
	public void receiveDamages(int amount) {
		if (dodgeChance < 0 + (int)(Math.random() * ((100 - 0) + 1))) {
			System.out.println(this.name + " dodged the attack !");
			return;
		}
		this.hp = this.hp - amount;
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
        System.out.println("What is the critic chance of your thief? (between 0 and 100)");
        entryInt = sc.nextInt();
        System.out.println(" ");
        this.setCritChance(entryInt);
        System.out.println("What is the dodge chance of your thief? (between 0 and 100)");
        entryInt = sc.nextInt();
        System.out.println(" ");
        this.setDodgeChance(entryInt);
    }
}
