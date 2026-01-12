
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.print("Give a number: ");
        String number = scanner.nextLine();
        System.out.print("You gave the number " + number);
    }
}
