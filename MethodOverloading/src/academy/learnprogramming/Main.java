package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int newScore = calculateScore("Tim", 500);
//        System.out.println("New score is " + newScore);
//        calculateScore(75);
//        calculateScore();
        double result = calcFeetAndInchestoCentimeters(-10, 5);
        System.out.println(result);
        result = calcFeetAndInchestoCentimeters(150);
        System.out.println(result);
    }
    // Challenge

    public static double calcFeetAndInchestoCentimeters(double feet, double inches) {
        if((feet >= 0) && (inches >= 0) && (inches <= 12)) {
            return (((feet*12) + inches)*2.54);
            // also can be written as:
            // centimeters = feet*12 + inches
            // centimers *= 2.54
        }
            return -1;
    }

    public static double calcFeetAndInchestoCentimeters(double inches) {
        if (inches >= 0) {
            double remainder = inches % 12;
            double feet = (int) inches / 12;
            return calcFeetAndInchestoCentimeters(feet, remainder);
        } return -1;
    }



    // Lecture notes
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return (score * 1000);
    }
    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return (score * 1000);
    }
    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }
    // changing the data type of the method does not change the method.
    // you need to change parameters to overload the method
}
