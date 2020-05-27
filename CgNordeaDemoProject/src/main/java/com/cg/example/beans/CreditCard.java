package com.cg.example.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CreditCard {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int creditCardId;
	
	private String type;
	
	@Column(name="CreditCardNumber", columnDefinition="bigint")
	private String number;
	
	public CreditCard(String type, String creditCardNumber) {
		super();
		this.type = type;
		this.number = creditCardNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String Number() {
		return number;
	}

	public void setNumber(String creditCardNumber) {
		this.number = creditCardNumber;
	}

	@Override
	public String toString() {
		return "CreditCard [creditCardId=" + creditCardId + ", type=" + type + ", number=" + number + "]";
	}

	

	

}
