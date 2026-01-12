
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int maxAge = -1;
        String name = "";
        while (!string.isEmpty()) {
            String[] split = string.split(",");
            int age = Integer.parseInt(split[1]);
            if (age > maxAge) {
                name = split[0];
                maxAge = age;
            }
            string = scanner.nextLine();
        }
        System.out.println("Name of the oldest: " + name);
    }
}
