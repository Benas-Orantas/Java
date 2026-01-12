
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        while (!string.isEmpty()) {
            firstWords(string);
            string = scanner.nextLine();
        }
    }

    public static void firstWords (String string) {
        String[] split = string.split(" ");
        System.out.println(split[0]);
    }
}
