
package com.company;
import java.lang.Math;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in); //imports scanner
        boolean again = true; //used to check if player wants to play again. starts out as yes
        int playerScore = 0; //declared to make a scoreboard
        int compScore = 0;

        System.out.println("Welcome to rock, paper, scissors!");

        while (again == true) { //checks if player wants to play again
            again = false;

            //calculates computer choice by using random number
            String compChoice;
            double compNum = Math.random() * 3;
            if (compNum < 1) { //converts computer choice from number to actual choice in the game
                compChoice = "rock";
            } else if (compNum < 2) {
                compChoice = "paper";
            } else {
                compChoice = "scissors";
            }


            //System.out.println("comp has chosen: " + compChoice);

            //takes user input
            System.out.println("Would you like rock, paper, or scissors? ");
            String userChoice = (input.next()).toLowerCase();
            userChoice = moveChecker(userChoice);

            //prints what the user has chosen and what the user has chosen
            System.out.println("You have chosen " + userChoice);
            System.out.println("Computer has chosen " + compChoice + "\n");


            //prints what the result of the comparison is
            if (compChoice.equals(userChoice)) {
                System.out.println("It's a tie!");
            }

            else if (compChoice.equals("rock") && userChoice.equals("paper")) {
                System.out.println("You win!");
                playerScore++;
            }

            else if (compChoice.equals("paper") && userChoice.equals("scissors")) {
                System.out.println("You win!");
                playerScore++;
            }

            else if (compChoice.equals("scissors") && userChoice.equals("rock")) {
                System.out.println("You win!");
                playerScore++;
            }

            else {
                System.out.println("You lose!");
                compScore++;
            }

            //displays the scoreboard
            System.out.println("");
            System.out.println("Computer Score: " + compScore);
            System.out.println("Player Score: " + playerScore + "\n");

            //checks if the user wants to play again
            System.out.println("Would you like to play again? (y/n) ");
            String playAgain = (input.next()).toLowerCase();
            playAgain = againChecker(playAgain);

            if (playAgain.equals("y")) {
                again = true;
            }
        }

        //prints the final score
        System.out.println("FINAL SCORE");
        System.out.println("Computer Score: " + compScore);
        System.out.println("Player Score: " + playerScore + "\n");
        System.out.println("Thank you for playing!");

    }


    //checks the user input when asked if they want to play again
    public static String againChecker (String input) {
        Scanner check = new Scanner (System.in);
        while (!input.equals("y") && !input.equals("n")) {
            System.out.println("That is not a valid input. Please use 'y' or 'n' ");
            input = check.next();
            input = input.toLowerCase();
        }
        return input;
    }


    //checks the player move to make sure it is actually rock, paper, or scissors
    public static String moveChecker (String input) {
        Scanner check = new Scanner (System.in);
        while (!input.equals("rock") && !input.equals("paper") && !input.equals("scissors")) {
            System.out.println("That is not a valid input. Please use rock, paper, or scissors");
            input = check.next();
            input = input.toLowerCase();
        }
        return input;
    }











}
