package com.alinaneacsu.ecommercetshirtstore.restfulWebService;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alinaneacsu.ecommercetshirtstore.structure.StickerStructure;

import product.Product;

@Controller
public class StickerController {
	
	private StickerStructure sticker = new StickerStructure();
	
	@GetMapping("/stickers")
	public String getAllProducts(Model model) {
		ArrayList<Product> stickers = sticker.getProduct();
		model.addAttribute("stickers", stickers);
		return "stickers";
	}

}
