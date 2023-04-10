package com.jsp.vote;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/WB")
public class ValidateServlet extends HttpServlet {

	@Override()
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String USERNAME = req.getParameter("un");
		String PASSWORD = req.getParameter("pw");

		PrintWriter out = resp.getWriter();
		
		
	

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("sdcds");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			System.out.println("dsf");

			PreparedStatement pstmt = con.prepareStatement("select * from voting.vo where PASSWORD=? ");
			System.out.println("platform created");

			pstmt.setString(1, PASSWORD);
			ResultSet rc = pstmt.executeQuery();
			
			Statement pstmt1 = con.createStatement();
			ResultSet rc1 = pstmt1.executeQuery("select * from voting.count");
//			
//			Statement pstmt2 = con.createStatement();
//			ResultSet rc2 = pstmt2.executeQuery("select * from voting.vo");
//			int count1=rc2.getInt("count1");
//			System.out.println(count1);

			if (rc.next()) {

				String USERNAM = rc.getString(1);
				String PASSWOR = rc.getString(2);
				boolean count1=rc.getBoolean(5);
				System.out.println(USERNAM);
				System.out.println(PASSWOR);
				System.out.println(count1);

				if (USERNAME.equals(USERNAM) && PASSWORD.equals(PASSWOR)) {
					
					req.setAttribute("user", USERNAME);
					RequestDispatcher d=req.getRequestDispatcher("welcome");
					d.include(req, resp); 
					
//					if(count1==false) {
//						out.print(
//								"<html><body ''bgcolor='red'><h1> You Already voted </h1></body></html> ");	
//						
//						
//					}
//					
//					else {

					RequestDispatcher rd = req.getRequestDispatcher("candidate.html");
					rd.forward(req, resp);
					

				}

				else {
					out.print(
							"<html><body ''bgcolor='red'><h1> Sorry username and password are incorrect </h1></body></html> ");

					RequestDispatcher rd = req.getRequestDispatcher("index.html");
					rd.include(req, resp);
				}

			}
			//if(rc1.next()) {
				if (USERNAME.equals("admin") && PASSWORD.equals("admin")) {

					while(rc1.next()) {
						int Id = rc1.getInt("Id");
						String name = rc1.getString("cadidatename");
						int vote1 = rc1.getInt("vote");
						out.print("<html><body bgcolor='red'><h1>The vote is:" + Id + " name " + name + " VOTE " + vote1
								+ " </h1></body></html> ");
					}
				}

			//}
		}
		catch(SQLException a) {
			a.printStackTrace();
			
		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}
}
