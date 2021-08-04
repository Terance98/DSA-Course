package com.company;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}
