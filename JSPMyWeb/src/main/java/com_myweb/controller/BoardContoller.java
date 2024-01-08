package com_myweb.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.filters.SetCharacterEncodingFilter;

import com.myweb.board.service.BoardService;
import com.myweb.board.service.BoardServiceImpl;

/**
 * Servlet implementation class BoardContoller
 */
@WebServlet("*.board")
public class BoardContoller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public BoardContoller() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
	}
	
	protected void action(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//3. Url주소를 분기
		request.setCharacterEncoding("utf-8");
		
		String uri= request.getRequestURI();
		String path = uri.substring(request.getContextPath().length());
		
		System.out.println(path);
		
		//////////////////////////////////////////////////////////////////////////////////////
		BoardService service = new BoardServiceImpl();
		
		
		if(path.equals("/board/list.board")) { // 목록화면
			request.getRequestDispatcher("board_list.jsp").forward(request, response);
			
			
		}else if(path.equals("/board/writer.board")) { //글쓰기 화면
			request.getRequestDispatcher("board_writer.jsp").forward(request, response);
		}else if (path.equals("/board/registForm.board")) {//글등록
			service.regist(request, response);
			response.sendRedirect("board_list.jsp");
		
		
		}
	
		
		
		}
	

}
