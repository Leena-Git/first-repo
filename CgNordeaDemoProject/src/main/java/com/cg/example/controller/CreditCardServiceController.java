package com.cg.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.example.beans.User;
import com.cg.example.service.CreditCardServices;

@RestController
public class CreditCardServiceController {
	
	@Autowired
	CreditCardServices creditCardServices;
	
	@PostMapping(value = {"/acceptCreditCardDetails"})
	public ResponseEntity<User> acceptCreditCardDetails(@RequestBody User user){
		user.getCreditCards().forEach(cc -> System.out.println());
		creditCardServices.acceptCreditCardDetails(user.getCreditCards());
		return new ResponseEntity<User>(HttpStatus.OK);
		 
	}

}
