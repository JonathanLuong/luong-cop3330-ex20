package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Luong
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); // Creates reader

        System.out.printf("What is the order amount? ");
        String price = reader.nextLine();
        System.out.printf("What is the state? ");
        String state = reader.nextLine();


        float p = Float.parseFloat(price);
        float taxes = 0;
        float total = 0;

        if(state.equals("WI") || state.equals("Wisconsin")) {
            System.out.printf("What county do you live in? ");
            String county = reader.nextLine();
            if (state.equals("Eau Claire")) {
                total = p + (p*(float)0.055);
                System.out.printf("The subtotal is $%.2f.", p);
                System.out.printf("\nThe tax is $%.2f.", p*0.055);
                System.out.printf("\nThe total is $%.2f.", total);
            }
            else if (state.equals("Dunn ")) {
                total = p + (p*(float)0.054);
                System.out.printf("The subtotal is $%.2f.", p);
                System.out.printf("\nThe tax is $%.2f.", p*0.055);
                System.out.printf("\nThe total is $%.2f.", total);
            }
            else {
                total = p + (p*(float)0.05);
                System.out.printf("The subtotal is $%.2f.", p);
                System.out.printf("\nThe tax is $%.2f.", p*0.05);
                System.out.printf("\nThe total is $%.2f.", total);
            }
        }
        else if(state.equals("IL") || state.equals("Illinois ")) {
            total = p + (p* (float) 0.08);
            System.out.printf("The subtotal is $%.2f.", p);
            System.out.printf("\nThe tax is $%.2f.", p*0.08);
            System.out.printf("\nThe total is $%.2f.", total);
        }
        else {
            System.out.printf("The total is $%.2f.", p);
        }
    }
}