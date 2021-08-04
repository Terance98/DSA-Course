package com.company;

import java.util.Scanner;

public class SumTillZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int sum = 0;

        System.out.println("Keep entering the numbers till 0 :");
        while(true) {
            num = in.nextInt();
            if(num == 0){
                System.out.println(sum);
                return;
            }
            sum += num;
        }
    }
}
