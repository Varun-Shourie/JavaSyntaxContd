package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    float myMinFloatValue = Float.MIN_VALUE;
	    float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00; //you can remove the d since Java automatically assumes the quantity is
        // a double. However, it's a good habit to specify "d" after a double.
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);
        /*doubles are the recommended decimal type to use today
        (1) Java and computers physically process doubles faster.
        (2) Java libraries - math functions are made to process doubles.
         */

        // Challenge
        double myNumberOfPounds = 144.7d;
        double myNumberOfKilograms = myNumberOfPounds * 0.4535927d;
        System.out.println("I weigh: " + myNumberOfKilograms + " kilograms");


    }
}
