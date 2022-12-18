package com.dejkoveci.enocaHackathonJava.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dejkoveci.enocaHackathonJava.model.Address;
import com.dejkoveci.enocaHackathonJava.model.Customer;


public interface IAddressRepository extends JpaRepository<Address, String>{
	
	Address getAddressByName(String name);
	
}
