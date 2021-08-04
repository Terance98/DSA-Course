package com.company;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        System.out.print("Enter two numbers : ");
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        if (a > b) System.out.println("Largest Number : " + a);
        else System.out.println("Largest Number : " + b);
    }
}
