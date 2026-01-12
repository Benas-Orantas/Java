
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        while (!string.isEmpty()) {
            getAV(string);
            string = scanner.nextLine();
        }
    }

    public static void getAV(String string) {
        String[] split = string.split(" ");
        for (int i = 0; i < split.length; i++) {
            if (split[i].toLowerCase().contains("av")) {
                System.out.println(split[i]);
            }
        }
    }
}
