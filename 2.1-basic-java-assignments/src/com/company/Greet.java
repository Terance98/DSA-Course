package com.company;

import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        System.out.print("Enter your name : ");

        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();

        System.out.println("Greetings " + name + "!");
    }
}
