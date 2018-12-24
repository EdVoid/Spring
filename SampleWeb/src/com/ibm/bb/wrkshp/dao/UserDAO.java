package com.ibm.bb.wrkshp.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDAO {
	
	private static final String MAIN_LOGIN_SQL = "SELECT PASSWD FROM USER_DETAIL WHERE USER_ID='%s'";

	public static boolean checkValidUser(Connection conn,String user, String password) throws SQLException{
		boolean isValidUser=false;
		String srchQuery=String.format(MAIN_LOGIN_SQL, user);
		Statement s = conn.createStatement();
	    s.execute(srchQuery);
	    ResultSet rs = s.getResultSet();
	    if(rs.next()){
	    	isValidUser=password.equals(rs.getString("PASSWD"));
	    }
		return isValidUser;
		
	}

}
