package com.codegnan.file.io;

import java.io.Serializable;

public class AtmCard implements Serializable {
	long CardNumber;
	int pin;
	String exDate;
	int cvv;
	String CardHolderName;
	
	public AtmCard(long cardNumber, int pin, String exDate, int cvv, String cardHolderName) {
		super();
		CardNumber = cardNumber;
		this.pin = pin;
		this.exDate = exDate;
		this.cvv = cvv;
		CardHolderName = cardHolderName;
	}

	@Override
	public String toString() {
		return "AtmCard [CardNumber=" + CardNumber + ", pin=" + pin + ", exDate=" + exDate + ", cvv=" + cvv
				+ ", CardHolderName=" + CardHolderName + "]";
	}
	public void cardDetails() {
		System.out.println("Card Number:"+CardNumber);
		System.out.println("Pin Number:"+pin);
		System.out.println("Expiry Date:"+exDate);
		System.out.println("Cvv:"+cvv);
		System.out.println("Holder Name:"+CardHolderName);
	}
	


}
