package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int playerOnePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Luis",playerOnePosition);

        int playerTwoPosition = calculateHighScorePosition(900);
        displayHighScorePosition("Angel",playerTwoPosition);

        int playerThreePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Silver",playerThreePosition);

        int playerFourPosition = calculateHighScorePosition(50);
        displayHighScorePosition("Flin",playerFourPosition);
    }

    public static void displayHighScorePosition( String playerName, int positionHighScore){
        System.out.println(playerName + " managed to get into position " + positionHighScore + " on the High Score Table");
    }

    public static int calculateHighScorePosition(int playerScore){
        if (playerScore > 1000){
            return 1;
        }else if (playerScore>500 && playerScore < 1000){
            return 2;
        }else if (playerScore>100 && playerScore < 500){
            return 3;
        }else{
            return 4;
        }

    }
}
