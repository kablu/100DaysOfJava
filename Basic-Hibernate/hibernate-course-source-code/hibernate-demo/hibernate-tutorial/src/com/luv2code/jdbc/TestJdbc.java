package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {

		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String user = "root";

		try {
			System.out.println("Connecting to database: " + jdbcUrl);

			//TODO Please update the password
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, null);

			System.out.println("Connection successful!!!");

		} catch (Exception exc) {
			exc.printStackTrace();
		}

	}

}
