package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String numberAsString = "2018.125";
        System.out.println("numberAsString = " + numberAsString);

        double number = Double.parseDouble(numberAsString);
        
        // parse method is static method we can use to parse
        // something into a different type.
        
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;
        
        System.out.println(numberAsString);
        System.out.println(number);
    }
}
