package com.myweb.user.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.myweb.util.JdbcUtil;

public class UserDAO {
	
	//싱글톤
	//1. 객체 1개 생성
	private static UserDAO instance=new UserDAO();
	
	//2. 생성시 private
	private UserDAO() {
		
		try {
			//1. 드라이버 호출
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//3. getter매서드
	public static UserDAO getInstance() {
		return instance;
	}
	
	
	////////////////////////////////////////////////////
	private String url =JdbcUtil.url;
	private String uid =JdbcUtil.uid;
	private String upw =JdbcUtil.upw;
	
			
	public int idCheck(String id) {
		int result=0;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		String sql = "select * from users where id = ?";
		try {
			//conn개체생성
			conn = DriverManager.getConnection(url, uid, upw);
			
			//pstmt객체생성
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			//sql실핼 -> select는  executeQuery, DML -> executeUpdate
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				result = 1;
			}else {
				result = 0;
			}
			
		}catch(Exception e){
			e.printStackTrace();
			
		}finally {
			JdbcUtil.close(conn, pstmt, rs);
		}
	return result;
	}

	public void  insertUser(UserVO vo) {
		
		Connection conn = null;
		PreparedStatement pstmt=null;
		
		String sql = "INSERT INTO USERS(id, pw, name, email, address, gender) "
					+"values(?, ?, ?, ?, ?, ?)";
		
		try {
			conn =DriverManager.getConnection(url, uid, upw);
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2,vo.getPw());
			pstmt.setString(3,vo.getName());
			pstmt.setString(4,vo.getEmail());
			pstmt.setString(5,vo.getAddress());
			pstmt.setString(6,vo.getGender());
			
			pstmt.executeLargeUpdate();
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}finally {
			JdbcUtil.close(conn, pstmt, null);
		}
		
	}
}
