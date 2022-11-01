package com.vti.entity;


public class Account {
	private int id;
	private String fullName;
	private String email;
	private int age;
	private Group[] groups;
	private float luong;
	private ScannerUtils sc;
	public Account() throws Exception {
		sc = new ScannerUtils();
		System.out.println("Nhập id");
		id = sc.inputInt("Đây Không phải số nguyên.");
		System.out.println("Nhập họ và tên: ");
		fullName = sc.inputString();
		System.out.println("Nhập email: ");
		email = sc.inputString();
		System.out.println("Nhập lương: ");
		luong = sc.inputFloat("Đây không phải số thực");
		age = inputAccountAge();
	}
	public void show() {
		System.out.println("ID: "+id);
		System.out.println("Họ và tên: "+ fullName);
		System.out.println("Lương: " + luong);
	}
	public int inputAccountAge() throws Exception {
		int ageCheck = 0;
		while(true) {
		ageCheck = sc.inputAge("Số vừa nhập không phải số nguyên");
		if(ageCheck >=18) return ageCheck;
		else throw new Exception ("Your age must be greater than 18");
		}
	}
}
