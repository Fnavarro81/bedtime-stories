package com.pluralsight;
import java.io.*;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        try {
            Scanner inputScanner = new Scanner(System.in);

            System.out.println("=======================");
            System.out.println("Choose a story: ");
            System.out.println("Goldilocks");
            System.out.println("Hansel and Gretel");
            System.out.println("Mary had a Little Lamb");
            System.out.println("=======================");

            String fileName = inputScanner.nextLine();
            boolean fileFound = false;

            while (fileFound){
                if (fileName.equalsIgnoreCase("Goldilocks")){
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
    }
}
