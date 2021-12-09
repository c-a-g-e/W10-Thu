package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static void prompt() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Which season do you like the most?");

        Seasons input = Seasons.WINTER;

        switch (input) {
            case AUTUMN -> System.out.println("Autumn is ...");
            case WINTER -> System.out.println("Winter is ...");
            case SPRING -> System.out.println("Spring is ...");
            case SUMMER -> System.out.println("Summer is ...");
            default -> System.out.println("Invalid input!");
        }
    }

}
//can be treated like public static variables w/o being declared as such
enum Seasons {

    AUTUMN, WINTER, SPRING, SUMMER

}


