package com.company;

public class Thief extends Character {
	private int esquiveChance;
	private int critChance;
	
	public int strenght() {
		if (critChance < 0 + (int)(Math.random() * ((100 - 0) + 1))) {
			return this.damage * 2;
		}
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
