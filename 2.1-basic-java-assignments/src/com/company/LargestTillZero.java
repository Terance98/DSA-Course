package com.company;

import java.util.Scanner;

public class LargestTillZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int largest = 0;
        int n;
        System.out.println("Keep entering the numbers till 0 :");
        while(true) {
            n = in.nextInt();
            if( n == 0 ) {
                System.out.println("Largest number : " + largest);
                return;
            }
            if (n > largest) largest = n;
        }
    }
}
