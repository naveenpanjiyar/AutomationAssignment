package classAssignment;

import java.util.ArrayList;
import java.util.List;

public class Assignment9_GroceryList {
    List<String> groceryItems;

    public Assignment9_GroceryList() {
        groceryItems = new ArrayList<>();
    }

    // Store the items into the list
    public void addItem(String items) {
        groceryItems.add(items);
        System.out.println("Item added to the grocery list: " + items);
    }

    public void removeItem(String items) {
        if (groceryItems.remove(items)) {
            System.out.println("Item removed from the grocery list: " + items);
        } else {
            System.out.println("Item not found in the grocery list");
        }
    }

    public void viewList() {
        if (groceryItems.isEmpty()) {
            System.out.println("Grocery list is empty");
        } else {
            System.out.println("Grocery items list: " + groceryItems);
        }
    }
}
