package com.example.model_01_03;

public class MemberDAO {
	
	
	/*
	 * DAO는 데이터 베이스 연결을 처리한ㄴ 클래스
	 * 
	 * 불필요하게 요청별로 객체를 여러개 만들 필요가 없기 때문에 싱글통 디자인패턴을 이용해서 생성을 합니다.
	 * 
	 */

	
	//나 자신의 1개 객체를 만든다.
	private static MemberDAO instance = new MemberDAO();
	
	
	//생성자는 private를 처리합니다.
	private MemberDAO() {
		
	}
	//3. getter을 사용해서 내부에 만들어진  instance를 반환합니다.
	public static MemberDAO getInstance() {
		return instance;
	}
	//아래에서는 데이터베이스 관련 로직

}
