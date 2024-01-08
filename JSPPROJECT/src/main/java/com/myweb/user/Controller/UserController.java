package com.myweb.user.Controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myweb.user.service.UserService;
import com.myweb.user.service.UserServiceImpl;


@WebServlet("*.user")//확장자 패턴
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public UserController() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}
	

	
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
	//3.url 주소를 분리해주는 분기점(각 요청별로 코드를 만듬)
	
	request.setCharacterEncoding("utf-8");
	
	String uri = request.getRequestURI();
	
	String path = uri.substring(request.getContextPath().length());
	
	System.out.println(path);
	
	if(path.equals("/user/join.user")) { //가입화면
		
		//화면이동 기본값 - forward형식이 되어야함
		request.getRequestDispatcher("user_join.jsp").forward(request, response);
	}
	else if(path.equals("/user/login.user")) { //로그인 화면
		
		request.getRequestDispatcher("user_login.jsp").forward(request, response);
	}
	
	else if (path.equals("/user/joinForm.user")){ //회원가입
		
		//String id=request.getParameter("id");
		//.....
		
		UserService service = new UserServiceImpl();
		service.join(request, response);
	} 

	
	
	
	
	
	
	
	}

}
