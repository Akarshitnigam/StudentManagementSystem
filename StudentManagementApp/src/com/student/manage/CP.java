package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	
	static Connection con;
	
	public static Connection createC() {
		try {
			//1) Load the driver

			Class.forName("com.mysql.jdbc.Driver");

			//2) Create the connection
			String user = "root";
			String password= "yourpassword";
			String url = "jdbc:mysql://localhost:3306/student_manage";
			con = DriverManager.getConnection(url, user, password);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
