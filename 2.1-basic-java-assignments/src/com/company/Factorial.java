package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = in.nextInt();

        int i = 1;
        int factorial = 1;
        while(i <= number) {
           factorial *= i;
           i++;
        }

        System.out.println("Factorial : " + factorial);
    }
}
