package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int highScore = calculateScore(true,800, 5, 100);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

        int scorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition(scorePosition, "Varun");
        scorePosition = calculateHighScorePosition(900);
        displayHighScorePosition(scorePosition, "Varun");
        scorePosition = calculateHighScorePosition(400);
        displayHighScorePosition(scorePosition, "Varun" );
        scorePosition = calculateHighScorePosition(50);
        displayHighScorePosition(scorePosition, "Varun");

        scorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition(scorePosition,"Xander");
        scorePosition = calculateHighScorePosition(500);
        displayHighScorePosition(scorePosition,"Louise");
        scorePosition = calculateHighScorePosition(400);
        displayHighScorePosition(scorePosition,"Nicholas");

    }

    // Create a method called displayHighScorePosition
    // It should receive a player's name as a parameter, and a 2nd parameter as a position in the high score table
    // You should display the player's name along with a message like " managed to get into position " and the
    // position they got and a further message " on the high score table ".
    //
    // Create a 2nd method called calculateHighScorePosition
    // it should be sent one argument only, the player score
    // it should return an int
    // the return data should be
    // 1 if the score is >1000
    // 2 if the score is >500 and < 1000
    // 3 if the score is >100 and <500
    // 4 in all other cases
    // call both methods and display the results of the following
    // a score of 1500, 900, 400, and 50

    public static void displayHighScorePosition(int scorePosition, String playerName) {
        System.out.println(playerName + " managed to get into position " +
                scorePosition + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
        /*if(score >= 1000) {
            return 1;
        } else if(score >= 500) {
            return 2;
        } else if(score >= 100) {
            return 3;
        } else {
            return 4;
        }*/

        int position = 4; // assuming position will be returned

        if (score >= 1000) {
            position = 1;
        } else if(score >= 500) {
            position = 2;
        } else if(score >= 100) {
            position = 3;
        } else {
            position = 4;
        }

        return position;
    }


    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } else {
            return -1;
        }
    }
}
