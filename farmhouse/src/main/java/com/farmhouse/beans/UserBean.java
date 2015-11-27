package com.farmhouse.beans;

public class UserBean {

	private String username;
	private String fullName;
	private String address;
	private String phoneNumber;
	private String url;
	
	public UserBean(){
		
	}
	
	public UserBean(String username, String fullName, String address, String phoneNumber, String url) {
		super();
		this.username = username;
		this.fullName = fullName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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
		return String.format("UserBean [username=%s, fullName=%s, address=%s, phoneNumber=%s, url=%s]", username,
				fullName, address, phoneNumber, url);
	}
	
}
