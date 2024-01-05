import java.util.Scanner;

public class MealSolverMultipleDiners {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int EMPANADA_COST = 3;
      final int TACO_COST     = 4;

      int userMoney    = 0;
      int numTacos     = 0;
      int numEmpanadas = 0;
      int mealCost     = 0;
      int maxEmpanadas = 0;
      int maxTacos     = 0;
      int numOptions   = 0;
      int numDiners    = 0;

      System.out.print("Enter money for meal: ");
      userMoney = scnr.nextInt();

      System.out.print("How many people are eating: ");
      numDiners = scnr.nextInt();

      maxEmpanadas = userMoney / EMPANADA_COST;
      maxTacos     = userMoney / TACO_COST;

      for (numTacos = 0; numTacos <= maxTacos; ++numTacos) {
         for (numEmpanadas = 0; numEmpanadas <= maxEmpanadas; ++numEmpanadas) {

            // Total items  must be equally divisible by number of diners
            if (((numTacos + numEmpanadas) % numDiners) != 0) {
               continue;
            }

            mealCost = (numEmpanadas * EMPANADA_COST) + (numTacos * TACO_COST);

            if (mealCost == userMoney) {
               System.out.println("$" + mealCost + " buys " + numEmpanadas
                       + " empanadas and " + numTacos
                       + " tacos without change.");
               numOptions += 1;
            }
         }
      }

      if (numOptions == 0) {
         System.out.println("You cannot buy a meal without having "
                 + "change left over.");
      }

      return;
   }
}