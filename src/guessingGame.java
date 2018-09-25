//Alexander Cox
//Monday, September 24, 2018

import java.util.Scanner;

public class guessingGame {

    public static void main(String[] args)
    {
        int ranNum = (int)(100 * Math.random());

        System.out.println("Can you guess the random number?");
        System.out.println("It's between 1 and 100.");
        System.out.println("I'll tell you if your guess it too high or too low.");

        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();

        while (!(guess == ranNum))
        {
            if (guess > ranNum)
                System.out.println("Sorry; that guess was too high. Try again.");
            if (guess < ranNum)
                System.out.println("Sorry; that guess was too low. Try again.");
            guess = input.nextInt();
        }

        input.close();
        System.out.println("Correct! The number was " + ranNum + ".");

    }
}
