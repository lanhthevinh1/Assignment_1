package com.vti.entity;

public class Salary<N extends Number> {
	private N salary;

	public Salary(N salary) {
		this.salary = salary;
	}
	
	public void showSalary() {
		System.out.println("Salary: " +salary);
	}
	
}
