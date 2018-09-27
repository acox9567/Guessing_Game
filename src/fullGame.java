//Alexander Cox
//Tuesday, September 25, 2018

import java.util.InputMismatchException;
import java.util.Scanner;

public class fullGame {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = input.nextLine();
        System.out.println("Hi " + name + ", do you want to guess my number or do ur want me to guess yours?");
        System.out.println("Enter '1' to guess the CPU's number or '2' to have the CPU guess your number.");

        int gameMode = 0;
        boolean gmDef = false;

        while(!gmDef)
        {
            try
            {
                gameMode = input.nextInt();
                if(gameMode == 1 || gameMode == 2)
                    gmDef = true;
                else
                    System.out.println("Enter '1' to guess the CPU's number or '2' to have the CPU guess your number.");

            }
            catch (InputMismatchException e)
            {
                System.out.println(e);
                System.out.println("Enter '1' to guess the CPU's number or '2' to have the CPU guess your number.");
                input.next();
            }
        }

        System.out.println("Ok, now what difficulty do you want to play on?");

        int difficulty = 0;

        System.out.println("Enter '10' for numbers 1-10, '100' for numbers 1-100, '1000' for numbers 1-1000, or '10000' for numbers 1-10000.");

        boolean dDef = false;

        while (!dDef) {
            try {
                difficulty = input.nextInt();
                if(difficulty == 10 || difficulty == 100 || difficulty == 1000 || difficulty == 10000)
                    dDef = true;
                else
                    System.out.println("Enter '10' for numbers 1-10, '100' for numbers 1-100, '1000' for numbers 1-1000, or '10000' for numbers 1-10000.");
            } catch (InputMismatchException e) {
                System.out.println(e);
                System.out.println("Enter '10' for numbers 1-10, '100' for numbers 1-100, '1000' for numbers 1-1000, or '10000' for numbers 1-10000.");
                input.next();
            }
        }

        if (gameMode == 1)
        {
            guessingGame(name, difficulty);
        }
        else if (gameMode == 2)
        {
            aiGuessingGame(name, difficulty);
        }
    }

    public static void guessingGame(String name, int difficulty)
    {
        int ranNum = (int)(difficulty * Math.random());
        int gNum = 0;

        System.out.println("Ok, start guessing, I'll tell you if your guess is too high or too low.");

        Scanner input = new Scanner(System.in);

        int guess = 0;

        try
        {
            guess = input.nextInt();
        }
        catch(InputMismatchException e)
        {
            System.out.println("You must enter and integer.");
            input.next();
        }

        while (!(guess == ranNum))
        {
            if (guess > ranNum)
                System.out.println("Sorry " + name + "; that guess was too high. Try again.");
            if (guess < ranNum)
                System.out.println("Sorry " + name + "; that guess was too low. Try again.");
            gNum++;

            try
            {
                guess = input.nextInt();
            }
            catch(InputMismatchException e)
            {
                System.out.println("You must enter and integer.");

                input.next();
            }
        }

        gNum++;
        input.close();
        System.out.println("Nice job " + name + "! The number was " + ranNum + ", and it took you " + gNum + " guesses to get it.");
    }

    public static void aiGuessingGame(String name, int difficulty)
    {
        int max = difficulty;

        System.out.println("Ok " + name + ", think of a number.");
        System.out.println("After each of my guesses you have to tell me if it's 'too high' or 'too low'.");
        System.out.println("Enter 'correct' when I guess right.");

        Scanner input = new Scanner(System.in);

        int guess = (max/2);
        int mod = (max/4);
        int gNum = 0;

        System.out.println("Is your number " + guess + "?");
        String uInput = input.nextLine();

        while(!(uInput.equals("correct")))
        {
            if(uInput.equals("too high"))
            {
                guess -= mod;
                mod = mod / 2;
                if(mod <= 0)
                    mod = 1;
                gNum++;
            }
            else if(uInput.equals("too low"))
            {
                guess += mod;
                mod = mod / 2;
                if(mod <= 0)
                    mod = 1;
                gNum++;
            }
            else
            {
                System.out.print("Sorry " + name + " I don't understand. ");
            }

            System.out.println("Is your number " + guess + "?");

            uInput = input.nextLine();
        }

        gNum++;

        input.close();
        System.out.println("It only took me " + gNum + " guesses.");
    }
}
