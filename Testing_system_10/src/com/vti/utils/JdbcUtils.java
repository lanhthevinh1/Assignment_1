package com.vti.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtils {
	private static final String url = "jdbc:mysql://localhost:3306/company";
	private static final String user = "root";
	private static final String password = "Ltvinh01628434209";
	public static Connection connect() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, user, password);
			return connection;
	}
	
	public static Statement statement() throws ClassNotFoundException, SQLException {
		return connect().createStatement();
	}
	
	public static void Disconnect() throws ClassNotFoundException, SQLException {
		connect().close();
	}
}
