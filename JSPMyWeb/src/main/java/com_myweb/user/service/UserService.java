package com_myweb.user.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com_myweb.user.model.UserVO;





public interface UserService {
	
	public int join(HttpServletRequest request, HttpServletResponse response);
	public 	UserVO login(HttpServletRequest request, HttpServletResponse response);
	public	UserVO getUserInfo(HttpServletRequest request, HttpServletResponse response);
	public int update(HttpServletRequest request, HttpServletResponse response);
	public int delete(HttpServletResponse request, HttpServletResponse response);
}
