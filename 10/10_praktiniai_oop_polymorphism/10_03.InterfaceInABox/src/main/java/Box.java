import java.util.ArrayList;
import java.util.Objects;

public class Box implements Packable{

    private double capacity;
    private ArrayList<Packable> box = new ArrayList<>();

    public Box(double capacity) {
        this.capacity = capacity;
    }

    public void add(Packable packable) {
        if(packable.weight() <= capacity) {
            capacity -= packable.weight();
            packable.weight();
            box.add(packable);
        }
    }

    @Override
    public double weight() {
        double weight = 0;
        for (Packable item : box){
            weight += item.weight();
        }
        return weight;
    }

    public String toString() {
        return "Box: " + box.size() + " items, total weight " + weight() + " kg";
    }
}
