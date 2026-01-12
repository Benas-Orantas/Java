
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int tracker = 0;
        int sum = 0;
        int maxLength = -1;
        String name = "";
        while (!string.isEmpty()) {
            String[] split = string.split(",");
            tracker++;
            int year = Integer.parseInt(split[1]);
            sum += year;
            int length = split[0].length();
            if (length > maxLength) {
                maxLength = length;
                name = split[0];
            }
            string = scanner.nextLine();
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + ((double)sum / tracker));
    }

}
