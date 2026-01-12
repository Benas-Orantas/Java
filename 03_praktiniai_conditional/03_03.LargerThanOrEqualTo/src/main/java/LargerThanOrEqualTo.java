
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number:");
        int num1 = Integer.parseInt(scan.nextLine());
        System.out.println("Give the second number:");
        int num2 = Integer.parseInt(scan.nextLine());
        if (num1 == num2) {
            System.out.println("The numbers are equal!");
        } else if (num1 > num2) {
            System.out.println("The greater number is: " + num1);
        } else {
            System.out.println("The greater number is: " + num2);
        }
//        String result = num1 == num2 ? "The numbers are equal!" : num1 > num2 ? ("The greater number is: " + num1) : ("The greater number is: " + num2);
//        System.out.println(result);
    }
}
