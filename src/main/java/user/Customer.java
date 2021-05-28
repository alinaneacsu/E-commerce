package user;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.alinaneacsu.ecommercetshirtstore.basket.Basket;
import com.alinaneacsu.ecommercetshirtstore.product.Product;

public class Customer extends Account {

	public Customer() {
		super();
	}

	public Customer(String firstName, String lastName, String CNP, String phoneNumber, String email,
			String billingAddress, String deliveryAddress, Date registration, Basket basket, List<Order> orderList,
			Wishlist wishlist) {
		super(firstName, lastName, CNP, phoneNumber, email, billingAddress, deliveryAddress, registration, basket,
				orderList, wishlist);
	}

	public Customer(String firstName, String lastName, String CNP, String phoneNumber, String email,
			String billingAddress, String deliveryAddress, Date registration) {
		super(firstName, lastName, CNP, phoneNumber, email, billingAddress, deliveryAddress, registration);
	}

	/*
	private String addToBasket(HttpServletRequest request, HttpServletResponse response) {
		TshirtStructure ts = new TshirtStructure();
		HttpSession session = request.getSession();
		Basket basket = (Basket) session.getAttribute("basket");

		if (basket == null) {
			basket = new Basket();
		}

		String name = request.getParameter("s");

		try {
			if (!name.isEmpty()) {
				Product product = ts.getProductByName(name);
				basket.addProduct(product);
			}
		} catch (Exception e) {
			return "/404.html";
		}
		session.setAttribute("basket", basket);
		return "/basket.html";
	}
	*/

}
