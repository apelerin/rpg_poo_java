package com.company;

public class Jew extends Character {
    private int heal;

    public int getHeal() {return this.heal; }
    public int strenght() {
        healHp();
        return this.damage;
    }

    public void healHp() {
        System.out.println(this.name + " Healed himself for " + this.heal + " Hp !");
        this.hp = this.hp + this.heal;
        System.out.println(this.name + " has now " + this.hp + " Hp !");
    }
}