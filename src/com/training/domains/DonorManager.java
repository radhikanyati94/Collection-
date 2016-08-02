package com.training.domains;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.training.ifaces.IDonor;

public class DonorManager implements IDonor {

	private List<Donor> donarList;
	
	
	public DonorManager(List<Donor> donarlist) {
		super();
		this.donarList = donarlist;
	}
	
	

	public DonorManager() {
		super();
		donarList = new ArrayList<Donor>();
		// TODO Auto-generated constructor stub
	}



	@Override
	public boolean addDonor(Donor obj) {
		// TODO Auto-generated method stub
		boolean result= false;
		result = donarList.add(obj);
		return result;
	}

	@Override
	public boolean[] addDonors(Donor... dnrList) {
		// TODO Auto-generated method stub
		int size = dnrList.length;
		
		boolean result[] = new boolean[size];
		int i = 0;
		for(Donor donor: dnrList)
		{
			result[i] = donarList.add(donor);
			i++;
		}
		
		return result;
	}

	@Override
	public void printDonorList() {
		for(Donor donor: donarList)
		System.out.println(donor);
		// TODO Auto-generated method stub

	}

	@Override
	public List<Donor> getDonorList() {
		// TODO Auto-generated method stub
		return donarList;
	}
	
	public void printByOrder(Comparator comparator)
	{
		Collections.sort(donarList,comparator);
		printDonorList();
	}
}
