package Restaurants;
/*
 * Author: Sean Thomsen
 */
import java.util.UUID;

public class Customer {
	String customerEmail;
	UUID customerID;
	String customerPassword;
	
	public Customer(String email, UUID ID, String Password) {
		customerEmail = email;
		customerID = ID;
		customerPassword = Password;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public UUID getCustomerID() {
		return customerID;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
}
