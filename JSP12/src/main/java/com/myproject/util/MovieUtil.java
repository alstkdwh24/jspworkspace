package com.myproject.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MovieUtil {
	
	public static final String url = "jdbc:oracle:thin:@localhost:8181:xe";
	public static final String uid = "hr";
	public static final String upw = "hr";
	
	//공통부분
	public static void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		try {
			if(conn != null) conn.close();
			if(pstmt != null) pstmt.close();
			if(rs != null) rs.close();
			
		} catch (Exception e2) {
			System.out.println("-------close 에러------");
		}
	}
}
