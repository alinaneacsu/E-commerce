package com.alinaneacsu.ecommercetshirtstore.sticker;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.alinaneacsu.ecommercetshirtstore.product.Product;
import com.alinaneacsu.ecommercetshirtstore.product.Product.Size;

@Entity
@Table(name="Stickers")
public class Sticker extends Product {
	
	public enum Type {
		WEBSITE_LOGO,
		TSHIRT_DESIGN
	}
	
	private Type type;
	
	public Sticker() {
		super();
	}
	
	public Sticker(String name, double price, int quantity, Size size, Type type) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.size = size;
		this.type = type;
	}
	
	public Type getType() {
		return type;
	}
	
	public void setType(Type type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Type: " + type;
	}
	
	
}
