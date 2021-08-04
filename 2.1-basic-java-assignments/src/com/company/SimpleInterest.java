package com.company;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        System.out.print("Enter the principle, time and rate : ");
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int t = in.nextInt();
        int r = in.nextInt();

        int simpleInterest = p * r * t;

        System.out.println("Simple Interest : " + simpleInterest);
    }
}
