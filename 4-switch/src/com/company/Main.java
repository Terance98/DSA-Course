package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print("Enter a fruit: ");
        Scanner in = new Scanner(System.in);

        String fruit = in.next();

        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits!");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Orange" -> System.out.println("Round fruit");
            case "Grapes" -> System.out.println("Small fruit");
            default -> System.out.println("Invalid fruit");
        }

        System.out.println("Enter a employee id and department: ");
        int empId = in.nextInt();
        String department = in.next();

        switch (empId) {
            case 1 -> System.out.println("Thomas Terance");
            case 2 -> System.out.println("Big Smilee");
            case 3 -> {
                System.out.println("Employee number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department chosen");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No valid department chosen");
                }
            }
            default -> System.out.println("Enter a valid employee id");
        }
    }
}
