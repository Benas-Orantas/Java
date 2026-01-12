
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String User = scanner.nextLine();
        System.out.println("Enter password: ");
        String Passw = scanner.nextLine();
        String Output = login(User, Passw);
        System.out.println(Output);
    }

    public static String login(String User, String Passw) {
        String result = "";
        if (User.equals("alex") && Passw.equals("sunshine") || User.equals("emma") && Passw.equals("haskell")) {
            result = "You have succesfully logged in";
        } else {
            result = "Incorrect username or password!";
        }
        return result;
    }
}
