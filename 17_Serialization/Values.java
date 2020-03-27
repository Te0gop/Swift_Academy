package homework;

import java.io.Serializable;

public class Values implements Serializable {
	

	private String streetAddress;
	private String city;
	private String state;
	private String postalCode;
	private String type;
	private String number;
	
	public Values(String streetAddress, String city, String state, String postalCode, String type, String number) {
		super();
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.type = type;
		this.number = number;
	}
	public Values() {
		
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
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}

	
	@Override
	public String toString() {
		return "Values [streetAddress=" + streetAddress + ", city=" + city + ", state=" + state + ", postalCode="
				+ postalCode + ", type=" + type + ", number=" + number + "]";
	}
	
	
	
	
}
