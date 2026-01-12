
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
        // Would use byte here instead of int if the tests allowed it -_-
        int age = Integer.parseInt(scan.nextLine());
        if (age >= 0 && age <= 120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
//        String result = (age >= 0 && age <= 120) ? "OK" : "Impossible!";
//        System.out.println(result);
    }
}
