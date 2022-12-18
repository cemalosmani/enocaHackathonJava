package com.dejkoveci.enocaHackathonJava.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "addresses")
public class Address {

 @Id
 @Column(name = "name")
 private String name;

 @Column(name = "city")
 private String city;

 @Column(name = "county")
 private String county;

 @ManyToOne
 @JoinColumn(name = "customer_email")
 private Customer customer;

 public Address(String name, String city, String county, Customer customer) {
	 
	this.name = name;
	this.city = city;
	this.county = county;
	this.customer = customer;
	
 }
	
 public Address() {}

 public String getName() {
	return name;
 }

 public void setName(String name) {
	this.name = name;
 }

 public String getCity() {
	return city;
 }

 public void setCity(String city) {
	this.city = city;
 }

 public String getCounty() {
	return county;
 }

 public void setCounty(String county) {
	this.county = county;
 }

 public Customer getCustomer() {
	return customer;
 }

 public void setCustomer(Customer customer) {
	this.customer = customer;
 }
	
}
