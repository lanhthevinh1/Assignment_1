package com.vti.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.activation.MailcapCommandMap;

import com.vti.entity.MyMath;
import com.vti.entity.OldPhone;
import com.vti.entity.SmartPhone;
import com.vti.entity.Student;
import com.vti.entity.Studentt;

public class Ex2 {
	public static void main(String[] args) {
//		Question1();
//		Question5();
		Question4();
	}
	public static void Question1() {
		List<Student> listStudent = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		int id = 0;
		String name = "";
		int group = 0;
		int i = 0;
		while(i<10) {
			
			System.out.println("Nhập id:");
			id = Integer.parseInt(sc.nextLine());
			
			System.out.println("Nhập tên: ");
			name = sc.nextLine();
			
			System.out.println("Nhập group: ");
			group = Integer.parseInt(sc.nextLine());
			Student student = new Student(id,name,group);
			listStudent.add(student);
			i++;
		}
		for(Student student:listStudent) {
			student.diemDanh();
		}
		System.out.println("Nhóm 1: đi học bài");
		for(Student student:listStudent) {
			if(student.getGroup() == 1) {
				student.hocBai();
			}
		}
		System.out.println("Nhóm 2 đi dọn vệ sinh");
		for(Student student:listStudent) {
			if(student.getGroup() == 2) {
				student.donVeSinh();
			}
		}
	}
	
	public void Question2() {
		Studentt student = new Studentt();
		Scanner sc = new Scanner(System.in);
		student.inputInfo();
		student.showInfo();
	}
	
	public static void Question4() {
		MyMath math = new MyMath();
		byte a  = 3;
		float b = 5;
		System.out.println(math.sum(a, b));
	}
	public static void Question5() {
		OldPhone phone1 = new OldPhone("0991428374");
		SmartPhone phone2 = new SmartPhone("0947276492");
		phone1.goiDT(phone2.ngheDT());
		phone2.goiDT(phone1.ngheDT());
		phone2.nhanTN(phone1.guiTN());
		
	}
}
 