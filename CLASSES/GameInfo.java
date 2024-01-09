public class GameInfo { // Private fields
   private int player1PlayA;
   private int player1PlayB;
   private int player2PlayA;
   private int player2PlayB;

   // Private helper methods
   private int maxOfPair(int num1, int num2) {
      if (num1 > num2) {
         return num1;
      }
      else {
         return num2;
      }
   }

   // Public methods
   public void setPlayer1PlayA(int playScore) {
      player1PlayA = playScore;
   }

   public void setPlayer1PlayB(int playScore) {
      player1PlayB = playScore;
   }

   public void setPlayer2PlayA(int playScore) {
      player2PlayA = playScore;
   }

   public void setPlayer2PlayB(int playScore) {
      player2PlayB = playScore;
   }

   public int getPlayer1PlayA() {
      return player1PlayA;
   }

   public int getPlayer1PlayB() {
      return player1PlayB;
   }

   public int getPlayer2PlayA() {
      return player2PlayA;
   }

   public int getPlayer2PlayB() {
      return player2PlayB;
   }

   public int getPlayer1HighScore() {
      return maxOfPair(player1PlayA, player1PlayB);
   }

   public int getPlayer2HighScore() {
      return maxOfPair(player2PlayA, player2PlayB);
   }
}