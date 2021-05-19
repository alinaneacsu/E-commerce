package com.alinaneacsu.ecommercetshirtstore.restfulWebService;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alinaneacsu.ecommercetshirtstore.structure.CustomerStructure;

import user.Account;
import user.Customer;

@Controller
public class CustomerController {

	private CustomerStructure customerStructure = new CustomerStructure();

	@GetMapping("/customers")
	public String getAllCustomers(Model model) {
		ArrayList<Account> accounts = customerStructure.getAccount();
		model.addAttribute("customers", accounts);
		return "customers";
	}

	@RequestMapping(value = "/customers/{firstName}", method = RequestMethod.GET)
	public String getCustomerByFirstName(@PathVariable(name = "firstName") String firstName, Model model) {
		
		ArrayList<Account> accounts = customerStructure.getAccount();
	
		for(Account a : accounts) {
			if(a.getFirstName().equals(firstName)) {
				model.addAttribute("customersByFirstName", a);
				return "customersByFirstName";
			}
		}
		return null;
	}
}
