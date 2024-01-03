package com.example.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class jomansang
 */
@WebServlet("/jomansang")
public class jomansang_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public jomansang_1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			    String name = request.getParameter("name");
			    System.out.println("넘어온 값을 소비:" + name);
			    
			    
			    //리퀘스트에 강제로 값을 저장
			    request.setAttribute("data", "홍길동 20세");
			    
			    
			    
//			    //자바코드로 포워드를 사용하는 방법
//			   RequestDispatcher a= request.getRequestDispatcher("forward_ex05.jsp");
//			    a.forward(request, response);
//			    
			    request.getRequestDispatcher("actionTag/forward_ex05.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
