package com.myweb.user.model;

public class UserDAO {
	
	//싱글톤
	//1. 객체 1개 생성
	private static UserDAO instance=new UserDAO();
	
	//2. 생성시 private
	private UserDAO() {
		
	}
	
	//3. getter매서드
	public static UserDAO getInstance() {
		return instance;
	}
	
	
	////////////////////////////////////////////////////
	
	
}
