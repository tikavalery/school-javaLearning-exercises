import java.util.Scanner;

public class MultIfElseInsur {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        final int PRICE_16_TO_24 = 4800;
        final int PRICE_25_TO_39 = 2350;
        final int PRICE_40_AND_UP = 2100;
        int userAge =0;
        int insurancePrice = 0;

        System.out.print("Enter your age: ");
        userAge = scnr.nextInt();

        if (userAge <= 15 ){
            System.out.println("Too young");
            insurancePrice = 0;
        } else if (userAge <= 24 ){
            insurancePrice = PRICE_16_TO_24;
        } else if (userAge <= 39 ){
            insurancePrice = PRICE_25_TO_39;
        } else {
            insurancePrice = PRICE_40_AND_UP;
        }

        System.out.println("Annual price: $" + insurancePrice);

return;
    }
}