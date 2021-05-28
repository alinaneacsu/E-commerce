package com.alinaneacsu.ecommercetshirtstore.sticker;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StickerService {

	@Autowired
	private StickerRepository stickerRepository;
	
	public List<Sticker> getAllStickers() {
		List<Sticker> stickers = new ArrayList<>();
		stickerRepository.findAll()
						 .forEach(stickers::add);
		return stickers;
	}
	
	public Sticker getSticker(Long id) {
		return stickerRepository.findById(id).get();
	}

	public void addSticker(Sticker sticker) {
		stickerRepository.save(sticker);
	}

	public void updateSticker(Long id, Sticker sticker) {
		stickerRepository.save(sticker);
	}

	public void deleteSticker(Long id) {
		stickerRepository.deleteById(id);
	}	
	
}
