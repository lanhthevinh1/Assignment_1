package com.vti.backend;

import com.vti.entity.HinhTron;
import com.vti.entity.MyMath;
import com.vti.entity.PrimaryStudent;
import com.vti.entity.SecondaryStudent;
import com.vti.entity.Student;

public class Ex1 {
	public void Question1_4() {
		Student student1 = new Student(1,"Nguyễn Văn A");
		Student student2 = new Student(2,"Nguyễn Văn B");
		Student student3 = new Student(3,"Nguyễn Văn C");
		Student[] students = {student1,student2,student3};
		student1.setCollege("Đại học bách khoa");
		for(Student student:students) {
			System.out.println(student.toString());
			System.out.println("College: "+student.getCollege()+"\n");
		}
		System.out.println("\n\n");
		student1.setCollege("Đại học công nghệ");
		for(Student student:students) {
			System.out.println(student.toString());
			System.out.println("College: "+student.getCollege()+"\n");
		}
	}
	public void Question2() {
		Student student1 = new Student(1,"Nguyễn Văn A");
		Student student2 = new Student(2,"Nguyễn Văn B");
		Student student3 = new Student(3,"Nguyễn Văn C");
		Student[] students = {student1,student2,student3};
		for(Student student:students) {
			student.addGroupMoney(100);
		}
//		B2:
		
		student1.takeGroupMoney(50,"Mua bim bim, kẹo về liên hoan.");
//		B3:
		student2.takeGroupMoney(20,"Mua bánh mì.");
//		B4:
		student3.takeGroupMoney(150, "Mua đồ dùng học tập cho nhóm.");
//		B5:
		for(Student student:students) {
			student.addGroupMoney(50);
		}
	}
	
	public void Question3() {
		int result = MyMath.max(4, 1);
		System.out.println(result);
	}
	
	public void Question5_6_7() {
		PrimaryStudent student1 = new PrimaryStudent(1,"Nguyễn Văn A");
		PrimaryStudent student2 = new PrimaryStudent(2,"Nguyễn Văn B");
		SecondaryStudent student3 = new SecondaryStudent(3,"Nguyễn Văn C");
		SecondaryStudent student4 = new SecondaryStudent(3,"Nguyễn Văn D");
		SecondaryStudent student5 = new SecondaryStudent(3,"Nguyễn Văn E");
		SecondaryStudent student6 = new SecondaryStudent(3,"Nguyễn Văn F");
		System.out.println("Tất cả số học sinh: "+ student1.getCount());
		System.out.println("Số PrimaryStudent: "+ student1.getPrimaryStudentCount());
		System.out.println("Số SecondaryStudent: "+ student3.getSecondaryCount());
	}
	
	public void Question8() throws Exception {
		HinhTron hinhtron1 = new HinhTron();
		HinhTron hinhtron2 = new HinhTron();
		HinhTron hinhtron3 = new HinhTron();
		HinhTron hinhtron4 = new HinhTron();
		HinhTron hinhtron5 = new HinhTron();
		HinhTron hinhtron6 = new HinhTron();
	}
	public void Question9() {
		
	}
}
