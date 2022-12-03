package com.vti.backend.presentationlayer;

import com.vti.backend.businesslayer.AdminService;
import com.vti.backend.businesslayer.IAdminService;

public class AdminController {
    private IAdminService adminService;

    public AdminController(){
        adminService = new AdminService();
    }

    public void login(String email, String password) throws Exception {
        String emailString[] = email.split("@");
        if (emailString.length != 2) {
            throw new Exception("Đây không phải Email");
        }
        if (password.length() < 6 || password.length() > 12) {
            throw new Exception("Nhập password quá dài hoắc quá ngắn!");
        }
        int charCaseAmount = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                charCaseAmount++;
            }
        }
        if (charCaseAmount < 1) {
            throw new Exception("Nhập password chưa có chữ in hoa!");
        }

        adminService.login(email, password);
    }
}
