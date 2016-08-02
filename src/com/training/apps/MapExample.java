package com.training.apps;
import java.util.*;

import com.training.domains.CreditCard;
public class MapExample {

	public static void main(String[] args) {
	Hashtable<String,CreditCard> list = new Hashtable<String,CreditCard>();
	list.put("A101", new CreditCard(101,"Ramesh",75000));	
	Object obj = list.put("A101", new CreditCard(103,"Rakesh",75000));
	System.out.println(obj);
	
	list.put("A102", new CreditCard(102,"Raj",175000));
	list.put("A103", new CreditCard(103,"Raju",275000));
	
	System.out.println(list.get("A101"));	
	
	Set<Map.Entry<String, CreditCard>> myList = list.entrySet();
	for(Map.Entry<String, CreditCard> element:myList)
	{
		System.out.println(element.getKey());
		System.out.println(element.getValue());
	}
	}

}
