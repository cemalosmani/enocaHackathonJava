package com.dejkoveci.enocaHackathonJava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dejkoveci.enocaHackathonJava.model.Address;
import com.dejkoveci.enocaHackathonJava.repository.IAddressRepository;

@RestController
@RequestMapping("/api")
public class AddressController {
	
	private IAddressRepository iAddressRepository;
	
	@Autowired
	public AddressController() {
		
		this.iAddressRepository = iAddressRepository;
		
	}
	
	//Get operation
	
	@GetMapping("/address")
	public ResponseEntity<List<Address>> getAll(){
		
		return new ResponseEntity<>(iAddressRepository.findAll(), HttpStatus.OK); 
		
	}
	
	//Post operation

	@PostMapping("/add")
	public ResponseEntity<Address> addAddress(@RequestBody Address address) {
		
        return new ResponseEntity<>(iAddressRepository.save(address), HttpStatus.OK);
		
	}
	
	//Put operation
	
	@PutMapping("/{name}/update")
	public ResponseEntity<Address> updateAddressByName(@PathVariable String name, @RequestBody Address address) {
		
		Address newAddress =  iAddressRepository.getAddressByName(name);
        return new ResponseEntity<>(iAddressRepository.save(newAddress), HttpStatus.OK);
		
	}
	
	//Delete operation
	
	@DeleteMapping("/{name}/delete")
	public ResponseEntity<Address> deleteAddress(@PathVariable String name) {
		iAddressRepository.deleteById(name);
		return new ResponseEntity<>(HttpStatus.OK);
		
	}
	
}
