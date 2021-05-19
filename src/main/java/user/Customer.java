package user;

import java.util.Date;
import java.util.List;

public class Customer extends Account {

	public Customer() {
		super();
	}

	public Customer(String firstName, String lastName, String CNP, String phoneNumber, String email, String billingAddress,
			String deliveryAddress, Date registration, Basket basket, List<Order> orderList, Wishlist wishlist) {
		super(firstName, lastName, CNP, phoneNumber, email, billingAddress, deliveryAddress, registration, basket, orderList,
				wishlist);
	}
	
	public Customer(String firstName, String lastName, String CNP, String phoneNumber, String email, String billingAddress,
			String deliveryAddress, Date registration) {
		super(firstName, lastName, CNP, phoneNumber, email, billingAddress, deliveryAddress, registration);
	}
}
