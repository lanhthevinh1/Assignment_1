package com.vti.backend.businesslayer;

import com.vti.backend.datalayer.EmployeeRepository;
import com.vti.backend.datalayer.IEmployeeRepository;

import java.io.IOException;
import java.sql.SQLException;

public class EmployeeService implements IEmployeeService {
    private IEmployeeRepository employeeRepository;

    public EmployeeService(){
        employeeRepository = new EmployeeRepository();
    }

    @Override
    public void createEmployee(String email, String fullName, String proSkills) throws SQLException, IOException, ClassNotFoundException {
        employeeRepository.CreateEmployee(email, fullName, proSkills);
    }

}
