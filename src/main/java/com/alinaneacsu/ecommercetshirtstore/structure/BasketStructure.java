package com.alinaneacsu.ecommercetshirtstore.structure;

import java.util.ArrayList;

import mask.FaceMask;
import product.Product;
import product.Product.Size;
import sticker.Sticker;
import sticker.Sticker.Type;
import tshirt.Tshirt;
import tshirt.Tshirt.Gender;

public class BasketStructure {

	private ArrayList<Product> products = new ArrayList<>();
	
	public BasketStructure() {
		populate();
	}
	
	public ArrayList<Product> getProduct(){
		return products;
	}
	
	public void setProduct(ArrayList<Product> product) {
		products.addAll(product);	
	}
	
	private void populate() {
		
		Product p1 = new Tshirt("Happy Happy Joy Joy", 89.45, 8, Size.XL, "Pink", Gender.FEMALE);
		Product p2 = new Tshirt("Gradient", 100, 4, Size.S, "Orange", Gender.MALE);
		Product p3 = new Sticker("Gradient", 33, 10, Size.S, Type.TSHIRT_DESIGN);
		Product p4 = new Sticker("Cannibal Corpse", 55, 5, Size.L, Type.TSHIRT_DESIGN);
		Product p5 = new FaceMask("Roots Reggae", 60, 3, Size.L);

		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
	}
}
