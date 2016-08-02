package com.training.apps;

import java.util.*;

import com.training.domains.CreditCard;

public class SetExample {

	public static void main(String[] args) {

		TreeSet<CreditCard> cardList = new TreeSet<CreditCard>();
		cardList.add(new CreditCard(101,"Ramesh",75000));
		
		
		cardList.add(new CreditCard(104,"Ram",45000));
		
		System.out.println(cardList);
		
	}

}
