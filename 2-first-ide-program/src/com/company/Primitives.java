package com.company;

//Primitives are the basic data types that are available in Java
public class Primitives {
    public static void main(String[] args) {
        int rollNo = 64; // 4 bytes
        char letter = 'r';

        // All decimal values will be of type double by default. We need to add `f` at the end to explicitly set it as float
        float marks = 98.67f; // 4 bytes
        double largeDecimalNumber = 45465465.181861; // 8 bytes

        // While entering large numbers, underscore will be ignored. Underscores can be used as a replacement to commas
        long largeIntegerValue = 8_468_464_646_496_846_984L; // 8 bytes
        boolean check = false; // or true

        // String is not primitive
        String name = "Terance";

        // There is also wrapper classes which gives more flexible methods to work with
        Integer rollNumber = 100;
        String stringifyRollNumber = rollNumber.toString();
        System.out.println(stringifyRollNumber);
    }
}
