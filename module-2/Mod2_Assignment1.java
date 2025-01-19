/*Mark White
CSD402
Mod2_Assignment1*/

import java.util.Random;
import java.util.Scanner;

public class Mod2_Assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Let's play Rock-Paper-Scissors!");
        System.out.println("Enter your choice (1 for Rock, 2 for Paper, 3 for Scissors):");
        
        int userChoice = scanner.nextInt();
        int computerChoice = random.nextInt(3) + 1;
        
        // Display choices
        System.out.println("\nYour choice: " + getChoiceName(userChoice));
        System.out.println("Computer's choice: " + getChoiceName(computerChoice));
        
        // Determine winner
        if (userChoice == computerChoice) {
            System.out.println("\nIt's a tie!");
        } else if ((userChoice == 1 && computerChoice == 3) ||
                   (userChoice == 2 && computerChoice == 1) ||
                   (userChoice == 3 && computerChoice == 2)) {
            System.out.println("\nYou win!");
        } else {
            System.out.println("\nComputer wins!");
        }
        
        scanner.close();
    }
    
    private static String getChoiceName(int choice) {
        switch (choice) {
            case 1: -> "Rock";
            case 2: -> "Paper";
            case 3: -> "Scissors";
            default: -> "Invalid";
        }
    }
}
