package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        diceGame();

    }

    public static void diceGame() {

        Scanner input = new Scanner(System.in);

        Random rnd = new Random();

        System.out.println("Welcome! Let's Play Roll Dice!");

        int numOne = 0;
        int numTwo = 0;
        int score = 0;
        int scoreReset=0;

        String choice="";


        while(!choice.equalsIgnoreCase("no")) {

            numOne = 1 + rnd.nextInt(6);  //generate random numbers
            numTwo = 1 + rnd.nextInt(6);  //generate random numbers

            System.out.println("Your rolls" + " " + numOne + " " + "&" + " " + numTwo);


            if ((numOne == 1) & (numTwo == 1))

            {
                 scoreReset = 25;
                System.out.println("Score:" +scoreReset);
            }

            else if ((numOne == 1) | (numTwo == 1))

            {
                score += 0;
                System.out.println(score);
            }

            else if (score > 100)

            {
                System.out.println("You have scored over 100.\nThank you for playing");
                System.exit(0);
            }

            else

                {
                     score += (numOne + numTwo) ;
                     System.out.println(score);
                }


            System.out.println("Roll again ?");
            System.out.println("Please type YES or NO");
            choice = input.nextLine();

        }

             System.out.println("Thank you for playing");
        }
    }

