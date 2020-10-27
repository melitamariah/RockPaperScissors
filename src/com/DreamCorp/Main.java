package com.DreamCorp;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String playerOne = "";
        String computerPlay = "";
        String again = "";
        int computerInt = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("--------------------");
            System.out.print("Wanna play a game? Y/N? ");
            playerOne = scanner.next().toUpperCase();
            if (playerOne.equals("N")) {
                System.out.println("Alright, next time.");
                continue;
            }
            if (!playerOne.equals("Y")) {
                System.out.println("Run that back.. I said choose yes or no.");
                continue;
            }
            System.out.println("Let's go. Rock, Paper, Scissors!\n" +
                        "Rock = R, Paper " + "= P, and Scissors = S.");


            Random generator = new Random();
            computerInt = generator.nextInt(3) + 1;

            if (computerInt == 1) {
                computerPlay = "R";
            } else if (computerInt == 2) {
                computerPlay = "P";
            } else if (computerInt == 3) {
                computerPlay = "S";
            }

            System.out.print("Choose your weapon: ");
            playerOne = scanner.next().toUpperCase();
            System.out.println();


            System.out.println(computerPlay + " -VS- " + playerOne);
            System.out.println();

            if (playerOne.equals(computerPlay))
                System.out.println("It's a tie!");

            if (playerOne.equals("R"))
                if (computerPlay.equals("S"))
                    System.out.println("Rock smashes scissors. Looks like you win!");
                else if (computerPlay.equals("P"))
                    System.out.println("Paper covers rock. You lose!");

                if (playerOne.equals("P"))
                    if (computerPlay.equals("S"))
                        System.out.println("Scissor cuts paper. Take this L!");
                    else if (computerPlay.equals("R"))
                        System.out.println("Paper covers rock. You got lucky!");

                     if (playerOne.equals("S"))
                        if (computerPlay.equals("P"))
                            System.out.println("Scissor cuts paper. You think you good?!");
                        else if (computerPlay.equals("R"))
                            System.out.println("Rock breaks scissors. Sucks to suck.");

                        else
                            System.out.println("This ain't gon' work..");
        }

    }
}





