package Ex17;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Christopher Jean
 */
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a 1 if you're a male or a 2 if you are a female:");
        int sex = input.nextInt();
        System.out.println("How many ounces of alcohol did you have? ");
        int ozalc = input.nextInt();
        System.out.println("What is your weight in pounds? ");
        int weight = input.nextInt();
        System.out.println("How many hours has it been since your last drink");
        int time = input.nextInt();

        if (sex == 1) {
            double BAC = (((ozalc * 5.14) / (weight * 0.73)) - 0.015 * time);
            final String msg = BAC > 0.08
                    ? "Your BAC is "+BAC +"\n"+"It is not legal for you to drive."
                    : "Your BAC is "+BAC +"\n"+"It is legal for you to drive.";

            System.out.println(msg);
        }
        if (sex == 2) {
            double BAC = (((ozalc * 5.14) / (weight * 0.66)) - 0.015 * time);
            final String msg = BAC > 0.08
                    ? "Your BAC is "+BAC +"\n"+"It is not legal for you to drive."
                    : "Your BAC is "+BAC +"\n"+"It is legal for you to drive.";

            System.out.println(msg);
        }

    }
}
