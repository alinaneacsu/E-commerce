package product;

import java.util.ArrayList;

import tshirt.Tshirt;

public class Product {
	private ArrayList<Tshirt> tshirts;

	public enum Size {
		S,
		M,
		L,
		XL,
	}
	protected String name;
	protected double price;
	protected int quantity;
	protected Size size;
	
	public Product() {}
	
	public Product(String name, double price, int quantity, Size size) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public Size getSize() {
		return size;
	}
	
	public void getSize(Size size) {
		this.size = size;
	}

	@Override
	public String toString() {
		String s = "Name: " + name + ", Price: " + price + ", Quantity: " + quantity + ", Size: " + size ;
		return s;
	}
}
