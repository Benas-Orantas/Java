
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        while (!string.isEmpty()) {
            lastWords(string);
            string = scanner.nextLine();
        }
    }

    public static void lastWords(String string) {
        String[] split = string.split(" ");
        System.out.println(split[split.length - 1]);
    }
}
