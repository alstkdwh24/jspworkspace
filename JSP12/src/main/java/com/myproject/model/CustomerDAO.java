package com.myproject.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



import com.myproject.util.MovieUtil;

public class CustomerDAO {

	private static CustomerDAO instance = new CustomerDAO();
	
	private String url = MovieUtil.url;
	private String uid = MovieUtil.uid;
	private String upw = MovieUtil.upw;
	
	
	private CustomerDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (Exception e) {
			}
	}
	public static CustomerDAO getInstance() {
		
		return instance;
	}
	
	public int idCheck(String id) {
		
		
	
		int result=0;
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs =null;
		
		
		String sql="SELECT * FROM customer WHERE customerid=?";
				
		try { 
			conn =DriverManager.getConnection(url,uid,upw);
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,id);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				result=1;
			}else {
				result=0;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			MovieUtil.close(conn, pstmt, rs);
		}
		return result;
	}
	
	
	public void insertCustomer(CustomerVO vo) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		String sql="insert into CUSTOMER(customerid, name, age, pw, email, address,phone)"
					+"VALUES(?, ?, ?, ?, ?, ?, ?)";
		
		try {
			conn=DriverManager.getConnection(url, uid, upw);
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,vo.getCustomerId());
			pstmt.setString(2,vo.getName());
			pstmt.setInt(3,vo.getAge());
			pstmt.setString(4,vo.getPw());
			pstmt.setString(5,vo.getEmail());
			pstmt.setString(6,vo.getAddress());
			pstmt.setString(7,vo.getPhoneNumber());
			
			pstmt.executeUpdate();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			MovieUtil.close(conn, pstmt, null);
		}
	}
	
	
	
	
	
	
	
}
