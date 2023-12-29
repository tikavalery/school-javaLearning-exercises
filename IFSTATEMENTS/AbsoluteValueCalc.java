import java.util.Scanner;

public class AbsoluteValueCalc {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        int userVal = 0;
        int absVal = 0;
         
        System.out.print("Enter an interger: ");
        userVal = scnr.nextInt();
        absVal = userVal;
        if(absVal < 0) {
            absVal = absVal * -1;
        }
      System.out.print("The absolute value of " + 
      userVal);
      System.out.print(" is " + absVal);
      return;
    }
}