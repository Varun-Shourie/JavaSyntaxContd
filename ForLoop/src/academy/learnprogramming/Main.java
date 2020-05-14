package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000, 5.0));

        for(int i = 0; i < 6; i++) { // initial structure - for(init; termination; increment) {
            System.out.println("Loop " + i + " hello!");
        }

        for(double interestRate = 2.0; interestRate < 9.0; interestRate++) {
            int principal = 10_000;
            System.out.println(principal + " at " + interestRate + "% interest = "
                    + String.format("%.2f",calculateInterest(10_000, interestRate)));
        }

        for(double interestRate = 8.0; interestRate >= 2.0; interestRate--) {
            int principal = 10_000;
            System.out.println(principal + " at " + interestRate + "% interest = "
                    + String.format("%.2f",calculateInterest(10_000, interestRate)));
        }

        int countOfPrimeNumbers = 0;
        for(int primeNumberTest = 2; primeNumberTest < 50; primeNumberTest++) {
            if(isPrime(primeNumberTest)) {
                System.out.println("Prime number found: " + primeNumberTest);
                countOfPrimeNumbers++;
                System.out.println("Count of prime numbers: " + countOfPrimeNumbers);
                }

            if (countOfPrimeNumbers == 10) {
                break;
            }

            }
        }

    // Create a for statement using any range of numbers
    // Determine if the number is a prime number using the isPrime method
    // if it is a prime number, print it out AND increment a count of
    // the number of prime numbers found
    // if that count is 3 exit the for loop
    // hint: use the break; statement to exit.
    public static boolean isPrime(int n) {
        if(n==1) {
            return false;
        }

        for(int i = 2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount * (interestRate/100));
    }
}
