package Restaurants;
/*
 * Author: Sean Thomsen
 */
import java.util.Date;

public class Reservation {
	
	Customer Customer;
	int numberOfPatrons = 0;
	Date reservationTime;
	
	public Reservation(Customer Cust, int numOfPatrons, Date time) {
		Customer = Cust;
		numberOfPatrons = numOfPatrons;
		time = reservationTime;
	}
	public Customer getCustomer() {
		return Customer;
	}
	public void setCustomer(Customer customer) {
		Customer = customer;
	}
	public Date getReservationTime() {
		return reservationTime;
	}
	public void setReservationTime(Date time) {
		this.reservationTime = reservationTime;
	}
	public void setNumberOfPatrons(int numberOfPatrons) {
		this.numberOfPatrons = numberOfPatrons;
	}
	
	

}
