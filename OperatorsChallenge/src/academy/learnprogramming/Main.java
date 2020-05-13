package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        double firstDouble = 20.00d;
        double secondDouble = 80.00d;
        double thirdDouble = (firstDouble + secondDouble) * 100.00d;
        double fourthDouble = thirdDouble % 40.00d;
        boolean stepFive = (fourthDouble == 0) ? true : false;
        System.out.println(stepFive);
        if (!stepFive) {
            System.out.println("Got some remainder");
        }
    }
}
