
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxAge = 0;
        String string = scanner.nextLine();
        while (!string.isEmpty()) {
            String[] split = string.split(",");
            int age = Integer.parseInt(split[1]);
            if (age > maxAge) {maxAge = age;}
            string = scanner.nextLine();
        }
        System.out.println("Age of the oldest: " + maxAge);
    }
}
