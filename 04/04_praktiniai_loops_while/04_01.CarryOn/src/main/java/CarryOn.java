
import java.util.Objects;
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Intellij autocompleted this for me when I was trying to write the code without an if statement.
//        Not sure how it even works tho...
//        System.out.println("Shall we carry on?");
//        String string = scanner.nextLine();
//        while (!Objects.equals(string, "no")) {
//            System.out.println("Shall we carry on?");
//            string = scanner.nextLine();
//        }
        while (true) {
            System.out.println("Shall we carry on?");
            String string = scanner.nextLine();
            if (string.equals("no")) {break;}
        }
    }
}
