package com.pluralsight;

import java.io.*;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("=======================");
        System.out.println("Choose a story: ");
        System.out.println("Goldilocks");
        System.out.println("Hansel and Gretel");
        System.out.println("Mary had a Little Lamb");
        System.out.println("=======================");

        String fileName = "";
        // To exit while loop
        boolean fileFound = false;

        // Select story and invalid story input
        while (!fileFound) {
            fileName = inputScanner.nextLine();

            if (fileName.equalsIgnoreCase("Goldilocks")) {
                fileName = "goldilocks.txt";
                fileFound = true;
            } else if (fileName.equalsIgnoreCase("Hansel and Gretel")) {
                fileName = "hansel_and_gretel.txt";
                fileFound = true;
            } else if (fileName.equalsIgnoreCase("Mary had a Little Lamb")) {
                fileName = "mary_had_a_little_lamb.txt";
                fileFound = true;
            } else {
                System.out.println("Invalid input, please try again");
            }
        }
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Read lines with line number
            String line;
            int lineNUmber = 1;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println((lineNUmber) + ". " + line);
                lineNUmber++;
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}