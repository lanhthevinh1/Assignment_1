package com.vti.entity;

public class Admin extends User{
    private int expInYear;

    public Admin() {
        super();
    }

    public Admin(int ID, String email, String fullName, String password, int expInYear) {
        super(ID, email, fullName, password);
        this.expInYear = expInYear;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    @Override
    public String toString() {
        return  "Admin{" +super.toString()+
                ", expInYear=" + expInYear +
                '}';
    }
}
