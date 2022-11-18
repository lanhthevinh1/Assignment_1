package com.vti.backend;

import java.util.Scanner;

import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.InvalidAgeInputException;

public class Ex2 {
	Department departments[] = new Department[3];
	public static void main(String[] args) {
		
		
	}
	
	public void  Question1_2() {
		try {
			float result = divide(6,1);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("cannot divide 0");
		}finally {
			System.out.println("divide completed!");
		}
		
	}
	public float divide(int a, int b) {
		return a/b;
	}
	
	public void Question3() {
		int[] numbers = {1, 2, 3};
//		System.out.println(numbers[10]);
		try {
			System.out.println(numbers[10]);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Question4() {
		for(int i = 0;i<departments.length;i++) {
//			departments[i] = new Department();
//			departments[i].setId(i);
//			departments[i].setName("department"+ i);
		}
		int index = 4;
		getIndex(index);
	}
	public void getIndex(int index) {
		try {
			System.out.println(departments[index].toString());
		} catch (Exception e) {
			System.out.println("Cannot find department.");
		}
	}
	
	public void Question5_6() throws Exception{
	
			inputAge();
		
	}
	public void Question7_8_9() throws Exception{
		Department department1 = new Department();
		System.out.println(department1.toString());
	}
	
	public void Question10_11_12() throws Exception {
		Group group1 = new Group();
		group1.show();
		
	}
	public void inputAge() throws Exception {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Nhập tuổi của bạn: ");
			String ageString = sc.nextLine();
			try {
				int age = Integer.parseInt(ageString);
				if(age>0) {
					System.out.println("Tuổi của bạn là: " + age);
					sc.close();
					return;
				}
				else throw new  Exception("Wrong inputing! The age must be greater than 0, please input again.");
			} catch (NumberFormatException e) {
				throw new InvalidAgeInputException("wrong inputing! Please input an age as int, input again.");
			}
		}
	}
	
	
}
