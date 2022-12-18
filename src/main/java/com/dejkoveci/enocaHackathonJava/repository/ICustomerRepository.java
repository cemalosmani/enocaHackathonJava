package com.dejkoveci.enocaHackathonJava.repository;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dejkoveci.enocaHackathonJava.model.Customer;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Long> {
	
  Optional<Customer> findByEmail(String email);

  Boolean existsByUsername(String username);

  Boolean existsByEmail(String email);
  
  
}
