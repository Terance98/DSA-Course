package com.company;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        int i = 1;
        while (i <= num) {
            if (num % i == 0) System.out.println(i);
            i ++;
        }
    }
}
