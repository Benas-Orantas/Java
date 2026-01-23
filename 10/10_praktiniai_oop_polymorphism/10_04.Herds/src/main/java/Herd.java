import java.util.ArrayList;

public class Herd implements Movable{

    private ArrayList<Movable> herd = new ArrayList<>();

    public Herd() {

    }

    public void addToHerd(Movable movable) {
        herd.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable movable : herd) {
            movable.move(dx, dy);
        }
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < herd.size(); i++) {
            if (i == herd.size() - 1) {
                result += herd.get(i);
                break;
            }
            result += herd.get(i) + "\n";
        }
        return result;
    }
}
