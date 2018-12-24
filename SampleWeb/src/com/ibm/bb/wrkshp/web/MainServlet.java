package com.ibm.bb.wrkshp.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import com.ibm.bb.wrkshp.dao.StudentDAO;
import com.ibm.bb.wrkshp.dao.UserDAO;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String TABLE_LINE = "<TR><TH>STUDENT ID</TH><TH>NAME</TH><TH>SUBJECT</TH><TH>SCORE</TH>";
	private static final String ROW_LINE = "<TR><TD>%s</TD><TD>%s</TD><TD>%s</TD><TD>%s</TD>";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		fetchDbInfo(response);
		try {
			Connection conn =getConnection();
			 List<Student> students = StudentDAO.getStudents(conn);
			 System.out.println(students.size());
			HttpSession session = request.getSession(true); 
			session.setAttribute("students", students);
			response.sendRedirect("StudentDetails.jsp");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new ServletException(e.getMessage());
		}
	}

	private void fetchDbInfo(HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		out.println("<BODY>");
		out.println("<h1>Database Results</h1>");
		out.println("<table border=\"1\" style=\"width:100%\">");
		out.println(TABLE_LINE);
		try {
		    Context initCtx = new InitialContext();
		  
		    DataSource ds = (DataSource) initCtx.lookup("java:comp/env/jdbc/MyLocalDB"); 
		    Connection conn = ds.getConnection(); 
		    Statement s = conn.createStatement();
		    s.execute("Select * From STUDENT_DETAIL");
		    ResultSet rs = s.getResultSet(); 
		    while (rs.next()) {
		    	String line=String.format(ROW_LINE, rs.getString("STUDENT_ID"),rs.getString("NAME"),rs.getString("SUBJECT"),rs.getString("SCORE"));
		        out.println(line); 
		    } 
		    conn.close(); 
		    } catch (Exception ex) {
		        ex.printStackTrace();
		    } 
		out.println("</TABLE>");
		out.println("</BODY>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			Connection conn =getConnection();
			String user=request.getParameter("user");
			String password=request.getParameter("password");
			boolean loginSuccess = UserDAO.checkValidUser(conn,user , password);
			request.setAttribute("loginSuccess", loginSuccess);
			if(loginSuccess){
				HttpSession session = request.getSession(true); 
				session.setAttribute("currentSessionUser",user);
				response.sendRedirect("welcome.jsp");
			} else {
				response.sendRedirect("login.jsp");
			}
			
			
		} catch (Exception e) {
			throw new ServletException(e.getMessage());
		}
	}

	private Connection getConnection() throws Exception {
		Context initCtx = new InitialContext();
		  
	    DataSource ds = (DataSource) initCtx.lookup("java:comp/env/jdbc/MyLocalDB"); 
	    Connection conn = ds.getConnection();
	    return conn;
	}
	
	

}
