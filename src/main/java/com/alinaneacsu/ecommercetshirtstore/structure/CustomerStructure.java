package com.alinaneacsu.ecommercetshirtstore.structure;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.alinaneacsu.ecommercetshirtstore.user.Account;
import com.alinaneacsu.ecommercetshirtstore.user.Customer;

public class CustomerStructure {

	private ArrayList<Account> accounts = new ArrayList<>();
	
	public CustomerStructure() {
		try {
			populate();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Account> getAccount() {
		return accounts;
	}
	
	public void setAccount(ArrayList<Account> account) {
		accounts.addAll(account);
	}
	
	private void populate() throws ParseException {
		String s1 = "17/05/2021";  
	    Date d1 = new SimpleDateFormat("dd/MM/yyyy").parse(s1);  
	    
	    String s2 = "17/05/2021";  
	    Date d2 = new SimpleDateFormat("dd/MM/yyyy").parse(s1);  
	    
	    String s3 = "11/03/2021";  
	    Date d3 = new SimpleDateFormat("dd/MM/yyyy").parse(s1);  
	    
		Account a1 = new Customer("Mihaila", "Cristina", "2900712890032", "0732453021", "mihaila.cristina@gmail.com", "Bd. Dezrobirii, nr. 9", 
				"Bd. Dezrobirii, nr. 9", d1);
		Account a2 = new Customer("Stefanescu", "Daniel", "1800312450076", "0760903125", "dstefanescu@gmail.com", "Crinul de Padure, nr. 3", 
				"Crinul de Padure, nr 3", d2);
		Account a3 = new Customer("Mai", "Bogdan", "1951129124509", "0766809333", "mai.bogdan@gmail.com", "Bd. Revolutiei, nr. 101",
				"Strada Gorjului, nr. 12", d3);
		
		accounts.add(a1);
		accounts.add(a2);
		accounts.add(a3);
	}
}
