package com.tns.dayfour.pattern;

public class PatternOne {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pattern

        // Loop to print upper half of the pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Loop to print lower half of the pattern
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
