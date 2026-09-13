// Julia Conti - CSC 102, Fall 2026
// Program 3: Random number guessing game

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    /**
     * Allows user to play a random number guessing game, with a range of 1-100.
     */
    public static void numberGame() {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int i;
        int userNum = 0;
        int goalNum = rand.nextInt(100)+1;
        System.out.print("Julia's Random Number Guesstravaganza\nGuess the number (1-100)\n");
        for (i=0;;i++) {
            System.out.print("Guess " + (i+1) + ": ");
            userNum = scan.nextInt();
            if ((userNum > 100) || (userNum < 1)) {
                System.out.println("Guess is out of range. Try again.");
                i--;
                continue;
            } else if (userNum < goalNum) {
                System.out.println("Incorrect: your guess is lesser than the goal number.");
                continue;
            }
            else if (userNum > goalNum) {
                System.out.println("Incorrect: your guess is greater than the goal number.");
                continue;
            } else if (userNum == goalNum) {
                System.out.println("You got it! The number was " + goalNum + ".\nIt took you " + (i+1) + " guesses to win!");
                return;
            }
        }
    }
    /** main method */
    public static void main(String[] args) { numberGame(); }
}
