package com.company;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Main {

    public static void main(String[] args) {
    // write your code here
        boolean choice = true; 
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
                    createCharacter();
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
    }
}
