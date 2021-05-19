package com.alinaneacsu.ecommercetshirtstore.structure;

import java.util.ArrayList;

import mask.FaceMask;
import product.Product;
import product.Product.Size;

public class FaceMaskStructure {
	private ArrayList<Product> products = new ArrayList<>();

	public FaceMaskStructure() {
		populate();
	}
	
	public ArrayList<Product> getProduct() {
		return products;
	}

	public void setProduct(ArrayList<Product> product) {
		products.addAll(product);
	}

	private void populate() {

		Product f1 = new FaceMask("Street Hero", 39.9, 10, Size.S);
		Product f2 = new FaceMask("Urban Art", 54.9, 20, Size.M);
		Product f3 = new FaceMask("Roots Reggae", 60, 3, Size.L);
		
		products.add(f1);
		products.add(f2);
		products.add(f3);

	}
}
