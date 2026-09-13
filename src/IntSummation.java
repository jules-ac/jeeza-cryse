// Julia Conti - CSC 102, Fall 2026
// Program 5: Ascending integer summation

import java.util.Scanner;

public class IntSummation {
    /**
     * Calculates descending summation of
     * a number, finishing at 1.
     * @param max Number to decrement and sum
     */
    public static void Summation(int max) {
        int total = 0;
        for (int i=0;i<=max;i++) {
            total += i;
        }
        System.out.println("The descending summation of " + max + " is " + total);
    }
    /** main method */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer, or multiple integers separated by\nspaces, to calculate their summation descending to 1.\nEnter -1 to quit.\n--> ");
        int userInt = scan.nextInt();
        while (userInt != -1) {
            Summation(userInt);
            userInt = scan.nextInt();
        }
    }
}
