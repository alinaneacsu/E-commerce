package com.alinaneacsu.ecommercetshirtstore.restfulWebService;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alinaneacsu.ecommercetshirtstore.structure.FaceMaskStructure;

import product.Product;

@Controller
public class FaceMaskController {
	
	private FaceMaskStructure faceMask = new FaceMaskStructure();
	
	@GetMapping("/masks")
	public String getAllProducts(Model model) {
		ArrayList<Product> faceMasks = faceMask.getProduct();
		model.addAttribute("faceMasks", faceMasks);
		return "faceMasks";
	}

}
