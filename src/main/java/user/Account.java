package user;

import java.util.Date;
import java.util.List;

public class Account {
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private String billingAddress;
	private String deliveryAddress;
	private Date registrationDate;
	private Basket basket;
	private List<Order> orderList;
	private Wishlist wishlist;
	
	public Account() {}
	
	public Account(String firstName, String lastName, String phoneNumber, String email, String billingAddress, String deliveryAddress, 
			Date registration, Basket basket, List<Order> orderList, Wishlist wishlist) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.billingAddress = billingAddress;
		this.deliveryAddress = deliveryAddress;
		this.registrationDate = registrationDate;
		this.basket = basket;
		this.orderList = orderList;
		this.wishlist = wishlist;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getBillingAddress() {
		return billingAddress;
	}
	
	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}
	
	public String getDeliveryAddress() {
		return deliveryAddress;
	}
	
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	
	public Date getRegistration() {
		return registrationDate;
	}
	
	public void setRegistration(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	
	public Basket getBasket() {
		return basket;
	}
	
	public void setBasket(Basket basket) {
		this.basket = basket;
	}
	
	public List<Order> getOrderList() {
		return orderList;
	}
	
	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}
	
	public Wishlist getWishlist() {
		return wishlist;
	}
	
	public void setWishlist(Wishlist wishlist) {
		this.wishlist = wishlist;
	}

	@Override
	public String toString() {
		String s = "First name: " + firstName + ", Last name: " + lastName + ", Phone number: " + phoneNumber
				+ ", Email: " + email + ", Billing address: " + billingAddress + ", Delivery address: " + deliveryAddress
				+ ", Registration date: " + registrationDate + ", Basket: " + basket + ", Order list: " + orderList 
				+ ", Wishlist: " + wishlist;
		return s;
	}
	
	
}
