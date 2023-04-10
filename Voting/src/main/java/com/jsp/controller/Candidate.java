package com.jsp.controller;

import java.io.IOException;
import java.sql.PreparedStatement;

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
 * Servlet implementation class Candidate
 */
@WebServlet("/Candidate")
public class Candidate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name1 = request.getParameter("cadidate1");

		HttpSession aSession = request.getSession();
		String uname1 = (String) aSession.getAttribute("attributeName");

		Member member = new Member(uname1);
		RegisterDao rDao = new RegisterDao();

		if ("a".equals(name1)) {

			rDao.candidate1();
			rDao.setValue(member);
			//rDao.cand1(member);

			response.getWriter().print("<html><body bgcolor='green'><h1> You Voted   Sucssefully Candidate 1</h1></body></html> ");

		}

		if ("b".equals(name1)) {

			rDao.candidate2();
			rDao.setValue(member);

			//rDao.cand2(member);

			response.getWriter().print("<html><body bgcolor='green'><h1> You Voted  Sucssefully  Candidate 2</h1></body></html> ");

		}
		if ("c".equals(name1)) {

			rDao.candidate3();
			rDao.setValue(member);
			//rDao.cand3(member);
			response.getWriter().print(
					"<html><body bgcolor='green'><h1> You  voted Successfully Voted Candidate 3</h1></body></html> ");

		}
		if ("d".equals(name1)) {

			rDao.candidate4();
			rDao.setValue(member);
			//rDao.cand3(member);
			response.getWriter().print(
					"<html><body bgcolor='green'><h1> You  voted Successfully Voted Candidate 4</h1></body></html> ");

		}
	}

}
