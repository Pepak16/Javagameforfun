import java.util.ArrayList;
import java.util.HashMap;

public class Inventory {

    private HashMap<Item,Integer> items;
    private final int slotMaximum = 20;

    public Inventory () {
        items = new HashMap();
    }

    boolean addItem(Item item, int quantity) {
        if (items.size() < slotMaximum) {
            for (Item i : items.keySet()) {
                if (i.equals(item)) {
                    return false;
                } else {
                    items.put(item,quantity);
                    System.out.println("Item added.");
                    return true;
                }
            }
        } else {
            System.out.println("Inventory is full!");
        }
        return false;
    }

    boolean removeItem(Item item) {
        for (Item i : items.keySet()) {
            if (i.equals(item)) {
                items.remove(item);

                return true;
            } else {
                return false;
            }
        }
        return false;
    }

}