package com.vti.backend;


import com.vti.entity.Employee;
import com.vti.entity.MyMap;
import com.vti.entity.Phone;
import com.vti.entity.Staff;

public class Ex3 {
	
	public static void main(String[] args) {
		Ex3 ex3 = new Ex3();
		ex3.Question2("vinh");
	}
	public <T> void Question2(T parameter) {
		System.out.println(parameter);
	}
	
	public <E> void Question4(E[] arrayE) {
		for(E element: arrayE) {
			System.out.println(element);
		}
	}
	public void Question5() {
		Integer salari1[] = {133,214,124}; 
		Float salari2[] = {321.3f,421.1f,213.12f};
		Double salari3[] = {124.5,1242.32,421.5};
		Employee<Integer> employee = new Employee<Integer>(0,"Lành Thế Vinh",salari1);
		Employee<Float> employee1 = new Employee<Float>(1,"Lành Thế Vinh",salari2);
		Employee<Double> employee2 = new Employee<Double>(2,"Lành Thế Vinh",salari3);
		
		System.out.println(employee);
		System.out.println(employee1);
		System.out.println(employee2);
		
	}
	
	public void Question6() {
		
		MyMap<Integer, String> student = new MyMap<Integer, String>(0, "Lành Thế Vinh");
		System.out.println(student.toString());
	}
	
	public void Question7() {
		Phone<String, String> phone1 = new Phone<String, String>("lanhthevinh1@gmail.com","0961924121");
		Phone<Integer, String> phone2 = new Phone<Integer, String>(0,"0961924121");
		Phone<String, String> phone3 = new Phone<String, String>("Lành Thế Vinh","0961924121");
		
		System.out.println(phone1);
		System.out.println(phone2);
		System.out.println(phone3);
	}
	
	public void Question8() {
		Staff<Integer, String> staff1 =  new Staff<Integer, String>(1, "Lành Thế Vinh");
		Staff<Long, String> staff2 =  new Staff<Long, String>(10L, "Lành Thế Vinh");
		System.out.println(staff1);
		System.out.println(staff2);
		
	}
}
