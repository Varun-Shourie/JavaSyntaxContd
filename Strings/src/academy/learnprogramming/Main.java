package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //byte = -128 to 127
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean
        // most common are an int, double, boolean,
        // less common long, char
        // short, float, byte rarely used.
    	
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);

        myString = myString + " \u00A9 2019";
        System.out.println("myString is equal to " + myString);
        
        String numberString = "250.55";
        numberString = numberString + "49.55";
        System.out.println(numberString);

        String lastString =  "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
        
        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);



    }
}
