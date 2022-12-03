package com.vti.frontend;

import com.vti.backend.datalayer.AdminRepository;
import com.vti.backend.presentationlayer.AdminController;
import com.vti.backend.presentationlayer.EmployeeController;
import com.vti.backend.presentationlayer.UserController;
import com.vti.utils.ScannerUtils;

import java.io.IOException;
import java.sql.SQLException;

public class Program {
    public static void main(String[] args) throws Exception {
        UserController userController = new UserController();
        AdminController adminController = new AdminController();
        EmployeeController employeeController = new EmployeeController();



//        System.out.println("Nhập Id user muốn tìm:");
//        try {
//            int id = ScannerUtils.inputInt("Nhập sai id");
//            System.out.println(userController.getUserById(id));
//        } catch (Exception e) {
//            System.out.println(new RuntimeException(e));
//        }

        String email,password;
        boolean running = true;
        try{
            System.out.println("Nhập Email: ");
            email = ScannerUtils.inputString();
            System.out.println("Nhập Password");
            password = ScannerUtils.inputString();
            // login
            adminController.login(email, password);
            while (running) {
                System.out.println("Nhập 1 trong các lựa chọn!");
                System.out.println("1: Show thông tin các User!");
                System.out.println("2: Tìm User theo Id");
                System.out.println("3: Xóa User theo Id");
                System.out.println("4: Thêm Employee");
                System.out.println("5: Thoát Chương trình");
                int value = ScannerUtils.inputInt("Đây không phải 1 trong các lựa chọn!");

                switch (value) {
                    case 1:
                        userController.showUser();
                        break;
                    case 2:
                        System.out.println("Nhập ID cần tìm: ");
                        int id = ScannerUtils.inputInt("Đây không phải ID");
                        userController.getUserById(id);
                        break;
                    case 3:
                        System.out.println("Nhập ID cần tìm: ");
                        int idDelete = ScannerUtils.inputInt("Đây không phải ID");
                        userController.deleteUserById(idDelete);
                        break;
                    case 4:
                        System.out.println("Nhập Employee email: ");
                        String emailEmployee = ScannerUtils.inputString();

                        System.out.println("Nhập Employee fullName: ");
                        String fullNameEmployee = ScannerUtils.inputString();

                        System.out.println("Nhập Employee ProSkills: ");
                        String proSkillEmployee = ScannerUtils.inputString();

                        employeeController.createEmployee(emailEmployee, fullNameEmployee, proSkillEmployee);
                        break;
                    default:
                        System.out.println("Đã đăng xuất");
                        running = false;
                        break;
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }



    }
}
