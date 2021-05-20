package com.alinaneacsu.ecommercetshirtstore.restfulWebService;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.alinaneacsu.ecommercetshirtstore.structure.BasketStructure;

import product.Product;

@Controller
public class BasketController {

	private BasketStructure basket = new BasketStructure();

	@GetMapping("/basket")
	public String getAllProducts(Model model) {
		ArrayList<Product> products = basket.getProduct();
		model.addAttribute("basket", products);
		return "basket";			
	}
}
