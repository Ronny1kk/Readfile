package readfile;

import java.util.Scanner;
import java.io.*;

public class readcC {

    public static void main(String[] args) throws IOException {

        // Create keyboard scanner
        Scanner keyboard = new Scanner(System.in);

        // Ask user for file name
        System.out.print("What file do you want to open? ");
        String userInput = keyboard.nextLine();

        // Open file
        File userFile = new File(userInput);
        Scanner inputFile = new Scanner(userFile);

        // Display file contents
        System.out.println("\n----- FILE CONTENTS -----");

        while (inputFile.hasNextLine()) {
            System.out.println(inputFile.nextLine());
        }

        // Ask user which file to append to
        System.out.print("\nWhat file do you want to add data to? ");
        String userAppend = keyboard.nextLine();

        // Ask user for data to append
        System.out.print("What do you want to add? ");
        String inputAppend = keyboard.nextLine();

        // Append data to file
        FileWriter fw = new FileWriter(userAppend, true);
        PrintWriter pw = new PrintWriter(fw);
        
        pw.println(inputAppend);
        
        System.out.println("Data successfully added.");

        // Close files
        inputFile.close();
        pw.close();
        keyboard.close();
    }
}