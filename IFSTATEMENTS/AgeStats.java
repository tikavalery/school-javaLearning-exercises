

import java.util.Scanner;

public class AgeStats {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int userAge = 0;
        System.out.print("Enter age: ");
        userAge = scnr.nextInt();
        if (userAge < 16){
            System.out.println("Enjoy your early years.");
        }
        if(userAge >= 16){
            System.out.println("Enjoy you old enough to drive");

        }
        if(userAge >= 18){
            System.out.println("Enjoy your old enough to vote");

        }
        if(userAge >= 25){
            System.out.println("Most car rental companies can rent to you");

        }
        if(userAge >= 35){
            System.out.println("You can run for president");

        }
        return;
    }
}