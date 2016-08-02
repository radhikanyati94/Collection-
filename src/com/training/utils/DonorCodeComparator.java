package com.training.utils;

import java.util.Comparator;

import com.training.domains.Donor;

public class DonorCodeComparator implements Comparator<Donor> {

	@Override
	public int compare(Donor object1, Donor object2) {

		if(object1.getDonorCode()>object2.getDonorCode())return 1;
		if(object1.getDonorCode()<object2.getDonorCode())return -1;
		return 0;
	}
	
	

}
