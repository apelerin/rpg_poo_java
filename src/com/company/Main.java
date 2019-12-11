package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean choice = true;
        Character[] list_character = new Character[0];
        Scanner sc = new Scanner(System.in);
        String entry;
        int char1;
        int char2;
        System.out.println("Welcome newcomer... Into this sweet world of defeat...");
        while(choice) {
            System.out.println("What do you wanna do? Type 'help' if you want some help.");
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
                    list_character = Arrays.copyOf(list_character, list_character.length + 1);
                    list_character[list_character.length - 1] = createCharacter();
                    break;
                case "characters":
                    charListCommand(list_character);
                    break;
                case "Fight!":
                	System.out.println("Choose the first opponent");
                	char1 = sc.nextInt();
                	System.out.println("Choose the second opponent");
                	char2 = sc.nextInt();
                	letsFight(list_character, char1, char2);
                	break;
                default:
                    System.out.println("Invalid command.");
            }
        }
        sc.close();
    }

    public static void helpCommand() {
        System.out.println("help : Show this help menu.");
        System.out.println("list : Display all the existing characters");
        System.out.println("exit : Exit the game.");
        System.out.println("Fight! : Begin a fight");
        System.out.println("new character : Create a new character");
    }

    public static Character createCharacter() {
        Character newCharacter = new Character();
        Scanner sc = new Scanner(System.in);
        String entry;
        int entryInt;
        System.out.println("Type here, the stats of your character...");
        System.out.println("What is the name of your character ?");
        entry = sc.nextLine();
        System.out.println(" ");
        newCharacter.setName(entry);
        System.out.println("What is the strenght of your character ?");
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
        sc.close();
        return newCharacter;
    }

    public static void charListCommand(Character[] list_character) {
        for (int i = 0; i < list_character.length; i++) {
            System.out.println("ID : " + i);
            System.out.println("Name : " + list_character[i].getName() );
            System.out.println("Strenght : " + list_character[i].strenght() );
            System.out.println("Health : " + list_character[i].getHp() );
            System.out.println("Initiative : " + list_character[i].getInitiative() );
            System.out.println(" ");
        }
        System.out.println("CHECK : End of List.");
        System.out.println(" ");
    }

    public static Character[] letsFight(Character[] list_character, int indexChar1, int indexChar2) {
    	return list_character;
    }
}
