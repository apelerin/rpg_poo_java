package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Main {

    public static void main(String[] args) {
    // write your code here
        boolean choice = true;
        Character[] list_character = new Character[0];
        Scanner sc = new Scanner(System.in);
        String entry;
        System.out.println("Welcome newcomer... Into this sweet world of defeat...");
        while(choice) {
            System.out.println("Que voulez vous faire?");
            entry = sc.nextLine();
            switch(entry) {
                case "exit":
                    choice = false;
                    System.out.println("Byeeeeeeeee!");
                    break;
                case "help":
                    helpCommand();
                    break;
                case "new character":
<<<<<<< HEAD
                    createCharacter();
=======
                	list_character = Arrays.copyOf(list_character, list_character.length + 1);
                	list_character[list_character.length - 1] = createCharacter();
>>>>>>> 198d3d016d8682e9813df6a8b4ea46d2ef489a07
                    break;
                default:
                    System.out.println("Invalid command.");
            }
        }
        sc.close();
    }
    public static void helpCommand() {
        System.out.println("help : Show this help menu.");
        System.out.println("exit : Exit the game.");
    }
<<<<<<< HEAD
    public static void createCharacter(Character) {
        Scanner sc = new Scanner(System.in);
        String entry;
        System.out.println("Type here, the stats of your character...");
        entry = sc.nextLine();
        System.out.println("What is the name of your character ?");
        System.out.println(" ");
        name = entry;
        entry = sc.nextLine();
        System.out.println("What is the strenght of your character ?");
        System.out.println(" ");
        damage = entry;
        entry = sc.nextLine();
        System.out.println("What is the vitality of your character ?");
        System.out.println(" ");
        hp = entry;
        entry = sc.nextLine();
        System.out.println("What is the speed of your character ?");
        System.out.println(" ");
        speed = entry;
        entry = sc.nextLine();
=======
    public static Character createCharacter() {
    	Character newCharacter = new Character();
        Scanner sc = new Scanner(System.in);
        String entry;
        System.out.println("Type here, the stats of your character...");
        System.out.println("What is the name of your character ?");
        entry = sc.nextLine();
        System.out.println(" ");
        newCharacter.setName(entry);
        System.out.println("What is the strenght of your character ?");
        int entryInt;
        entryInt = sc.nextInt();
        System.out.println(" ");
        newCharacter.setDamage(entryInt);
        System.out.println("What is the vitality of your character ?");
        entryInt = sc.nextInt();
        System.out.println(" ");
        newCharacter.setHp(entryInt);
        System.out.println("What is the speed of your character ?");
        entryInt = sc.nextInt();
        System.out.println(" ");
        newCharacter.setInitiative(entryInt);
        System.out.println(newCharacter.toString());
        return newCharacter;
>>>>>>> 198d3d016d8682e9813df6a8b4ea46d2ef489a07
    }
}
