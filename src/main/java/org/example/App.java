package org.example;

/*
 *  UCF COP3330 Fall 2021 exercise 16 Solution
 *  Copyright 2021 Luis Figueroa
 */

import java.util.Scanner; //the scanner utility

public class App {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int age; //declare the variable

        System.out.print("What is your age? ");
        age = userInput.nextInt();

        //establish the ok case
        if (age > 15) {

            System.out.print("You are old enough to legally drive.");
        }

        //if is not ok then
        else {
            System.out.println("You are not old enough to legally drive.");
        }
    }
}
