package edu.guilford;

import java.util.Arrays;
import java.util.Random;
// the keyword import tells java that we plan to use the specified class
import java.util.Scanner;

public class Sandbox {
    public static void main(String[] args) {
        // class nov 28
        int n = 10;
        // ask for 10!
        System.out.println("The value of " + n + "! is " + factorial(n));
        

    }
    // we changed (int n) to int nextN
    private static int factorial(int nextN) {
        // A recursive method for calculating the factorial of 
        // Base case
        if (nextN == 0) {
            return 1;
        } else  {
            int smallerFact = nextN * factorial(nextN - 1);
            return smallerFact;
        }


    }

}