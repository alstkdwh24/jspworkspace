package com.wyweb.board.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.InitialContext;
import javax.sql.DataSource;
import javax.swing.border.TitledBorder;

import com_myweb.user.model.UserDAO;
import com_myweb.util.JdbcUtil;

public class BoardDAO {
	//싱글톤
		//1. 객체 1개 생성
		private static BoardDAO instance = new BoardDAO();
		//2. 생성자 private
		private BoardDAO() {
			
			try {
				//드라이버 호출문장
				//Class.forName("oracle.jdbc.driver.OracleDriver");
				
				//초기 설정값을얻을 수있는 객체
				InitialContext init= new InitialContext();
				
				 
				DataSource dataSource = (DataSource)init.lookup("java:comp/env/jdbc/oracle");
				
			} catch (Exception e) {
			}
			
		}
		//3. getter메서드
		public static BoardDAO getInstance() {
			return instance;
		}
		
		/////////////////////////////////////////////
		private String url = JdbcUtil.url;
		private String uid = JdbcUtil.uid;
		private String upw = JdbcUtil.upw;
		//
		private DataSource dateSource; 
		public void insert(String writer, String title,String content) {
			Connection conn= null;
			PreparedStatement pstmt=null;
			String sql = "insert into board(bno, writer, title, context)"
						+"values(board_seq.nextval, ?, ?, ?)";
			
			try {
				conn = dateSource.getConnection();
				pstmt=conn.prepareStatement("sql");
				pstmt.setString(1, writer);
				pstmt.setString(2, title);
				pstmt.setString(3, content);
				
				pstmt.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		}
		
}
