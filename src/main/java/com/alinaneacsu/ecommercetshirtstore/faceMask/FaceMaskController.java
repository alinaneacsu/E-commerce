package com.alinaneacsu.ecommercetshirtstore.faceMask;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FaceMaskController {
	
	@Autowired
	private FaceMaskService faceMaskService;
	
	@RequestMapping("/masks")
	public String getAllFaceMasks(Model model) {
		List<FaceMask> faceMasks = faceMaskService.getAllFaceMasks();
		model.addAttribute("faceMasks", faceMasks);
		return "faceMasks";
	}
	
	@RequestMapping("/masks/{id}")
	public FaceMask getFaceMask(@PathVariable Long id) {
		return faceMaskService.getFaceMask(id);
	}

	@RequestMapping(method=RequestMethod.PUT, value="/masks/{id}")
	public void updateFaceMask(@RequestBody FaceMask faceMask, @PathVariable Long id) {
		faceMaskService.updateFaceMask(id, faceMask);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/masks/{id}")
	public void deleteFaceMask(@PathVariable Long id) {
		faceMaskService.deleteFaceMask(id);
	}

}
