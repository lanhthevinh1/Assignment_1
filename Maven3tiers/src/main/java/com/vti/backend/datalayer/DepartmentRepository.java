package com.vti.backend.datalayer;

import com.vti.entity.Department;
import com.vti.utils.JDBCUtils;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DepartmentRepository implements IDepartmentRepository {
    private JDBCUtils jdbcUtils;

    public DepartmentRepository(){
        jdbcUtils = new JDBCUtils();
    }

    @Override
    public List<Department> getListDepartments() throws SQLException, IOException, ClassNotFoundException {
        List<Department> departments = new ArrayList<>();

        Connection connection = jdbcUtils.connection();

        String sql = "SELECT * FROM Department";

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(sql);

        while(resultSet.next()){

            Department department = new Department(resultSet.getInt("DepartmentID"), resultSet.getString("DepartmentName"));
            departments.add(department);
        }

        jdbcUtils.disconnect();

        return departments;
    }

    @Override
    public  void createDepartment(String name) throws SQLException, IOException, ClassNotFoundException {
        Connection connection = jdbcUtils.connection();

        String sql = "INSERT INTO Department\t(DepartmentName)\n" +
                        "VALUES\t\t\t\t\t(?);";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(1,name);

        preparedStatement.executeUpdate();
        jdbcUtils.disconnect();
    }
}
