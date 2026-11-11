package com.abhishek.jdbclearning;

import java.sql.*;

public class LaunchApp2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
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
		 String sql = "Update studentinfo set sage=25 where id=2";
		 int rowAffected = statement.executeUpdate(sql);
		 // process the result
		 if(rowAffected == 0) {
			 System.out.println("Unable to update the data");
		 }
		 else {
			 System.out.println("Data Updated Successfully");
		 }
		 
		 // close the resources
		 statement.close();
		 connect.close();

	}

}
