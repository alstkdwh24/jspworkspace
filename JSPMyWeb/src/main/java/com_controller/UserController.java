package com_controller;

import java.io.IOException;
import java.nio.file.attribute.UserPrincipalLookupService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import myweb.user.service.UserService;
import myweb.user.service.UserServiceIMpI;


@WebServlet("*.user")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public UserController() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
		
	}
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//3. URL주소를 분기(각 요청별로 코드를 만듬)
		request.setCharacterEncoding("utf-8");
		
		String uri = request.getRequestURI();
		String path = uri.substring(request.getContextPath().length());
		
		System.out.println(path);
		//서비스 영역 선언
		UserService service = new UserServiceIMpI();
		
		if(path.equals("/user/join.user")) {//강비화면
			//화면이동 기본값 - forward형식이 되어야함
			request.getRequestDispatcher("user_join.jsp").forward(request,response);
		} else if(path.equals("/user/login.user")) {//로그인 화면
			request.getRequestDispatcher("user_login.jsp").forward(request, response);
		}else if (path.equals("/user/joinForm.user")) {//회원가입
//			String id=request.getParameter("id");
//		
			//....
			
		
			int result = service.join(request,response);
			
			System.out.println("실행결과:" + result);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doAction(request, response);
		
	}

}