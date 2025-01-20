package classAssignment;

public class Assignment9_GroceryTest {

	public static void main(String[] args) {
		Assignment9_GroceryList groceryList = new Assignment9_GroceryList();

		String[] Groceries = { "Apples", "Bananas", "Carrots", "Tomatoes", "Milk", "Bread", "Eggs", "Cheese", "Butter",
				"Potatoes" };

		System.out.println("Adding groceries items...");
		for (String list : Groceries) {
			groceryList.addItem(list);
		}
		System.out.println("Removing items from list");
		groceryList.removeItem("Bananas");

		System.out.println("View updated list...");
		groceryList.viewList();
	}

}
