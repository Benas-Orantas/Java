import java.lang.reflect.Array;
import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        history = new ArrayList<>();
    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();
    }

    public double maxValue() {
        double max = 0;
        for (int i = 0; i < history.size(); i++) {
            if (history.get(i) > max) {
                max = history.get(i);
            }
        }
        return max;
    }

    public double minValue() {
        double min = 2147483647;
        for (int i = 0; i < history.size(); i++) {
            if (min > history.get(i)) {
                min = history.get(i);
            }
        }
        return min;
    }

    public double average() {
        double sum = 0;
        double avg;
        if (history.isEmpty()) {
            avg = 0;
        } else {
            for (int i = 0; i < history.size(); i++) {
                sum += history.get(i);
            }
            avg = sum / history.size();
        }
        return avg;
    }

    public String toString() {
        return history.toString();
    }
}
