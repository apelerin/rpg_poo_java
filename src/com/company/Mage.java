package com.company;

import java.util.Scanner;

public class Mage extends Character {
    protected int power;
    protected String job = "Mage";

    public String getJob() {
        return this.job;
    }

    public int getPower() {
        return this.power;
    }
    
    public void setPower(int amount) {
    	this.power = amount;
    }

    public int strenght() {
        int damagePower = this.damage + this.power;
        System.out.println(this.getName() + " a un bonus de " + this.getPower());
        this.power = this.power / 2;
        return damagePower;
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
        System.out.println("What is the magical power of you mage?");
        entryInt = sc.nextInt();
        System.out.println(" ");
        this.setPower(entryInt);
    }
}