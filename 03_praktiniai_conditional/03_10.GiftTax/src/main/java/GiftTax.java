
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int giftVal = Integer.parseInt(scan.nextLine());
        int taxl;
        double taxr;
        if (giftVal >= 5000 && giftVal <= 25000) {
            taxl = 100;
            taxr = 0.08;
            System.out.println("Tax: " + ((double) taxl + (giftVal - 5000) * taxr));
        } else if (giftVal >= 25000 && giftVal <= 55000) {
            taxl = 1700;
            taxr = 0.10;
            System.out.println("Tax: " + ((double) taxl + (giftVal - 25000) * taxr));
        } else if (giftVal >= 55000 && giftVal <= 200000) {
            taxl = 4700;
            taxr = 0.12;
            System.out.println("Tax: " + ((double) taxl + (giftVal - 55000) * taxr));
        } else if (giftVal >= 200000 && giftVal <= 1000000) {
            taxl = 22100;
            taxr = 0.12;
            System.out.println("Tax: " + ((double) taxl + (giftVal - 200000) * taxr));
        } else if (giftVal >= 1000000) {
            taxl = 142100;
            taxr = 0.17;
            System.out.println("Tax: " + ((double) taxl + (giftVal - 1000000) * taxr));
        } else {
            System.out.println("No Tax!");
        }
    }
}
