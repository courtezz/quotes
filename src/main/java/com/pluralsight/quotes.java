package com.pluralsight;

import java.util.Scanner;

public class quotes {
    public static void main(String[] args) {

        //block of code
        String[] quotes = {"eat a apple ", "keep a apple", "kill a apple",
                "kiss a apple", "better me", "better you",
                "keep it up", "dont give up", "you will win",
                "yeaaaaaaa"};

        Scanner scanner = new Scanner(System.in);
        String quoteChoice;

        do {
            try {
                System.out.print("please pick a  numb er from 1-10: ");
                int num;
                String input = scanner.nextLine();
                num = Integer.parseInt(input);

                num--;

                System.out.println(quotes[num]);

            }
            catch (NumberFormatException nfe) {
                System.out.println("that wasent a number!");
            } catch (Exception e) {
                System.out.println("Your number was out of range");

            }
            System.out.println("would you like to try another Quote?: ");
            quoteChoice = scanner.nextLine();
        } while (quoteChoice.equalsIgnoreCase("yes"));
    }
}
