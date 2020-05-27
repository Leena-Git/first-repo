package com.cg.example.beans;

import java.util.List;

public class User {
	
	@Override
	public String toString() {
		return "User [userid=" + userid + ", creditCards=" + creditCards + "]";
	}

	private int userid;
	
	
	private List<CreditCard> creditCards;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public List<CreditCard> getCreditCards() {
		return creditCards;
	}

	public void setCreditCards(List<CreditCard> creditCards) {
		this.creditCards = creditCards;
	}
	
	
	

}
