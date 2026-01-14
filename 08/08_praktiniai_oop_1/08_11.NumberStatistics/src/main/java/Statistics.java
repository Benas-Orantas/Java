import java.util.Scanner;

public class Statistics {
    private int count;
    private int sum;


    public Statistics() {

    }

//    public void userInput() {
//
//    }

    public void addNumber(int number) {
        sum += number;
        count++;
    }

    public int getCount() {
        return count;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        double avg = 0;
        if (count > 0) {
            avg = (double) sum / count;
        }
        return avg;
    }
}
