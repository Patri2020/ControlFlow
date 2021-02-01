package com.company;
import java.util.Random;
import java.util.Scanner;
import java.text.*;
import java.math.*;
import java.awt.*;

public class AsciiChars {
    public static void main(String[] args) {
        //      System.out.println("Hello World");
        //      Print valid numeric input 48 to 57 for number values 0 to 9
        System.out.println("Type a number between 48 to 57");

        Scanner keyboard = new Scanner(System.in);

        int asciiValue = keyboard.nextInt();
        char digit = (char) asciiValue;

        System.out.println("This is your typed number as an Ascii character between 0 to 9 => " + digit);

//    public static void printLowerCase()
//    {
//        // TODO: print valid lowercase alphabetic input = 97 to 122
        System.out.println("Type a number between 97 to 122");

        Scanner keyboard2 = new Scanner(System.in);

        int asciiValue2 = keyboard2.nextInt();
        char digit2 = (char) asciiValue2;

        System.out.println("This is your typed number as an Ascii lowercase letter => " + digit2);


//    public static void printUpperCase()
//    {
//        // TODO: print valid uppercase alphabetic input = 65 to 90
        System.out.println("Type a number between 65 to 90");

        Scanner keyboard3 = new Scanner(System.in);

        int asciiValue3 = keyboard3.nextInt();
        char digit3 = (char) asciiValue3;

        System.out.println("This is your typed number as an Ascii UPPERCASE letter => " + digit3);

        System.out.println("What is your name?");
        Scanner keyboard4 = new Scanner(System.in);
        String inputName = keyboard4.next();

        System.out.println("Hello " + inputName + "!" + "\n");

        System.out.println("Peanut, would you like to continue into the interactive portion?");

        Scanner keyboard5 = new Scanner(System.in);
        String decision; boolean yn;
        String inputMore = keyboard5.next();

        while (true) {
            inputMore = keyboard5.nextLine().toLowerCase();
            if (inputMore.equals("y")) {
                yn = true;
                System.out.println("Great! Let's get started. " +"\n");
                break;
            } else if (inputMore.equals("n")) {
                yn = false;
                System.out.println("Ok, no worries. Have a nice day, goodbye.");
                break;
            } else {
                System.out.println("Sorry, I didn't catch that. Please answer y or n");
            }
        }
            System.out.println("Do you have a red car?");
            Scanner keyboard6 = new Scanner(System.in);
            String decision2;
            boolean yn2;
            String inputCar = keyboard6.next();

            while (true) {
                inputCar = keyboard6.nextLine().trim().toLowerCase();
                if (inputCar.equals("y")) {
                    yn2 = true;
                    System.out.println("Everyone does sooner or later");
                    break;
                } else if (inputCar.equals("n")) {
                    yn2 = false;
                    System.out.println("Good for you, you are saving money on auto insurance!");
                    break;
                } else {
                    System.out.println("Sorry, I didn't catch that. Please answer y or n");
                }
                }
        System.out.println("What is your favorite pet's name?");
        Scanner keyboard7 = new Scanner(System.in);
        String inputPetName = keyboard7.next();

        System.out.println("What is the age of your favorite pet?");
        Scanner keyboard8 = new Scanner(System.in);
        int inputPetAge = keyboard8.nextInt();

        System.out.println("What do you think is your lucky number?");
        Scanner keyboard9 = new Scanner(System.in);
        int inputLuckyNumber = keyboard9.nextInt();

        System.out.println("Who is your favorite quarterback?");
        Scanner keyboard10 = new Scanner(System.in);
        String inputQB = keyboard10.next();

        System.out.println("What is their jersey number?");
        Scanner keyboard11 = new Scanner(System.in);
        int inputQBNumber = keyboard11.nextInt();

        System.out.println("What year is your car?");
        Scanner keyboard12 = new Scanner(System.in);
        int inputCarYr = keyboard12.nextInt();

        System.out.println("Who is your favorite actor (m/f)");
        Scanner keyboard13 = new Scanner(System.in);
        String inputActorName = keyboard13.next();

        System.out.println("Choose a number between 1 and 50?");
        Scanner keyboard14 = new Scanner(System.in);
        int inputRandomNumber = keyboard14.nextInt();

        //Random Lottery Numbers - 5

        Random randomNumbers = new Random();
        int maxLotto = 65;
        int minLotto = 1;

        int number = randomNumbers.nextInt((maxLotto - minLotto + 1)) + minLotto;
        System.out.println(number);

        int number2 = randomNumbers.nextInt((maxLotto - minLotto + 1)) + minLotto;
        System.out.println(number2);

        int number3 = randomNumbers.nextInt((maxLotto - minLotto + 1)) + minLotto;
        System.out.println(number3);

        int number4 = randomNumbers.nextInt((maxLotto - minLotto + 1)) + minLotto;
        System.out.println(number4);

        int number5 = randomNumbers.nextInt((maxLotto - minLotto + 1)) + minLotto;
        System.out.println(number5);

        //Random Magic Ball - 1

        Random magicBall = new Random(1);
        int maxMagicBall = 75;
        int minMagicBall = 1;
        int QB = inputQBNumber;
        int randNumber = number;
        int product = QB*randNumber;
        if (product > 65) {
            product = 65;
        }
        else if (product < 0) {
            product = 1;
        }

//        int number6 = (randomNumbers.nextInt((maxMagicBall - minMagicBall + 1)) + minMagicBall;
        System.out.println("Magic Ball Number: "+product);

        //Lottery Numbers - 5 (with user input)

        //Random Lottery Numbers - 5

//        Random randomNumbers = new Random(5);
        int carYr = inputCarYr;
        int luckyNumber = inputLuckyNumber;
        int add = inputCarYr+inputLuckyNumber;
        if (add > 65) {
            add = 65;
        }
        else if (add < 0) {
            add = 1;
        }
        int rNumber = inputRandomNumber;
        int randNumber2 = number2;
        int subtract = inputRandomNumber-randNumber2;
        if (subtract > 65) {
            subtract = 65;
        }
        else if (subtract < 0) {
            subtract = 1;
        }
        int valueNumber = 42;
        int petAge = inputPetAge;
        int add2 = inputCarYr+inputPetAge;
        if (add2 > 65) {
            add2 = 65;
        }
        else if (add2 < 0) {
            add2 = 1;
        }
        int qbNumber = inputQBNumber;
        int threeNumbers = inputQBNumber+inputLuckyNumber+inputPetAge;
        if (threeNumbers > 65) {
            threeNumbers = 65;
        }
        else if (threeNumbers < 0) {
            threeNumbers = 1;
        }


//        int lottoNumber1 = randomNumbers.nextInt((maxLotto - minLotto + 1)) + minLotto;

        System.out.println("Lottery Number # 1: "+add);

        System.out.println("Lottery Number # 2: "+subtract);

        System.out.println("Lottery Number # 3: "+valueNumber);

        System.out.println("Lottery Number # 4: "+add2);

        System.out.println("Lottery Number # 5: "+threeNumbers);


            }
        }