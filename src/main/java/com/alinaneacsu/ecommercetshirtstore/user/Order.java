package com.alinaneacsu.ecommercetshirtstore.user;

import java.util.List;

import com.alinaneacsu.ecommercetshirtstore.product.Product;

public class Order {
	private enum Status {
		PROCESSING,
		ON_HOLD,
		FAILED,
		CANCELED,
		COMPLETED,
		PENDING_PAYMENT,
		REFUNDED
	}
	private int orderNumber;
	private Customer customer;
	private List<Product> purchase;
	private Status status;
	//invoice

	public Order() {}
	
	public Order(int orderNumber, Customer customer, List<Product> purchase, Status status) {
		this.orderNumber = orderNumber;
		this.customer = customer;
		this.purchase = purchase;
		this.status = status;
	}
	
	public int getOrderNumber() {
		return orderNumber;
	}
	
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public List<Product> getPurchase(){
		return purchase;
	}
	
	public void setPurchase(List<Product> purchase) {
		this.purchase = purchase;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		String s = "Order number: " + orderNumber + ", Customer: " + customer + ", Purchased products: " + purchase + ", Status: " + status;
		return s;
	}
	
}
