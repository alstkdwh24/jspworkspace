package com.mymovie.customer.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myproject.model.CustomerDAO;
import com.myproject.model.CustomerVO;

public class CustomerServiceImpl implements CustomerService {
	@Override
	public int join(HttpServletRequest request, HttpServletResponse response) {
		
		String customerid=request.getParameter("customerid");
		String name_=request.getParameter("name_");
		String age=request.getParameter("age");
		String pw=request.getParameter("pw");
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		String phone=request.getParameter("phone");
		
		
		
		
		
		CustomerDAO dao=CustomerDAO.getInstance();
		int result = dao.customeridCheck(customerid);
		if(result==1) {
			return result;
			
		}else {
			
			CustomerVO vo=new CustomerVO(customerid, name_, Integer.parseInt(age), pw, email, address, phone );
			dao.insertCustomer(vo);
			return 0;
		}
	
	}

}
