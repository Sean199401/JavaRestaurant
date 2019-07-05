package restaurants;
/*
 * Author: Ivan Caldwell
 */
import java.util.ArrayList;

public class Menu {
	// Fields
	private String menuTitle;
	private ArrayList<Category> categories;
	
	// Constructor
	public Menu(String menuTitle){
		this.menuTitle = menuTitle;
		this.categories = new ArrayList<Category>();
	}

	// Getters and Setters
	public String getMenuTitle() {
		return menuTitle;
	}

	public void setMenuTitle(String menuTitle) {
		this.menuTitle = menuTitle;
	}

	public ArrayList<Category> getCategories() {
		return categories;
	}

	public void setCategories(ArrayList<Category> categories) {
		this.categories = categories;
	}
}
