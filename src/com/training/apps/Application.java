/**
 * 
 */
package com.training.apps;

import java.util.*;

import com.training.domains.*;
import com.training.utils.*;

/**
 * @author rnyati
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * create a Instance Donor Manager
		 * Add one Donor
		 * Print the list
		 * 
		 * add more than one donor using overloaded method
		 * Print the list
		 * 
		 * add one more donor
		 * invoke the method which returns list
		 * iterate through list and print 
		 */
		
		DonorManager implObj = new DonorManager();
		implObj.addDonor(new Donor(101,"Ramesh",8999,"Ram@abc.com"));
		
		implObj.printDonorList();
		
		Donor donor1 = new Donor(102,"John",83999,"John@abc.com");
		
		Donor donor2 = new Donor(103,"Tom",895699,"tom@abc.com");
		Donor donor3 = new Donor(104,"Tarng",895899,"tara@abc.com");
		
		implObj.addDonors(donor1,donor2,donor3);
		
		List<Donor> donorList = implObj.getDonorList();
		
		for(Donor obj: donorList)
		{
			System.out.println(obj);
		}
		
		List <String> nameList = new ArrayList<String>();
		nameList.add(new String("Zahir"));
		nameList.add(new String("Abhi"));
		nameList.add(new String("Yasif"));
		nameList.add(new String("Babu"));
		
		Collections.sort(nameList);
		System.out.println(nameList);
		
		Collections.sort(donorList);
		System.out.println("sort by phone number");
		implObj.printDonorList();
				
		System.out.println("sort by Name");
		
		
		
		implObj.printByOrder(new NameComparator());
		
		System.out.println("sort by Donor code");
		implObj.printByOrder(new DonorCodeComparator());
		
		
		
	}

}
