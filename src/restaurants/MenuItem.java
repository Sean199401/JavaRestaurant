package restaurants;

public class MenuItem {
	// Fields
	private String itemName;
	private String description;
	private double itemPrice;
	private int inventory;
	
	// Constructor
	public MenuItem(String itemName, String description, double itemPrice, int inventory) {
		super();
		this.itemName = itemName;
		this.description = description;
		this.itemPrice = itemPrice;
		this.inventory = inventory;
	}

	// Getters and Setters
	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getItemPrice() {
		return itemPrice;
	}


	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}


	public int getInventory() {
		return inventory;
	}


	public void setInventory(int inventory) {
		this.inventory = inventory;
	}
}
