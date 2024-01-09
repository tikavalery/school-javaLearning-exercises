import java.util.Scanner;
import java.lang.Math;

public class LeastCommonMultiplePractice {
    public static int getPositiveNumber(){
        Scanner scnr = new Scanner(System.in);
            int userNum = 0;

            while (userNum <= 0){
                System.out.println("Enter a positive number (>0)");
                userNum = scnr.nextInt();

                if(userNum <= 0){
                    System.out.println("Invalid Number");
                }
            }
          return userNum;  
        }
        
}
    
    