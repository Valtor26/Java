package com.abhishek.jdbclearning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LaunchApp4 {

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
		 String sql = "Delete from studentinfo where id=1";
		 int rowAffected = statement.executeUpdate(sql);
		 // process the result
		 if(rowAffected == 0) {
			 System.out.println("Unable to delete the data");
		 }
		 else {
			 System.out.println("Data Deleted Successfully");
		 }
		 
		 // close the resources
		 statement.close();
		 connect.close();
	}

}
