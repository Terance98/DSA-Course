package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.print("Enter two numbers : ");
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        System.out.print("Enter the operator: ");
        char operator = in.next().charAt(0);

        if (operator == '+') System.out.println("Sum : " + n1 + n2);
        else if (operator == '-') System.out.println("Difference : " + (n1 - n2));
        else if (operator == '*') System.out.println("Product : " + n1 * n2);
        else if (operator == '/') System.out.println("Quotient : " + n1 / n2);
        else if (operator == '%') System.out.println("Modulus : " + n1 % n2);
        else System.out.println("Invalid operator!");
    }
}
