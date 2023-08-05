package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseConnectionClass {
	
	Connection conn;
	
	public BaseConnectionClass() {
	try {
		//1. Load the Driver
//		System.out.println("Trying to load the driver...");
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
//		System.out.println("Driver loaded....");
			
		//2. Acquire the connection
//		System.out.println("Trying to connect....");
		conn = 	DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
//		System.out.println("Connected : "+ conn);
		
					
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}
