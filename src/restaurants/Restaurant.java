package restaurants;
/*
 * Author: Ivan Caldwell
 */
import java.util.ArrayList;

import org.graalvm.compiler.nodes.memory.address.AddressNode.Address;

public class Restaurant {
	// Fields
	private String restaurantNameString;
	private Address restaurantAddress;
	private Menu menu;
	private ArrayList<Reservation> reservations;
	
	// Constructor
	public Restaurant(String restaurantNameString, Address restaurantAddress, Menu menu) {
		this.restaurantNameString = restaurantNameString;
		this.restaurantAddress = restaurantAddress;
		this.menu = menu;
	}

	// Getters and Setters
	public String getRestaurantNameString() {
		return restaurantNameString;
	}


	public void setRestaurantNameString(String restaurantNameString) {
		this.restaurantNameString = restaurantNameString;
	}


	public Address getRestaurantAddress() {
		return restaurantAddress;
	}


	public void setRestaurantAddress(Address restaurantAddress) {
		this.restaurantAddress = restaurantAddress;
	}


	public Menu getMenu() {
		return menu;
	}


	public void setMenu(Menu menu) {
		this.menu = menu;
	}


	public ArrayList<Reservation> getReservations() {
		return reservations;
	}


	public void setReservations(ArrayList<Reservation> reservations) {
		this.reservations = reservations;
	}
	
	
	
	
}
