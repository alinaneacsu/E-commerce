package com.alinaneacsu.ecommercetshirtstore.faceMask;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FaceMaskService {

	@Autowired
	private FaceMaskRepository faceMaskRepository;
	
	public List<FaceMask> getAllFaceMasks() {
		List<FaceMask> masks = new ArrayList<>();
		faceMaskRepository.findAll()
						 .forEach(masks::add);
		return masks;
	}
	
	public FaceMask getFaceMask(Long id) {
		return faceMaskRepository.findById(id).get();
	}

	public void addFaceMask(FaceMask mask) {
		faceMaskRepository.save(mask);
	}

	public void updateFaceMask(Long id, FaceMask mask) {
		faceMaskRepository.save(mask);
	}

	public void deleteFaceMask(Long id) {
		faceMaskRepository.deleteById(id);
	}	
}
