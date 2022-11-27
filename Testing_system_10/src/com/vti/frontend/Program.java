package com.vti.frontend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Result;
import com.vti.backend.DepartmentDao;
import com.vti.entity.Department;
import com.vti.utils.JdbcUtils;

public class Program {
	
	
//	public static Connection getConnection() throws SQLException, ClassNotFoundException {
//		String url = "jdbc:mysql://localhost:3306/company";
//		String user = "root";
//		String password = "Ltvinh01628434209";
//		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		return 
//	}
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
//		Connection myConnection = getConnection();
		
		Connection myConnection =  JdbcUtils.connect();
		Statement statement = myConnection.createStatement();
//		myConnection.setAutoCommit(false);
//		
//		try {
////			createAccount(myConnection);
//			updatePosition(myConnection);
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//			myConnection.rollback();
//			System.out.println("Rollback!");
//		}
//		myConnection.setAutoCommit(true);
		try {
//			showPosition(myConnection);
			DepartmentDao departmentDao = new DepartmentDao();
//			List<Department> departments = departmentDao.getListDepartment(statement);
//			for(Department department:departments) {
//				System.out.println(department.toString());
//			}
			System.out.println(departmentDao.getDepartmentById(statement, 5).toString());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Rollback!");
		}
		myConnection.close();
	}
	
	private static void createAccount(Connection connection) throws SQLException {
		String sql = "INSERT INTO `Account` (	 		Email, 			Username, 	Fullname, 		DepartmentID, PositionID,	 CreateDate)\r\n" + 
						"VALUES					( 			?,				?,			?,					?,			?,				?);";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		
		// input value
		String Email = "Lanhthevinh30@gmail.com", Username = "Thevinh1", Fullname = "Lanh The Vinh1", DepartmentID = "1", PositionID = "3", CreateDate = "2022-5-20";
		
		// set 
		preparedStatement.setString(1, Email);
		preparedStatement.setString(2, Username);
		preparedStatement.setString(3, Fullname);
		preparedStatement.setString(4, DepartmentID);
		preparedStatement.setString(5, PositionID);
		preparedStatement.setString(6, CreateDate);
		
		// b4 : excute SQL query
		int effectiedRecordAmount = preparedStatement.executeUpdate();
		
		// b5: Result set
		System.out.println("Create User: " + effectiedRecordAmount);
	
	}
	
	private static void createGroup() {
		
	}
	
	private static void showPosition(Connection connection) throws SQLException {
		String sql = "Select * From Position;";
		
		Statement statement = connection.createStatement();
		
		ResultSet myResult = statement.executeQuery(sql);
		
		System.out.println("PositionID"+ "  "+ "PositionName");
		while (myResult.next()) {
			
			System.out.println("\t" + myResult.getString("PositionID") + "  " + myResult.getString("PositionName"));
		}
	}
	
	private static void updatePosition(Connection myConnection) throws SQLException {
		String sql ="UPDATE Position"
				+ "	Set PositionName = ?"
				+ "	WHERE PositionID = ?";
		
		PreparedStatement preparedStatement = myConnection.prepareStatement(sql);
		
		String PositionID = "4";
		String PositionName = "Dev";
		
		preparedStatement.setString(1, PositionName);
		preparedStatement.setString(2, PositionID);
		
		// b4 : excute SQL query
		int effectiedRecordAmount = preparedStatement.executeUpdate();
				
		// b5: Result set
		System.out.println("Create User: " + effectiedRecordAmount);
	
	}
}