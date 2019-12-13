package com.company;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws JSONException, IOException {
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
                case "list":
                    charListCommand(list_character);
                    break;
                case "Fight!":
                    System.out.println("Choose the first opponent");
                    char1 = sc.nextInt();
                    System.out.println("Choose the second opponent");
                    char2 = sc.nextInt();
                    letsFight(list_character[char1], list_character[char2]);
                    break;
                default:
                    System.out.println("Invalid command.");
            }
        }
        JSONObject obj = new JSONObject();
        obj.put("Liste", list_character);
        try (FileWriter file = new FileWriter("characterSaved.txt")) {
			file.write(obj.toString());
			System.out.println("Successfully Copied JSON Object to File...");
			System.out.println("\nJSON Object: " + obj);
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

    // create a character
    public static Character createCharacter() {
    	int entryInt;
    	Character newCharacter = new Character();
    	Scanner sc = new Scanner(System.in);
    	System.out.println("What class do you want your character to be?");
    	System.out.println("1. Mage" + '\n' + "2. Warrior" + '\n' + "3. Thief" + '\n' + "4. Jew");
    	entryInt = sc.nextInt();
    	while (entryInt < 1 || entryInt > 4) {
    		System.out.println("Please choose a value between 1 and 4.");
    		entryInt = sc.nextInt();
    	}
    	if (entryInt == 1) {
    		newCharacter = new Mage();
    	}
    	else if (entryInt == 2) {
    		newCharacter = new Warrior();
    	}
    	else if (entryInt == 3) {
    		newCharacter = new Thief();
    	}
    	else {
    		newCharacter = new Jew();
    	}
        newCharacter.setAttrib();
        System.out.println(newCharacter.toString());
        return newCharacter;
    }

    // list the existing characters with basics attributes
    // TODO list particular classes 
    public static void charListCommand(Character[] list_character) {
        for (int i = 0; i < list_character.length; i++) {
            System.out.println("ID : " + i);
            System.out.println("Name : " + list_character[i].getName() );
            System.out.println("Class/ Job : " + list_character[i].getJob() );
            System.out.println("Strenght : " + list_character[i].strenght() );
            System.out.println("Health : " + list_character[i].getHp() );
            System.out.println("Initiative : " + list_character[i].getInitiative() );
            System.out.println(" ");
        }
        System.out.println("CHECK : End of List.");
        System.out.println(" ");
    }

    public static void letsFight(Character char1, Character char2) {
        int turn = 1;
        Character winner = null;
        // Sort the characters so the one with the bigger initiative is char1 and start first
        if (char1.getInitiative() < char2.getInitiative()) {
            Character tmp = char1;
            char1 = char2;
            char2 = tmp;
        }
        // The combat goes on while one character dies, or when turn 100 is reached 
        while (true) {
            System.out.println("Turn: " + turn);
            System.out.println("Opponent 1: " + char1.getName() + '\n' + "Life: " + char1.getHp());
            System.out.println("Opponent 2: " + char2.getName() + '\n' + "Life: " + char2.getHp());
            System.out.println(char1.getName() + " attacks " + char2.getName() + " pour " + char1.getDamage() + " dégâts;");
            char2.receiveDamages(char1.strenght());
            if (char2.getHp() <= 0) {
                winner = char1;
                break;
            }
            System.out.println(char2.getName() + " attacks " + char1.getName() + " pour " + char2.getDamage() + " dégâts;");
            char1.receiveDamages(char2.strenght());
            if (char1.getHp() <= 0) {
                winner = char2;
                break;
            }
            if (turn == 100) {
            	break;
            }
            turn++;
        }
        System.out.println("The winner is " + winner.getName() + " with the class " + winner.getJob() + " !\n The combat ended at turn " + turn + ".");
    }
}