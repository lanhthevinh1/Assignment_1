package com.vti.backend.presentationlayer;

import com.vti.backend.businesslayer.EmployeeService;
import com.vti.backend.businesslayer.IEmployeeService;
import com.vti.backend.datalayer.IEmployeeRepository;

import java.io.IOException;
import java.sql.SQLException;

public class EmployeeController {
    private IEmployeeService employeeService;

    public EmployeeController(){
        employeeService = new EmployeeService();
    }

    public void createEmployee(String email, String fullName, String proSkills) throws Exception {
        String emailString[] = email.split("@");
        if (emailString.length != 2) {
            throw new Exception("Đây không phải Email");
        }

        employeeService.createEmployee(email, fullName, proSkills);
    }
}
