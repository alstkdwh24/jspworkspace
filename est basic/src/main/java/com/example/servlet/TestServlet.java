package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//1. URL맵핑 - 요청에 대해서 클래스를 연결하는 힌트
//@WebServlet("/apple") //클라이언트에서 ?apple 요청이 들어오면 이 클래스로 연결

public class TestServlet extends HttpServlet{
	
	//alt + shift + s
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//System.out.println("사블릿");
		//출력을 클라이언트로
		
		resp.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out= resp.getWriter();
		out.println("<b>헬로 월드</b>");
		out.println("<br>");
		out.println("<b>hello world</b>");
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	
	
	
	
	
}
