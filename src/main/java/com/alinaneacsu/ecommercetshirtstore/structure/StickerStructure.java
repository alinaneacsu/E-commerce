package com.alinaneacsu.ecommercetshirtstore.structure;

import java.util.ArrayList;

import product.Product;
import product.Product.Size;
import sticker.Sticker;
import sticker.Sticker.Type;

public class StickerStructure {
	
	private ArrayList<Product> products = new ArrayList<>();
	
	public StickerStructure() {
		populate();
	}

	public ArrayList<Product> getProduct() {
		return products;
	}
	
	public void setProduct(ArrayList<Product> product) {
		products.addAll(product);
	}
	
	public void populate() {
		
		Product s1 = new Sticker("Cannibal Corpse", 29.9, 30, Size.L, Type.TSHIRT_DESIGN);
		Product s2 = new Sticker("Happy Prints", 15, 5, Size.M, Type.TSHIRT_DESIGN);
		Product s3 = new Sticker("Ink-T", 33, 3, Size.XL, Type.TSHIRT_DESIGN);
		
		products.add(s1);
		products.add(s2);
		products.add(s3);
	}
}
