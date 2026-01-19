
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
            int smallest = 9999;
            if (input == 9999) {
                for (Integer integer : list) {
                    if (integer < smallest) {
                        smallest = integer;
                    }
                }
                System.out.println("Smallest number: " + smallest);
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(j) == smallest) {
                        System.out.println("Found at index: " + j);
                    }
                }
                break;
            }
            list.add(input);
        }
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        
    }
}
