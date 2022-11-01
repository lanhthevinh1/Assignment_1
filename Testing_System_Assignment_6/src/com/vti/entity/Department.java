package com.vti.entity;

public class Department {
	private int id;
	private String name;
	private ScannerUtils sc;
	public Department() throws Exception {
		sc = new ScannerUtils();
		System.out.println("Nhập ID phòng ban: ");
		id = sc.inputInt("Đây không phải số nguyên");
		System.out.println("Nhập tên phòng ban: ");
		name = sc.inputString();
	}
	public Department(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "id=: " + id + ", name: " + name;
	}
	
	
}
