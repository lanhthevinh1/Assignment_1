package com.vti.backend.businesslayer;

import java.io.IOException;
import java.sql.SQLException;

public interface IEmployeeService {
    void createEmployee(String email, String fullName, String proSkills) throws SQLException, IOException, ClassNotFoundException;
}
