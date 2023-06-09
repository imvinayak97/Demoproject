package com.jsp.controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.dao.RegisterDao;
import com.jsp.dto.Member;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String uname = request.getParameter("uname");
		String password = request.getParameter("password");

		Member member = new Member(uname, password);

		RegisterDao rDao = new RegisterDao();
		String s1 = rDao.userName(member);
		String s2 = rDao.passwordPs(member);

		System.out.println(s1);
		System.out.println(s2);
		
//		request.setAttribute("attributeName", uname);
//		RequestDispatcher rd = request.getRequestDispatcher("Candidate");
//		rd.forward(request, response);

		HttpSession aSession = request.getSession();
		aSession.setAttribute("attributeName", uname);
		
		String user1=rDao.user(member);
		

		boolean b = rDao.value1(member);
		
		

		if (uname.equals(s1) && password.equals(s2)) {

			if (b == false) {

				RequestDispatcher rd1 = request.getRequestDispatcher("candidate.jsp");
				rd1.forward(request, response);

			} else {
				
			
				response.getWriter().print("<html><body bgcolor='pink'><h1> You Already voted "+user1+ "</h1></body></html> ");
				RequestDispatcher rd1 = request.getRequestDispatcher("candidate.jsp");
				rd1.include(request, response);
			}

		} else if (uname.equals("admin") && password.equals("admin")) {

			RequestDispatcher rd1 = request.getRequestDispatcher("admin.jsp");
			rd1.forward(request, response);
		}

		else {
			response.getWriter().print(
					"<html><body bgcolor='red'><h1> Sorry Username and Password are incorrect </h1></body></html> ");

			RequestDispatcher rd1 = request.getRequestDispatcher("login.jsp");
			rd1.include(request, response);
		}

	}

}
