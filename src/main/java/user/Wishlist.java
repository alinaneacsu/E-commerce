package user;

import java.util.List;

import product.Product;

public class Wishlist {
	private List<Product> products;
	private double totalCost;
	
	public Wishlist() {}
	
	public Wishlist(List<Product> products, double totalCost) {
		this.products = products;
		this.totalCost = totalCost;
	}
	
	public List<Product> getProduct() {
		return products;
	}
	
	public void setProduct(List<Product> product) {
		this.products = products;
	}
	
	public double getTotalCost() {
		return totalCost;
	}
	
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	
	@Override
	public String toString() {
		String s = "Product: " + products + ", Total cost: " + totalCost;
		return s;
	}
	
}
