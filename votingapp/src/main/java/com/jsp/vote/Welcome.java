package com.jsp.vote;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class Welcome extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name1 = req.getParameter("cadidate1");
		String qry1 = "Update voting.count set vote=vote+1 where Id=1";
		String qry2 = "Update voting.count set vote=vote+1 where Id=2";
		String qry3 = "Update voting.count set vote=vote+1 where Id=3";
		
		String user=(String) req.getAttribute("user");
		
		System.out.println(user);

		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");

			if ("a".equals(name1)) {

				
				
				PreparedStatement pstmt1 = con.prepareStatement("Update voting.vo set count1=true where USERNAME=?");
				pstmt1.setString(1, user);
				pstmt1.executeUpdate();
				PreparedStatement pstmt = con.prepareStatement(qry1);
				pstmt.executeUpdate();

			}

			if ("b".equals(name1)) {

				PreparedStatement pstmt = con.prepareStatement(qry2);
				pstmt.executeUpdate();
				

				PreparedStatement pstmt1 = con.prepareStatement("Update voting.vo set count1=true where USERNAME=?");
				pstmt1.setString(1, user);
				pstmt1.executeUpdate();

			}
			if ("c".equals(name1)) {

				PreparedStatement pstmt = con.prepareStatement(qry3);
				pstmt.executeUpdate();
				

				PreparedStatement pstmt1 = con.prepareStatement("Update voting.vo set count1=true where USERNAME=?");
				pstmt1.setString(1, user);
				pstmt1.executeUpdate();

			}
//			RequestDispatcher rd = req.getRequestDispatcher("welcome");
//			rd.forward(req, resp);
//			
			PrintWriter out = resp.getWriter();
			out.print("<html><body bgcolor='yellow'><h1> Welcome to the new servlet </h1></body></html>");
			

			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
