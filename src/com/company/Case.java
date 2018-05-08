package com.company;

import java.util.Scanner;

public class Case {

    private static Scanner sc = new Scanner(System.in);

    public static void bmi() {

        System.out.println("Skriv in vikt ");

        double weight = sc.nextDouble();

        System.out.println("Skriv in din längd");
        double lenght = sc.nextDouble();

        double BMI = lenght / (weight * weight);

        System.out.println(BMI);

    }

    public static void loop() {

        for (int i = 1; i < 10; i++) {

            System.out.println(i);
        }
    }

    public static void decimalTal() {

        System.out.println("Skriv in en decimal ");
        double number = sc.nextDouble();

        double oneDecimal = (int) (number * 10) / 10.0;
        System.out.println(oneDecimal);

    }

    public static void digital() {

        System.out.print("Ange ett tal mellan 1-999?");
        int tal = sc.nextInt();

        int firstDigit = tal % 10;
        int remainingNumber = tal / 10;
        int secondDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int thirdDigit = remainingNumber % 10;

        System.out.println(firstDigit + secondDigit + thirdDigit);

    }

    public static void guessGame() {

        Scanner scan = new Scanner(System.in);
        System.out.println("What Is The Capital Of Sweden?");
        String input = scan.nextLine();

        if (input.equalsIgnoreCase("Stockholm")) {
            // if type correct
            System.out.println("Correct");
        }

        // else Wrong answer
        else {
            System.out.println("Wrong");


        }
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true) {
            // Shows menu
            System.out.println("---------------MENU---------------");
            System.out.println("1. BMI ");
            System.out.println("2. loop");
            System.out.println("3. deicmal tal");
            System.out.println("4. digital");
            System.out.println("5. guess");
            System.out.println("0. avsluta");

            System.out.println("Choose one on the menu: ");

            //Väljarens val kod
            int choice = in.nextInt();

            //Visar menyets val
            switch (choice) {

                case 0:
                    return;

                case 1:
                    bmi();
                    break;
                case 2:
                    loop();
                    break;
                case 3:
                    decimalTal();
                    break;
                case 4:
                    digital();
                    break;
                case 5:
                    guessGame();
                    break;
                default:
                    System.out.println("errror, choose one of the following numbers.");
            }
        }
    }
}