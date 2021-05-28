package com.alinaneacsu.ecommercetshirtstore.faceMask;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.alinaneacsu.ecommercetshirtstore.product.Product;

@Entity
@Table(name="Masks")
public class FaceMask extends Product {

	public FaceMask() {
		super();
	}
	
	public FaceMask(String name, double price, int quantity, Size size) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.size = size;
	}
}
