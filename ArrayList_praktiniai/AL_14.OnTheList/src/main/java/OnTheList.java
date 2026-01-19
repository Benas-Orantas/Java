
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        System.out.println("Search for? ");
        String search = scanner.nextLine();
        boolean found = false;
        for (String s : list) {
            if (s.equals(search)) {
                found = true;
                System.out.println(s + " was found!");
                break;
            }
        }
        if (!found) {
            System.out.println(search + " was not found!");
        }
    }
}
