package com.jsp.vote;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AB")
public class register extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String USERNAME = req.getParameter("un");
		String PASSWORD = req.getParameter("pw");
		String EMAIL = req.getParameter("em");
		String PN = req.getParameter("ph");
		int PHONE = Integer.parseInt(PN);

		PrintWriter output = resp.getWriter();
		output.print("<html><body bgcolor='red'> <h1> Student Information: " + USERNAME + " And " + PASSWORD + " And "
				+ EMAIL + " And " + PHONE + " </h1> </body> </html>");

		String qry = "insert into voting.vo values(?,?,?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");

			PreparedStatement pstmt = con.prepareStatement(qry);

			pstmt.setString(1, USERNAME);
			pstmt.setString(2, PASSWORD);
			pstmt.setString(3, EMAIL);
			pstmt.setInt(4, PHONE);

			pstmt.executeUpdate();
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.forward(req, resp);
			System.out.println("information Inserted !!");

		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
