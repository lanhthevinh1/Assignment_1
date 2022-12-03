package com.vti.backend.businesslayer;

import com.vti.backend.datalayer.DepartmentRepository;
import com.vti.backend.datalayer.IDepartmentRepository;
import com.vti.entity.Department;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class DepartmentService implements IDepartmentService {
    private IDepartmentRepository repository;
    public DepartmentService(){
        repository = new DepartmentRepository();
    }

    @Override
    public List<Department> getListDepartments() throws SQLException, IOException, ClassNotFoundException {
        return repository.getListDepartments();
    }

    @Override
    public void createDepartment(String name) throws SQLException, IOException, ClassNotFoundException {
        repository.createDepartment(name);
    }
}
