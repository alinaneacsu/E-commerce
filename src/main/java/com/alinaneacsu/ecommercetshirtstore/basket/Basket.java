package com.alinaneacsu.ecommercetshirtstore.basket;

import java.util.ArrayList;

import com.alinaneacsu.ecommercetshirtstore.product.Product;

public class Basket {
	private ArrayList<Product> products = new ArrayList<Product>();
	private double totalCost;
	
	public Basket() {}
	
	public Basket(ArrayList<Product> products, double totalCost) {
		this.products = products;
		this.totalCost = totalCost;
	}
	
	public ArrayList<Product> getProducts() {
		return products;
	}
	
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
	
	public double getTotalCost() {
		return totalCost;
	}
	
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	
	public void addProduct(Product product) {
		products.add(product);
	}
	
	@Override
	public String toString() {
		String s = "Products: " + products + ", Total cost: " + totalCost;
		return s;
	}
	
}
