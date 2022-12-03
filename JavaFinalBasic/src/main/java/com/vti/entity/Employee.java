package com.vti.entity;

public class Employee extends User{
    private String proSkill;

    public Employee() {
        super();
    }

    public Employee(int ID, String email, String fullName, String password, String proSkill) {
        super(ID, email, fullName, password);
        this.proSkill = proSkill;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString() +
                "proSkill='" + proSkill + '\'' +
                '}';
    }
}
