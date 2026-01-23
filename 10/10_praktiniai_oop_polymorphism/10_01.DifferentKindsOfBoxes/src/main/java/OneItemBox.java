import java.util.ArrayList;

public class OneItemBox extends Box{

    private ArrayList<Item> box = new ArrayList<>();

    public OneItemBox() {

    }

    @Override
    public void add(Item item) {
        if (box.isEmpty()) {
            box.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return !box.isEmpty() && item.equals(box.get(0));
    }
}
