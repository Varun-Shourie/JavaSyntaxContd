package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count = 6;
//        while(count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        for(int i=6; i != 6; i++) {
//            System.out.println("Count value is " + count);
//        }
//        for(int i = 1; i < 5; i++) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
        // another way to write this code.
//        System.out.println("****************************");
//        for(count = 1; count != 6; count++) {
//            System.out.println("Count value is " + count);
//        }
//        //other way to write this
////        System.out.println("************************************");
////        count = 1;
////        while(true){
////            if(count == 6) {
////                break;
////            }
////            System.out.println("Count value is " + count);
////            count++;
//        }
//        count = 6;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//            if(count > 100) {
//                break;
//            }
//        } while(count != 6);

        // Modify the while code below
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found

        int number = 4;
        int finishNumber = 20;
        int evenNumberCount = 0;

        while(number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }
            evenNumberCount++;
            System.out.println("Even number " + number);
            if(evenNumberCount == 5) {
                break;
            }
        }
        System.out.println("Number count: " + evenNumberCount);
    }

    public static boolean isEvenNumber(int number) {
        if(number % 2 ==0) {
            return true;
        } else return false;
    }
}
