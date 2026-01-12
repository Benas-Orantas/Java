
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number?");
        int n1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Last number?");
        int n2 = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = n1; i <= n2; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}
