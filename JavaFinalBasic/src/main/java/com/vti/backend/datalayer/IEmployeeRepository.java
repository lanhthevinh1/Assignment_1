package com.vti.backend.datalayer;

import java.io.IOException;
import java.sql.SQLException;

public interface IEmployeeRepository {
    void CreateEmployee(String email, String fullName, String proSkills) throws SQLException, IOException, ClassNotFoundException;
}
