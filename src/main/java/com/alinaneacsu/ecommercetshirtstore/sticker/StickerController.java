package com.alinaneacsu.ecommercetshirtstore.sticker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class StickerController {
	
	@Autowired
	private StickerService stickerService;
	
	@RequestMapping("/stickers")
	public String getAllStickers(Model model) {
		List<Sticker> stickers = stickerService.getAllStickers();
		model.addAttribute("stickers", stickers);
		return "stickers";
	}
	
	@RequestMapping("/stickers/{id}")
	public Sticker getSticker(@PathVariable Long id) {
		return stickerService.getSticker(id);
	}

	@RequestMapping(method=RequestMethod.PUT, value="/stickers/{id}")
	public void updateSticker(@RequestBody Sticker sticker, @PathVariable Long id) {
		stickerService.updateSticker(id, sticker);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/stickers/{id}")
	public void deleteSticker(@PathVariable Long id) {
		stickerService.deleteSticker(id);
	}
}
