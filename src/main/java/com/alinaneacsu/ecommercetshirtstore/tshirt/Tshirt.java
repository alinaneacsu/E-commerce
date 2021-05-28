package com.alinaneacsu.ecommercetshirtstore.tshirt;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.alinaneacsu.ecommercetshirtstore.product.Product;


@Entity
@Table(name="Tshirts")
public class Tshirt extends Product {
	
	public enum Gender {
		FEMALE,
		MALE
	}
	
	private String color;
	private Gender gender;
	
	public Tshirt() {
		super();
	}
	
	public Tshirt(String name, double price, int quantity, Size size, String color, Gender gender) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.size = size;
		this.color = color;
		this.gender = gender;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Color: " + color + ", Gender: " + gender;
	}
}
