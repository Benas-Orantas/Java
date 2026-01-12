
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        double avg = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.parseInt(scanner.nextLine());
            if (num == 0) {
                if (avg <= 0) {
                    System.out.println("Cannot calculate the average");
                    break;
                }
                System.out.println(avg);
                break;
            } else if (num > 0) {
                count++;
                sum += num;
                avg = (double) sum / count;
            }
        }
    }
}
