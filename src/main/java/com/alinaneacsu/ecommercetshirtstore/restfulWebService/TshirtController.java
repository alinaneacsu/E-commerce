package com.alinaneacsu.ecommercetshirtstore.restfulWebService;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alinaneacsu.ecommercetshirtstore.structure.TshirtStructure;

import product.Product;
import tshirt.Tshirt;
import user.Customer;

@Controller
public class TshirtController {
	
	private TshirtStructure tshirt = new TshirtStructure();
	
	@GetMapping("/tshirts")
	public String getAllProducts(Model model) {
		ArrayList<Product> tshirts = tshirt.getProduct();
		model.addAttribute("tshirts", tshirts);
		return "tshirts";
	}
}
