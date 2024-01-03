package com.example.controller_01_03;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestController
 */
@WebServlet("*.test") //1. 확장자 패턴을 씁니다.(~~~.test로 끝나면 맵핑)
public class TestController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public TestController() {
        super();
        
    }
    //2. get/post 요청도 하나로 모은다.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Jo(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Jo(request,response);
	}
	protected void Jo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//3.url 주소를 분리해주는 분기점(각 요청별로 코드를 만듬)
		
		request.setCharacterEncoding("utf-8"); //한글처리
		
		String uri = request.getRequestURI();
		
		String path = uri.substring(request.getContextPath().length());
		
		System.out.println(path);
		
		if(path.equals("/controller/join.test")) {
			//회원가입~~~~ 처리롲기
		}else if(path.equals("/controller/modify.test")) {
			//정보수정~~~~ 처리로직
		}else if(path.equals("/controller/delete.test")) {
			
		}else if(path.equals("/controller/logout.test")) {
			
		}
	}

}
