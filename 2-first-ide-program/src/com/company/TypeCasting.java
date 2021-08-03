package com.company;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Type conversion -> If an integer value is inputted, it will automatically be converted to float
        // The condition here is that the lhs ( expected type ) should be >= the rhs type ( inputted type )
        float num = input.nextFloat();
        System.out.println(num);

        // Type casting -> converting from one type to another type
        int floatToInteger = (int) 65.54f;
        System.out.println(floatToInteger);

        // Automatic type promotion in expressions
        int a = 257;

        // The maximum value that can be held in a byte is 256. That is why it will take the modulus of any value greater than 256 by default
        byte b = (byte) a; // 257 % 256 = 1

        System.out.println(b);

        byte n1 = 40;
        byte n2 = 50;
        byte n3 = 100;

        // Here 40 * 50 will give 2000 which is above the limit that `byte` datatype can hold. Here Java will automatically promote this to `int` datatype
        int nCompute = ( n1 * n2 ) / n3;
        System.out.println(nCompute);

        byte k = 50;
        // Method 1
        // k = k * 2; // This will throw an error because during the computation, Java will automatically convert this to int ( RHS ). Now k still being of `byte` datatype can't hold an `int` value

        //Method 2
        k = (byte) (k * 2); // This will work because we are converting it back to byte here.
        System.out.println(k);

        int asciiChar = 'A';
        System.out.println(asciiChar);

        byte b1 = 42;
        char c1 = 'a';
        short s1 = 1024;
        int i1 = 50000;
        float f1 = 5.67f;
        double d1 = 0.1234;
        double result = (f1 * b1) + (i1 / c1) - (d1 * s1);
        //float + int - double       -> The max among this is double so the final value will be in double
        System.out.println((f1 * b1) + " " + (i1 / c1)  + " " + (d1 * s1));
        System.out.println(result);
    }
}
