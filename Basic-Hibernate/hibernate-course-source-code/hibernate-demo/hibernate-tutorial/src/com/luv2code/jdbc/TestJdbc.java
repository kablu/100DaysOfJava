package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Iterator;

import com.mysql.cj.protocol.Resultset;

public class TestJdbc {

	public static void main(String[] args) {

		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String user = "root";

		try {
			System.out.println("Connecting to database: " + jdbcUrl);

			// TODO Please update the password
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, null);
			Statement statement= myConn.createStatement();
			System.out.println("All databases available are:");
			ResultSet resultset=statement.executeQuery("show databases");
			while (resultset.next()) {
				String dbName=resultset.getString(1);
				System.out.println("Database Name is :"+dbName);
			}
			System.out.println("Connection successful!!!");

		} catch (Exception exc) {
			exc.printStackTrace();
		}

	}

}
