
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        // you can write test code here
//        // however, remove all unnecessary code when doing the final parts of the exercise
//
//        // In order for the tests to work, the objects must be created in the
//        // correct order in the main program. First the object that tracks the total
//        // sum, secondly the object that tracks the sum of even numbers,
//        // and lastly the one that tracks the sum of odd numbers!
//        Statistics statistics = new Statistics();
//        // statistics.addNumber(3);
//        // statistics.addNumber(5);
//        // statistics.addNumber(1);
//        // statistics.addNumber(2);
//        // System.out.println("Count: " + statistics.getCount());
//        statistics.userInput();
//        // System.out.println("Average: " + statistics.average());

        Statistics sumAll = new Statistics();
        Statistics evenStats = new Statistics();
        Statistics oddStats = new Statistics();

        System.out.println("Enter numbers:");
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
//        do {
//            input = Integer.parseInt(scanner.nextLine());
//            if (input % 2 == 0) {
//                evenStats.addNumber(input);
//            } else if (input % 2 != 0) {
//                oddStats.addNumber(input);
//            }
//            sumAll.addNumber(input);
//        } while (input!= -1);
        while (input != -1) {
            if (input % 2 == 0) {
                evenStats.addNumber(input);
            } else if (input % 2 != 0) {
                oddStats.addNumber(input);
            }
            sumAll.addNumber(input);
            input = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Sum: " + sumAll.sum());
        System.out.println("Sum of even numbers: " + evenStats.sum());
        System.out.println("Sum of odd numbers: " + oddStats.sum());


    }
}
