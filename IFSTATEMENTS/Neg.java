import java.util.Scanner;

public class Neg {
    public static void main (String [] args){
        Scanner scnr = new Scanner(System.in);
        int userNum = 0;
        System.out.println("Enter a number: ");
        userNum = scnr.nextInt();
        if(userNum == 0){
            System.out.println("Zero");
        }
        else {
            System.out.println("Non-zero");

        }
        return;
    }
}