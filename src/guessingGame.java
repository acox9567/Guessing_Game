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
        int guess = 0;

        while (guess != ranNum)
        {
            guess = input.nextInt();
            if (guess == ranNum) ;
                System.out.println("Correct!  The number was " + ranNum + ".");
            if (guess == ranNum) ;
                System.out.println("Too High.");
            if (guess == ranNum) ;
                System.out.println("Too Low.");
        }
    }
}
