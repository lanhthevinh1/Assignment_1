package com.vti.backend;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vti.entity.Department;
import com.vti.utils.JdbcUtils;

public class DepartmentDao {
	public static List<Department> getListDepartment(Statement statement) throws SQLException{
		String sql = "Select * From Department;";
		
		ResultSet myResult = statement.executeQuery(sql);
		List<Department> departments = new ArrayList<Department>();
		
		while (myResult.next()) {
			departments.add(new Department(myResult.getInt(1),myResult.getString(2)));
		}
		return departments;
		
	}
	
	public static Department getDepartmentById(Statement statement, int id) throws SQLException {
		
		Department department = null;
		String sql = "Select * From Department;";
		ResultSet myResult = statement.executeQuery(sql);
		boolean check = false;
		while (myResult.next()) {
			if(myResult.getInt(1) == id) {
				department = new Department(myResult.getInt(1),myResult.getString(2));
				check = true;
				break;
			}
		}
		if(!check) System.out.println("Không tìm thấy department có id = " + id);
		return department;
	}
	
	public static boolean isDepartmentNameExists(String name) throws ClassNotFoundException, SQLException {
		boolean check = false;
		Statement statement = JdbcUtils.statement();
		String sql = "Select * From Department;";
		ResultSet myResult = statement.executeQuery(sql);
		while (myResult.next()) {
			if(myResult.getString("DepartmentName").equals(name)) {
				check = true;
				break;
			}
		}
		return check;
	}
	
	public static void createDepartment(String name) throws ClassNotFoundException, SQLException {
	String sql ="INSERT INTO Department	(DepartmentName)\r\n" + 
				"VALUES							(?);";
	PreparedStatement preparedStatement = JdbcUtils.connect().prepareStatement(sql);

	// input value
	// set 
	preparedStatement.setString(1, name);
	
	
	// b4 : excute SQL query
	int effectiedRecordAmount = preparedStatement.executeUpdate();
	
	// b5: Result set
	System.out.println("Create User: " + effectiedRecordAmount);

	}
	
	public static void updateDepartmentName(int id,String name) throws ClassNotFoundException, SQLException {
		if(isDepartmentNameExists(name)) {
			System.out.println("Department có tên: " + name + "đã tồn tại.");
			return;
		}
		String sql ="UPDATE Department"
				+ "	Set DepartmentName = ?"
				+ "	WHERE DepartmentID = ?";
		
		PreparedStatement preparedStatement = JdbcUtils.connect().prepareStatement(sql);
		
		preparedStatement.setString(1, name);
		preparedStatement.setInt(2, id);
		
		// b4 : excute SQL query
		int effectiedRecordAmount = preparedStatement.executeUpdate();
				
		// b5: Result set
		System.out.println("update User: " + effectiedRecordAmount);
	
	}
	
	public static void deleteDepartment(int id) throws ClassNotFoundException, SQLException {
		String sql = "DELETE\r\n" + 
					"FROM Department\r\n" + 
					"WHERE DepartmentID = ?;";
		PreparedStatement preparedStatement = JdbcUtils.connect().prepareStatement(sql);
		
		preparedStatement.setInt(1, id);
		// b4 : excute SQL query
		int effectiedRecordAmount = preparedStatement.executeUpdate();
						
		// b5: Result set
		System.out.println("Delete User: " + effectiedRecordAmount);
			
	}	
	
	public static void deleteDepartmentUsingProcedure(int id) throws ClassNotFoundException, SQLException {
		String sql = "{CALL company.delete_Department(?)}";
	
		CallableStatement callableStatement = JdbcUtils.connect().prepareCall(sql);
		
		callableStatement.setInt(1, id);
		
		// b4 : excute SQL query
		int effectiedRecordAmount = callableStatement.executeUpdate();
								
		// b5: Result set
		System.out.println("Cal produce delete User: " + effectiedRecordAmount);
				
	}
}
