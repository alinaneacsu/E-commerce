package com.alinaneacsu.ecommercetshirtstore.basket;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.alinaneacsu.ecommercetshirtstore.product.Product;

@Controller
public class BasketController {

	private BasketService basketService;
	
	private BasketService basket = new BasketService();

	@GetMapping("/basket")
	public String getAllProducts(Model model) {
		ArrayList<Product> products = basket.getProduct();
		model.addAttribute("basket", products);
		return "basket";			
	}
}
