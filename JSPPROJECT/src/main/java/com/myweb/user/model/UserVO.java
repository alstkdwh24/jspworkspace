package com.myweb.user.model;

import java.security.Timestamp;


public class UserVO {
	
	//DB컬럼과 동일하게 변수명 선언
	private String id;
	private String pw;
	private String name;
	private String email;
	private String address;
	private String gender;
	private Timestamp regdard;
	public UserVO() {
		}
	public UserVO(String id, String pw, String name, String email, String address, String gender, Timestamp regdard) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.address = address;
		this.gender = gender;
		this.regdard = regdard;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Timestamp getRegdard() {
		return regdard;
	}
	public void setRegdard(Timestamp regdard) {
		this.regdard = regdard;
	}
	
}
