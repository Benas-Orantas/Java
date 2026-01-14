public class Gauge {
    private int value;

    public Gauge() {

    }

    public void increase() {
        if (value < 5) {
            value++;
        }
    }

    public void decrease() {
        if (value > 0) {
            value--;
        }
    }

    public int value() {
        return value;
    }

    public boolean full() {
        boolean result = true;
        if (value != 5) {
            result = false;
        }
        return result;
    }
}
