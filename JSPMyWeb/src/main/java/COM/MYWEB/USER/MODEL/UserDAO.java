package COM.MYWEB.USER.MODEL;

import java.net.URL;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.text.DefaultEditorKit.InsertBreakAction;

import myweb.util.JdbcUtil;

public class UserDAO {
	
	//싱글톤
	//1
	private static UserDAO instance = new UserDAO();
	//2. 생성자 private
	private UserDAO() {
		
		try {
			//1.드라이버 호출문장
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	//3. getter메서드
	public static UserDAO getInstance() {
		return instance;
	}
/////////////////////////////////////////////
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String uid = "JSP";
	private String upw = "JSP";
	
	
	
	public int idCheck(String id) {
		
		int result=0;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		
		String sql = "select * from users where id =?";
		try {
			
			//conn객체생성
			conn=DriverManager.getConnection(url,uid,upw);
			//pstmt객체생성
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			//sql실행
			rs= pstmt.executeQuery();
			
			if(rs.next()) {//true라는 것은 -> 결과가 잇다는 뜻
				result =1;//중복의 의미
			}else {// false->값이 없다.
				result=0;//중복이 x
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(conn,pstmt,rs);
		}
		
		
		return result;
		
	}
	




}
