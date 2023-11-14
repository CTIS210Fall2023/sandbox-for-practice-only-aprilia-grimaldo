package edu.guilford;

import java.util.Arrays;
import java.util.Random;
// the keyword import tells java that we plan to use the specified class
import java.util.Scanner;

public class Sandbox {
    public static void main(String[] args) {

        //using this instead of the dicerolling one we made in class
        Random rand = new Random();
        //Lets' also define how many dice we have and how many faces we have
        final int NDICE = 37;
        final int NFACES = 20; // could chnage this to be 100000
        // CHANGE STUDENTS PORTION MAYBE 100 STUDENTS
        // build out a histogram using the number of stduents
        // 1000 dice with 100 faces/die --> end up w/ how many
        // count th enumber of rows in each 1-10 and 11-20 etc
        // call this the bin and the count



        // *final* menas that the program cannot chnage the value
        // we use that for constant -- use capitals for identifiers
        //obvi dont us ethat if we want the playe rto get more dice as they get better etc. type of game

        //declare and create and array of dice values -- will be integers
        int[] dieValues = new int [NDICE];
        // now we want random values for each die; use a counting loop
        int index = 0;
        while (index < NDICE) { // while index is an allowed value
        dieValues[index] = rand.nextInt(NFACES) + 1;
        index = index + 1;
        }

        // this is another way of initialzingg an array a formula
        // thru an algorithm
        //let's see the results using a Java utility class Arrays

        int maxValue = dieValues[0];
    

        // find max value
        //set the max value to the first vlaue in the array

        // loop over each element inthe array
        for (int value: dieValues){ // loop over each element and store values in value
            if (value > maxValue) {
                maxValue = value;
            }

        }

        System.out.println("Max val: " + maxValue);
        //build th ehistogram
        final int NBINS = 10;
        int[] count = new int [NBINS];
        int binSize = NFACES / NBINS;
        // this works well if NFACES devenly divides NBINS
        for (int value: dieValues) {
            int bin = (value - 1)/ binSize; // this is the bin the vlue goe sin
            // if 83 then 82 and then / 100 = 8 in java BACK TO AUGUST
            count[bin] = count[bin] +1; // add one tto the value bin belongs to
            //print hthe result
            System.out.println("Histogram: " + Arrays.toString(count));

        }




        }



    }