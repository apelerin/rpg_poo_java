package com.company;

public class Thief extends Character {
	private int esquiveChance;
	private int critChance;
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
		if (esquiveChance < 0 + (int)(Math.random() * ((100 - 0) + 1))) {
			System.out.println(this.name + " a esquivé!");
			return;
		}
		this.hp = this.hp - amount;
	}
}
