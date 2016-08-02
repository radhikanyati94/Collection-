/**
 * 
 */
package com.training.domains;

/** Represents the Donors to various Service Project
 * @author rnyati
 *
 */
public class Donor implements Comparable<Donor>{
	

	private long donorCode;
	private String donorName;
	private long handPhone;
	private String email;
	
	public Donor() {
		super();
	}

	public Donor(long donorCode, String donorName, long handPhone, String email) {
		super();
		this.donorCode = donorCode;
		this.donorName = donorName;
		this.handPhone = handPhone;
		this.email = email;
	}

	public long getDonorCode() {
		return donorCode;
	}

	public void setDonorCode(long donorCode) {
		this.donorCode = donorCode;
	}

	public String getDonorName() {
		return donorName;
	}

	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}

	public long getHandPhone() {
		return handPhone;
	}

	public void setHandPhone(long handPhone) {
		this.handPhone = handPhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		
		buffer = buffer.append(donorCode).append(".").append(donorName).append(".").append(handPhone).append(email);
		
		return buffer.toString();
	}
	

	@Override
	public int compareTo(Donor obj) {
		
		if(this.handPhone>obj.handPhone) return 1;
		if(this.handPhone<obj.handPhone) return -1;
		
		return 0;
	}
	
	

}
