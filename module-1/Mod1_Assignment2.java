/*Mark White
 * CSD402
 * Assignment1.2
 * */

import java.util.Scanner;

public class Mod1_Assignment2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the amount of water in kilograms: ");
    double waterMass = scanner.nextDouble();

    System.out.print("Enter the initial temperature of the water in Celsius: ");
    double initialTemperature = scanner.nextDouble();

    System.out.print("Enter the final temperature of the water in Celsius: ");
    double finalTemperature = scanner.nextDouble();

    double Q = waterMass * (finalTemperature - initialTemperature) * 4184;

    System.out.println("The energy needed to heat the water is: " + Q + " Joules");

    scanner.close();
  }
}