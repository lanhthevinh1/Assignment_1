package com.vti.backend.presentationlayer;

import com.vti.backend.businesslayer.DepartmentService;
import com.vti.backend.businesslayer.IDepartmentService;
import com.vti.backend.datalayer.IDepartmentRepository;
import com.vti.entity.Department;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class DepartmentController {

    private IDepartmentService service;

    public  DepartmentController(){
        service = new DepartmentService();
    }

    public List<Department> getListDepartment() throws SQLException, IOException, ClassNotFoundException {
        return service.getListDepartments();
    }

    public void createDepartment(String name) throws Exception {
        if(name == null || name.length() > 50|| name.length() < 5) {
            throw new Exception("DepartmentName must be greater than 5 and less than 50 characters");
        }

        service.createDepartment(name);
    }

}
