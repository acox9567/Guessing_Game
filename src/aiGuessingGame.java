//Alexander Cox
//Tuesday, September 25, 2018

import java.util.Scanner;

public class aiGuessingGame {

    public static void main(String[] args){

        System.out.println("Think of a number between 1 and 100 and I'll be able to guess it in under 8 guesses.");
        System.out.println("After each of my guesses you have to tell me if it's 'too high' or 'too low'.");
        System.out.println("Enter 'correct' when I guess right");

        Scanner input = new Scanner(System.in);

        int guess = 50;
        int mod = 25;
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
                System.out.print("I'm sorry I don't understand. ");
            }

            System.out.println("Is your number " + guess + "?");

            uInput = input.nextLine();
        }

        gNum++;

        input.close();
        System.out.println("I told you! It oly took me " + gNum + " guesses.");
    }
}
