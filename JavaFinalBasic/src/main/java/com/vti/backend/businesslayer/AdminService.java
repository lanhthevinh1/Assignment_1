package com.vti.backend.businesslayer;

import com.vti.backend.datalayer.AdminRepository;
import com.vti.backend.datalayer.IAdminRepository;

public class AdminService implements IAdminService {
    private IAdminRepository adminRepository;

    public AdminService(){
        adminRepository = new AdminRepository();
    }

    @Override
    public void login(String email, String password) throws Exception {
        adminRepository.login(email, password);
    }
}
