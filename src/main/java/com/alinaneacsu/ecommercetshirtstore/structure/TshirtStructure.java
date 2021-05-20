package com.alinaneacsu.ecommercetshirtstore.structure;

import java.util.ArrayList;

import product.Product;
import product.Product.Size;
import tshirt.Tshirt;
import tshirt.Tshirt.Gender;

public class TshirtStructure {

	private ArrayList<Product> products = new ArrayList<>();

	public TshirtStructure() {
		populate();
	}

	public ArrayList<Product> getProduct() {
		return products;
	}

	public void setProduct(ArrayList<Product> product) {
		products.addAll(product);
	}

	private void populate() {

		Product t1 = new Tshirt("Happy Prints", 50, 5, Size.L, "White", Gender.FEMALE);
		Product t2 = new Tshirt("Wildland", 50, 5, Size.M, "Black", Gender.MALE);
		Product t3 = new Tshirt("Big Brain", 65.9, 7, Size.XL, "Blue", Gender.MALE);

		products.add(t1);
		products.add(t2);
		products.add(t3);
	}
}
