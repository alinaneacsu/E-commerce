package com.alinaneacsu.ecommercetshirtstore.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		final Customer customer = customerRepository.findByUsername(username);
		
		if(customer == null) {
			throw new UsernameNotFoundException(username);
		}
		
		UserDetails user = User.withUsername(customer.getUsername()).password(customer.getPassword()).authorities(customer.getRole()).build();
		return user;
	}
}
