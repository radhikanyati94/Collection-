package com.training.domains;

import java.util.*;

/**
 * 
 * @author rnyati
 *
 */

public class CreditCard implements Comparable<CreditCard>{
    
	@Override
	public String toString() {
		return this.cardNumber+"."+this.cardHolderName+'.'+this.creditLimit+super.toString();
	}

	private long cardNumber;
    private String cardHolderName;
    private double creditLimit;
    private double amountSpent;
	
    
    
    public CreditCard(long cardNumber, String cardHolderName, double creditLimit,double amountSpent) {
		super();
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
		this.creditLimit = creditLimit;
		this.amountSpent = amountSpent;
	}
    
    public CreditCard(long cardNumber, String cardHolderName, double creditLimit) {
		super();
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
		this.creditLimit = creditLimit;
		
	}
    
    
	public CreditCard(long cardNumber) {
		this(cardNumber,"Guest",7500,7500);
		//super();
		//this.cardNumber = cardNumber;
	}

	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public long getCardNumber() {
		return cardNumber;
	}
	
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	public double getAmountSpent() {
		return amountSpent;
	}

	public void setAmountSpent(double amountSpent) {
		this.amountSpent = amountSpent;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}
	
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	
	public double getCreditLimit() {
		return creditLimit;
	}
	
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	
	public double calculateBillAmount()
	{
		double billAmount = 0.0;
		if(amountSpent<50000)
			billAmount = amountSpent*0.05;
		else
			billAmount = amountSpent*0.07;
		return billAmount;
	}

	@Override
	public int compareTo(CreditCard otherObj) {
	if(this.cardNumber>otherObj.cardNumber) return 1;
	if(this.cardNumber<otherObj.cardNumber) return -1;
	
		return 0;
	}
}
