package com.company;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int n = in.nextInt();
        int c = 2;
        if (n <= 1) {
            System.out.println("Neither prime nor composite");
            return;
        }

        if (n == 4) {
            System.out.println("Not prime");
            return;
        }

        while(c * c < n) {
            if(n % c == 0) {
                System.out.println("Not prime");
                return;
            }
            c ++;
        }
        System.out.println("Prime");
    }
}