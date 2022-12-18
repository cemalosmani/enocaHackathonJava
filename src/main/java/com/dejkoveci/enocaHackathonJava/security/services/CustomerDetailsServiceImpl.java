package com.dejkoveci.enocaHackathonJava.security.services;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dejkoveci.enocaHackathonJava.model.Customer;
import com.dejkoveci.enocaHackathonJava.repository.ICustomerRepository;

@Service
public class CustomerDetailsServiceImpl implements UserDetailsService {
	
  @Autowired
  ICustomerRepository iCustomerRepository;

  @Override
  @Transactional
  public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
	  
    Customer customer = iCustomerRepository.findByEmail(email)
        .orElseThrow(() -> new UsernameNotFoundException("Customer Not Found with email: " + email));

    return CustomerDetailsImpl.build(customer);
  }

}
