package COM.MYWEB.USER.MODEL;

import java.security.Timestamp;

public class UserVO {
	
	//DB의 컬럼과 동일허게 변수면 선언
	private String id;
	private String pw;
	private  String name;
	private String email;
	private String address;
	private String gender;
	private Timestamp regdate;
	
	public UserVO() {
		
	}

	public UserVO(String id, String pw, String name, String email, String address, String gender, Timestamp regdate) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.address = address;
		this.gender = gender;
		this.regdate = regdate;
	}
	

}
