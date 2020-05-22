package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello! Welcome to our cool little application! (...meow)");

        String name = getInput("What is your name?");

        int money = 0;

        try {
            money = Integer.parseInt(getInput("How much money do you make (Salary)?"));
        } catch (Exception err) {
            System.out.println("Hey, you did not enter a valid number!");
            money = Integer.parseInt(getInput("How much money do you make (Salary)?"));
        }

        System.out.println("Your name is: " + name + " and you make " + money + " dollars!");
    }

    public static String getInput(String prompt) {
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
