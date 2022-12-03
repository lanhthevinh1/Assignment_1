package com.vti.entity;

import java.util.Date;

public class Account {
    private int accountId;
    private String email;
    private String username;
    private String fullname;
    private Department departmentId;
    private Position PositionID;
    private Date createDate;

    public Account() {
    }

    public Account(int accountId, String email, String username, String fullname, Department departmentId, Position positionID, Date createDate) {
        this.accountId = accountId;
        this.email = email;
        this.username = username;
        this.fullname = fullname;
        this.departmentId = departmentId;
        PositionID = positionID;
        this.createDate = createDate;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setDepartmentId(Department departmentId) {
        this.departmentId = departmentId;
    }

    public void setPositionID(Position positionID) {
        PositionID = positionID;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", fullname='" + fullname + '\'' +
                ", departmentId=" + departmentId +
                ", PositionID=" + PositionID +
                ", createDate=" + createDate +
                '}';
    }
}
