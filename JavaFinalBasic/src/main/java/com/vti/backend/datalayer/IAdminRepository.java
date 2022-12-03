package com.vti.backend.datalayer;

public interface IAdminRepository {
    void login(String email, String password) throws Exception;
}
