package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int INT = 5;
        // false, true, null

        // a mile is equal to 1.609344 kilometers
        double kilometers = (100 * 1.609344);
        // every thing else but the data type forms the expression
        // made up of variables, values, and operators
        // adding data type creates a valid Java statement
        int highScore = 50;
        if (highScore == 58) {
            System.out.println("This is an expression"); // components within brackets = expression
        }


        // Exercise - which parts are expressions?
        int score = 100; // score = 100, int/semicolon not part
        if (score > 99) { // score > 99 - if, braces, brackets not part of it
            System.out.println("You got the high score"); // parts within brackets
            score = 0; // the entire part is an expression
        }

    }
}
