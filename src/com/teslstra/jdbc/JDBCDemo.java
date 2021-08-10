package com.teslstra.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3308/jdbc";
		String username = "root";
		String password = "root";
		String cmd = "INSERT INTO employee VALUES(8091, 'Raghu', 'Trainee')";
		int i = 0;
		Connection cn = null;
		Statement st = null;
		try {
			cn = DriverManager.getConnection(url, username, password);
			st = cn.createStatement();
			//i = st.executeUpdate("use jdbc");
			i = st.executeUpdate(cmd);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
