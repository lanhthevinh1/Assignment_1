package com.vti.entity;

import java.util.Scanner;

public class Studentt extends Person{
	private String maSinhVien;
	private float diemTB;
	private String email;
	public Studentt() {
		super();
	}
	public Studentt(String maSinhVien, float diemTB, String email) {
		super();
		this.maSinhVien = maSinhVien;
		this.diemTB = diemTB;
		this.email = email;
	}
	@Override
	public void inputInfo() {
		super.inputInfo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mã sinh viên: ");
		maSinhVien = sc.nextLine();
		System.out.println("Nhập điểm trung bình: ");
		diemTB = Float.parseFloat(sc.nextLine());
		System.out.println("Nhập email: ");
		email = sc.nextLine();
	}
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Mã Sinh Viên: "+ maSinhVien);
		System.out.println("Điểm trung bình: "+ diemTB);
		System.out.println("Email: "+email);
		System.out.println("Sinh viên này "+ checkHocBong());
	}
	public String checkHocBong() {
		if(diemTB>=8) {
		return "Được học bổng.";
		}else return "Không được học bổng.";
	}
}
