//Alexander Cox
//Monday, September 24, 2018

import java.util.Scanner;

public class urName {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = input.nextLine();
        System.out.println("What's your social security number?");
        int ssn = input.nextInt();
        System.out.println("Hello " + name + ".  Your social security number is " + String.valueOf(ssn) + ".");
        input.close();
    }
}
