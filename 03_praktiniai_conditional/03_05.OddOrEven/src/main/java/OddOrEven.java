
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        // HINT:
        // You can find out if a number is even or odd easily using the modulo operator %
        // Try the following commands to see what they print
        // System.out.println( 1%2 );
        // System.out.println( 2%2 );
        // System.out.println( 3%2 );
        // System.out.println( 4%2 );
        // System.out.println( 5%2 );
        // System.out.println( 6%2 );
        // System.out.println( 7%2 );
        // int luku = 8
        // System.out.println( luku%2 );
        // So, by taking the modulo of a number and two you can find out if it is even or odd !
        System.out.println("Give a number:");
        int num = Integer.parseInt(scan.nextLine());
        if (num % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
//        Ternary:
//        String result = (num % 2 == 0) ? "The number is even." : "The number is odd.";
//        System.out.println(result);
//        -----------------------------------------------------------------------------
//        found this method online, not sure how it works tho, but I found it neat :P
//        if ((num & 1) == 0) {
//            System.out.println("The number is even.");
//        } else {
//            System.out.println("The number is odd.");
//        }
//        made it into a ternary cuz why not :3
//        String result = ((num & 1) == 0) ? "The number is even." : "The number is odd.";
//        System.out.println(result);
    }
}
