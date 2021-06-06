package com.alinaneacsu.ecommercetshirtstore.user;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.alinaneacsu.ecommercetshirtstore.basket.Basket;
import com.alinaneacsu.ecommercetshirtstore.product.Product;

@Entity
public class Customer extends Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String password;
	private Boolean enabled;
	private String role;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Customer() {}

	public Customer(String username, String password, Boolean enabled, String role) {
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.role = role;
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
