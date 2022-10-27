package backend;

import java.util.Scanner;

import entity.Student;

public class Ex4 {
	public void Question1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên sinh viên: ");
		String name = sc.nextLine();
		System.out.println("Nhập quê quán: ");
		String hometown = sc.nextLine();
		System.out.println("Nhập điểm học lực: ");
		double diem = sc.nextDouble();
		System.out.println("Nhập điểm cộng: ");
		double diemCong = sc.nextDouble();
//		Student student = new Student(name,hometown);
//		student.setDiemHocLuc(diem);
//		student.congDiem(diemCong);
//		System.out.println(student.getHocLuc());
	}
}
