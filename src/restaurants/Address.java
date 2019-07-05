package restaurants;
/* 
 * Author: Sean Thomsen
 */
public class Address {
	String streetAddress;
	String city;
	String state;
	String zipCode;
	
	public Address(String street, String cty, String st, String zip) {
		streetAddress = street;
		city = cty;
		state = st;
		zipCode = zip;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
}