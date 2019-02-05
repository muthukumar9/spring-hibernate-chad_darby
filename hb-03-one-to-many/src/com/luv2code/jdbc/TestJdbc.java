/**
 * 
 */
package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author mutsubra0
 *
 */
public class TestJdbc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/hb-01-one-to-one-uni?useSSL=false&serverTimezone=UTC";
		String user = "hbstudent";
		String password = "hbstudent";
		
		//test jdbc connection
		try {
			
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, password);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
