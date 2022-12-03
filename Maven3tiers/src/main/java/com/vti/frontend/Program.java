package com.vti.frontend;

import com.vti.backend.presentationlayer.AccountController;
import com.vti.backend.presentationlayer.DepartmentController;
import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.utils.ScannerUtils;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
//        AccountController accountController = new AccountController();
//
//        List<Account> accounts = accountController.getListAccount();
//
//        for(Account account:accounts){
//            System.out.println(account);
//        }



        DepartmentController departmentController = new DepartmentController();

        List<Department> departments = departmentController.getListDepartment();

        for(Department department: departments){
            System.out.println(department);
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập tên Department: ");
        String name = ScannerUtils.inputString();



        try {
            departmentController.createDepartment(name);
            System.out.println("Nhập đúng!");
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Nhập sai!");
        }


    }
}
