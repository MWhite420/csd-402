/*
Mark White
CSD402
Assignment9 Part 1*/
import java.util.ArrayList;
import java.util.Scanner;

public class Fruit {
    public static void main(String[] args) {
        // Create an ArrayList with String elements
        ArrayList<String> strings = new ArrayList<>();
        strings.add("1. Apple");
        strings.add("2. Banana");
        strings.add("3. Cherry");
        strings.add("4. Orange");
        strings.add("5. Raspberry");
        strings.add("6. Strawberry");
        strings.add("7. Grape");
        strings.add("8. Pineapple");
        strings.add("9. Blueberry");
        strings.add("10. Lemon");

        // Print the ArrayList 
        System.out.println("Elements in the ArrayList:");
        for (String fruit : strings) {
            System.out.println(fruit);
        }

        // Ask user for the index of the element to see again
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the element you want to see again (1 to 10): ");

        try {
            int index = Integer.parseInt(scanner.nextLine()); 
            // Attempt to print the selected element
            System.out.println("You selected: " + (strings.get(index - 1))); 
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown: Out of Bounds");
        } catch (NumberFormatException e) {
            System.out.println("Exception thrown: Invalid input. Please enter a number.");
        }

        scanner.close();
    }
}