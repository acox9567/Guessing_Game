//Alexander Cox
//Tuesday, September 25, 2018

import java.util.Scanner;

public class fullGame {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = input.nextLine();
        System.out.println("Hello " + name + ", do you want to guess my number or do ur want me to guess yours");
    }
}
