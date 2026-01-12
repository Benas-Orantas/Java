
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int num = Integer.parseInt(scanner.nextLine());
        while (num != 0) {
            if (num < 0) {
                System.out.println("Unsuitable number");
            } else {
                System.out.println(num * num);
            }
            System.out.println("Give a number:");
            num = Integer.parseInt(scanner.nextLine());
        }
    }
}
