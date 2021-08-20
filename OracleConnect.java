/* 2. Write a JDBC Program in which first you create a connection with Oracle database
Update a record in an existing table where id = 3 and then fetch and print all the
records data as output in java. */




package com.jdbc;
import java.sql.*;
import java.util.*;
public class OracleConnect {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String url= "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String username = "preetham";
		String password = "root";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("Connection created");
		Statement stmt = con.createStatement();
		String CreateQuery = "UPDATE emp SET NAME= 'MODI' WHERE ID=3";
		stmt.executeUpdate(CreateQuery);
		ResultSet rs = stmt.executeQuery("SELECT * from emp");
		while(rs.next()) {
			System.out.println("ID is "+rs.getInt("ID")+" Name is "+rs.getString("NAME"));
		}
		con.close();
	}

}
