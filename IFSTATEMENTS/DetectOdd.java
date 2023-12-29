import java.util.Scanner;

public class DetectOdd {
    public static void main (String [] args) {
        int userNum = 0;
        userNum = 6;

        if((userNum % 2) == 0) {
         System.out.println("Even");

        }
        else {
            System.out.println("Odd");
        }
        return;
    }
}