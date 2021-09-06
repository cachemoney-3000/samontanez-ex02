/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Samontanez
 */

package exercise02;

import java.util.Scanner;

public class Solution02 {
    /*
    Create a program.
    print "What is the input string?" to prompt user,
    scanner reads the user's input,
    'name' = stores user's string input
    'len' = counts how many letters the user put in 'name'
    print = "<name> has <length> characters."
     */

    public static void main(String[] args) {
        System.out.print("What is the input string? ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        int len = name.length();

        System.out.println(name + " has " + len + " characters.");
    }
}