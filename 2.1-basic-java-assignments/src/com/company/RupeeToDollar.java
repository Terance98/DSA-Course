package com.company;

import java.util.Scanner;

public class RupeeToDollar {
    public static void main(String[] args) {
        float rupeesToDollarRatio = 0.01347f;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount in rupees : ");

        int amount = in.nextInt();
        float convertedAmount = amount * rupeesToDollarRatio;

        System.out.println("Amount in dollars : " + convertedAmount);
    }
}
