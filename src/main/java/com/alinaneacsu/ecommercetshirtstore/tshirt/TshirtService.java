package com.alinaneacsu.ecommercetshirtstore.tshirt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alinaneacsu.ecommercetshirtstore.product.Product;
import com.alinaneacsu.ecommercetshirtstore.tshirt.Tshirt.Gender;

@Service
public class TshirtService {

	@Autowired
	private TshirtRepository tshirtRepository;

	public List<Tshirt> getAllTshirts() {
		List<Tshirt> tshirts = new ArrayList<>();
		tshirtRepository.findAll()
						 .forEach(tshirts::add);
		return tshirts;
	}
	
	public Tshirt getTshirt(Long id) {
		return tshirtRepository.findById(id).get();
	}

	public void addTshirt(Tshirt tshirt) {
		tshirtRepository.save(tshirt);
	}

	public void updateTshirt(Long id, Tshirt tshirt) {
		tshirtRepository.save(tshirt);
	}

	public void deleteTshirt(Long id) {
		tshirtRepository.deleteById(id);
	}	
}
