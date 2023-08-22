package com.employeeRegistration;

public class Member {
	private String Uname;
	private String password;
	private String email;
	
	
	
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Member(String uname, String password, String email) {
		super();
		Uname = uname;
		this.password = password;
		this.email = email;
	}
	public String getUname() {
		return Uname;
	}
	public void setUname(String uname) {
		Uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
