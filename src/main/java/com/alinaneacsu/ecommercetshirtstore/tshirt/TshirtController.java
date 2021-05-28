package com.alinaneacsu.ecommercetshirtstore.tshirt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TshirtController {

	@Autowired
	private TshirtService tshirtService;
	
	@RequestMapping("/tshirts")
	public String getAllTshirts(Model model) {
		List<Tshirt> tshirts = tshirtService.getAllTshirts();
		model.addAttribute("tshirts", tshirts);
		return "tshirts";
	}
	
	@RequestMapping("/tshirts/{id}")
	public Tshirt getTshirt(@PathVariable Long id) {
		return tshirtService.getTshirt(id);
	}
	
	@RequestMapping("/addTshirt")
	public String addTshirt(Tshirt tshirt) {
		tshirtService.addTshirt(tshirt);
		return"addTshirt";
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/tshirts/{id}")
	public void updateTshirt(@RequestBody Tshirt tshirt, @PathVariable Long id) {
		tshirtService.updateTshirt(id, tshirt);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/tshirts/{id}")
	public void deleteTshirt(@PathVariable Long id) {
		tshirtService.deleteTshirt(id);
	}
	
}
