package com.abhishek.jdbclearning;

import java.sql.*;

public class LaunchApp3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// Load and Register the driver
		Class.forName("com.mysql.cj.jdbc.Driver"); // load the class
		
		// Establish the connection
		String url = "jdbc:mysql://localhost:3306/jdbclearning";
		String user = "root";
		String password = "root26";
		Connection connect = DriverManager.getConnection(url, user, password);
		
		// Create statement
		 Statement statement = connect.createStatement();
		 
		 // Execute query
		 String sql = "Select * from studentinfo";
		 ResultSet rs = statement.executeQuery(sql);
		 // process the result
		 while(rs.next()) {
			 System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getInt(3) + " | " + rs.getString(4));
		 }
		 
		 // close the resources
		 rs.close();
		 statement.close();
		 connect.close();
	}

}
