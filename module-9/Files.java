/*
Mark White
CSD402
Assignment9 Part 2*/

import java.io.*;
import java.util.Random;


public class Files {
    public static void main(String[] args) {
        String fileName = "data.file";
        Random rand = new Random();
        int[] numbers = new int[10];

        // Generate 10 random integers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100); // Random number between 0 and 99
        }

        // Write to the file (create if not exists, else append)
        try (FileWriter fw = new FileWriter(fileName, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            for (int number : numbers) {
                out.print(number + " ");
            }
            out.println(); // New line after writing numbers
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read from the file and display the numbers
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Contents of " + fileName + ":");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}