package com.firsttryingprojcet1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firsttryingprojcet1.Service.AddressService;
import com.firsttryingprojcet1.model.Address;

@RestController
@RequestMapping("/api/adrs")
public class AddressController {
	
	@Autowired
	 AddressService addressService;
	
	@PostMapping("/saveaddress")
	public ResponseEntity<?>saveAddress(@RequestBody Address address){
		return new ResponseEntity<>(addressService.saveAddress(address), HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllAddress")
	public List<Address> getAllAddress(){
		return addressService.getAllAddress();
		
	}
	@GetMapping("/getAddressById/{id}")
	public ResponseEntity<?>getAddressById(@PathVariable long id){
		return new ResponseEntity<>(addressService.getAddressById(id),HttpStatus.OK);
		
	}
	
	@PatchMapping("/updateaddressDetails/{id}")
	public ResponseEntity<?> updateAddressDetails(@RequestBody Address address,@PathVariable Long id){
		return new ResponseEntity<>(addressService.updateAddressDetails(address, id), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteAddress(@PathVariable("id") long id){
		return new ResponseEntity<>("Address deleted successfully", HttpStatus.OK);
		
	}
	
	

}
