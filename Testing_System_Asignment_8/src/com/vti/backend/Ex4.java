package com.vti.backend;

import com.vti.entity.MyNumber;
import com.vti.entity.Salary;

public class Ex4 {
	public void Question1() {
		Salary salary = new Salary<Number>(42);
		salary.showSalary();
 	}
	
	public void Question3() {
		MyNumber<Number> number = new MyNumber<>();
		System.out.println(number.timMax(32, 31));
	}
}
