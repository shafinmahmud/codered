package com.farmhouse.beans;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SignUpBean {

	@NotNull
	@Size(min = 4, max = 80, message = "৪ থেকে ৮০ অক্ষরের মধ্যে একটি ইউজার নেম দিন")
	private String username;
	@NotNull
	@Size(min = 4, max = 40 , message = "৪ থেকে ৮০ অক্ষরের মধ্যে একটি পাসওয়ার্ড দিন")
	private String password;
	@NotNull
	@Size(min  = 4, max = 70, message ="আপনার পূর্ণ নাম লিখুন")
	private String fullName;
	@NotNull
	@Size(min=4,max = 100, message="আপনার ঠিকানা দিন ")
	private String address;
	@NotNull
	@Size(min = 11, max=11,message="একটি বৈধ ফোন নাম্বার দিন" )
	private String phoneNumber;
	private String url;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "SignUpBean [username=" + username + ", password=" + password + ", fullName=" + fullName + ", address="
				+ address + ", phoneNumber=" + phoneNumber + "]";
	}
	
	

}
