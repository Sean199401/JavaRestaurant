package restaurants;
/*
 * Author: Ivan Caldwell
 */
import java.util.ArrayList;

public class Category {
	// Fields
	private String categoryTitle;
	private ArrayList<MenuItem> categoryList;
	
	// Constructor
	public Category(String categoryTitle) {
		this.categoryTitle = categoryTitle;
		this.categoryList = new ArrayList<MenuItem>();
	}

	public String getCategoryTitle() {
		return categoryTitle;
	}

	public void setCategoryTitle(String categoryTitle) {
		this.categoryTitle = categoryTitle;
	}

	public ArrayList<MenuItem> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(ArrayList<MenuItem> categoryList) {
		this.categoryList = categoryList;
	}
}
