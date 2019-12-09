package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    // write your code here
        boolean choice = true; 
        Scanner sc = new Scanner(System.in);
        String entry; 
        while(choice){
            System.out.println("Bienvenue aventurier, dans le doux monde de la défaite");
            entry = sc.nextLine();
            switch(entry){
                case "exit":
                    choice = false;
                    break;
                case "help":  
            }
        }
    }
    public void helpCommand(){

    }
}
