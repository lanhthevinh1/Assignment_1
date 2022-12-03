package com.vti.backend.datalayer;

import com.vti.entity.Department;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface IDepartmentRepository {
    List<Department> getListDepartments() throws SQLException, IOException, ClassNotFoundException;

    void createDepartment(String name) throws SQLException, IOException, ClassNotFoundException;
}
