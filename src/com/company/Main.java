package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    // write your code here
        boolean choice = true; 
        Scanner sc = new Scanner(System.in);
        String entry;
        System.out.println("Bienvenue aventurier, dans le doux monde de la défaite.");
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
}
