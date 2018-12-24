package com.ibm.bb.wrkshp.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ibm.bb.wrkshp.web.Student;

public class StudentDAO {
	
	private static final String MAIN_SQL = "Select * From STUDENT_DETAIL";

	public static List<Student> getStudents(Connection conn) throws SQLException{
		List<Student> students=new ArrayList<Student>();
		Statement s = conn.createStatement();
	    s.execute(MAIN_SQL);
	    ResultSet rs = s.getResultSet();
	    while(rs.next()){
	    	students.add(new Student(rs.getString("STUDENT_ID"), rs.getString("NAME"), rs.getString("SUBJECT"), rs.getInt("SCORE")));
	    }
		return students;
		
	}

}
