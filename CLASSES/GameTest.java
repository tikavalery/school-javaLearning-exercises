public class GameTest {
   public static void main(String[] args) {
      GameInfo funGame = new GameInfo();
      System.out.print(funGame);
      funGame.setPlayer1PlayA(88);
      funGame.setPlayer1PlayB(97);
      funGame.setPlayer2PlayA(74);
      funGame.setPlayer2PlayB(40);

      System.out.println("Player1 playA: "
                         + funGame.getPlayer1PlayA());

      System.out.println("Player1 max: "
                         + funGame.getPlayer1HighScore());
      System.out.println("Player2 max: "
                         + funGame.getPlayer2HighScore());
      return;
   }
}