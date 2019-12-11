package com.company;

public class Thief extends Character {
	private int dodgeChance;
	private boolean haveCrit = false;
	
	public int strenght() {
		if (this.haveCrit == false && critChance < 0 + (int)(Math.random() * ((100 - 0) + 1))) {
			this.haveCrit = true;
			return this.damage * 2;
		}
		this.haveCrit = false;
		return this.damage;
	}
	
	public void receiveDamages(int amount) {
		if (dodgeChance < 0 + (int)(Math.random() * ((100 - 0) + 1))) {
			System.out.println(this.name + " dodged !");
			return;
		}
		this.hp = this.hp - amount;
	}
}
