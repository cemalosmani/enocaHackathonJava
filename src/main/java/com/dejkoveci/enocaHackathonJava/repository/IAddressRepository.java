package com.dejkoveci.enocaHackathonJava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dejkoveci.enocaHackathonJava.model.Address;


public interface IAddressRepository extends JpaRepository<Address, String>{
	
	Address getAddressByName(String name);
	
}
