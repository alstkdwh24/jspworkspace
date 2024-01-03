package com.example.bin_01_03;

public class MemberVO {
	
	///자바빈 - DB통신과정에서 변수처릴르 쉽게하기 위한 데이터를 저장하는 클래스
	//1. 맴버변수를 은닉 - DB의 컬럼과 동일한 이름으로 만듭니다.
	//2. 생성자는 2개(기본생성자, 매개변수를 받는 생성자)
	//3. getter,setter

	private String id;
	private String name;
	private String email;
	

	public MemberVO() {
		
	}
	public MemberVO(String id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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

	
	
	
	
	
}
