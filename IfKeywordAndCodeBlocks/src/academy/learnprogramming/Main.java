package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean gameOver= true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score > 1000) {
//            System.out.println("Your score was less than 5000 and greater than 1000");
//            // if you don't use code block, you can only put one line of code
//        } else if (score < 1000) {
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got here");
//        }

        if (gameOver) { // same as gameOver == true
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
        // int savedFinalScore = finalScore;
        // you can't access variables created inside codeblock outside of it.

        /*
        Challenge:
        Print out a second score on the screen with the following --
        (1) score set to 10000
        (2) levelCompleted set to 8
        (3) bonus set to 200
        (4) But make sure first printout above still displays as well
         */

        score = 10_000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

    }
}
