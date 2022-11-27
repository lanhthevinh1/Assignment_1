package com.vti.backend;

import java.sql.SQLException;
import java.util.Scanner;

import com.vti.utils.JdbcUtils;

public class Ex2 {
	public void Question3() throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập Department id muốn tìm: ");
		int id = Integer.parseInt(sc.nextLine());
		
		DepartmentDao.getDepartmentById(JdbcUtils.statement(), id);
	}
}
