// Julia Conti - CSC 102, Fall 2026
// Program 4: Box volume calculator

import java.util.Scanner;

public class BoxVolume {
    /**
     * Calculates volume of a box based on length, width, and height.
     * @param l Length of box
     * @param w Width of box
     * @param h Height of box
     * @return Volume of box
     */
    public static double getVolume(double l, double w, double h) {
        return l*w*h;
    }
    /** main method */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int goAgain;
        do {
            System.out.print("Enter box length: ");
            double l = scan.nextDouble();
            System.out.print("\nEnter box width: ");
            double w = scan.nextDouble();
            System.out.print("\nEnter box height: ");
            double h = scan.nextDouble();
            System.out.printf("\nBox volume: %.2f \nGo again?\n1 for yes\n-1 for no\n--> ", getVolume(l, w, h));
            goAgain = scan.nextInt();
            while ((goAgain < -1) || (goAgain > 1) || (goAgain == 0)) {
                System.out.println("Incorrect input. Try again:\n\nGo again?\n1 for yes\n-1 for no\n--> ");
                goAgain = scan.nextInt();
            }
        } while (goAgain != -1);
        System.out.println("Ok, bye bye");
    }
}
