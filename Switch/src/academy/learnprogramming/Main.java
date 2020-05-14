package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

    	// Instead of using an if statement, a switch statement is more advisable instead.
    	// Example of cumbersome nature of ifs:
    	
//        int value = 3;
//        if(value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

    	// Switch statements -- much more efficient, easier to read. 
    	
        int switchValue = 5; 
        
        //testing only the switch value
        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: 
            case 4: 
            case 5:
                System.out.println("Was a 3 or 4 or 5");
                System.out.println("Actually it was " + switchValue);
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char switchExercise = 'A';
        
        switch(switchExercise) {
            case 'A':
                System.out.println("Value was A");
                break;
                
            case 'B':
                System.out.println("Value was B");
                break;
                
            case 'C':
                System.out.println("Value was C");
                break;
                
            case 'D':
                System.out.println("Value was D");
                break;
                
            case 'E':
                System.out.println("Value was E");
                break;
                
            default:
                System.out.println("Not found");
                break;
        }

        String month = "JUNE";
        
        switch(month.toUpperCase()) {
            case "JANUARY":
                System.out.println("Jan");
                break;
                
            case "JUNE":
                System.out.println("Jun");
                break;
                
            default:
                System.out.println("Not sure");
        }
    }
}
