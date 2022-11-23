package com.vti.entity;

import java.time.LocalDate;
import java.util.Comparator;

public class Student<T> implements Comparable<Student>{
	private int id;
	private static int count = -1;
	private String name;
	private LocalDate ngaySinh;
	private double diem;
	public Student() {
		this.id =++count;
	}
	public Student( String name) {
		this.id =++count;
		this.name = name;
	}
	
	
	public Student(int id, String name, LocalDate ngaySinh, double diem) {
		this.name = name;
		this.ngaySinh = ngaySinh;
		this.diem = diem;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Student " + id + ":\n name=" + name + "\n ngaySinh=" + ngaySinh + "\n diem=" + diem;
	}
	@Override
	public int compareTo(Student other) {
		if(other == null)
		return -1;
		
		String nameArray[] = name.split(" ");
		String lastName = nameArray[nameArray.length-1];
//		char nameChar = lastName.charAt(0);
		
		String nameArrayOther[] = other.name.split(" ");
		String lastNameOther = nameArrayOther[nameArray.length-1];
//		char nameOtherChar = lastNameOther.charAt(0);
		
		if(lastName.charAt(0) < lastNameOther.charAt(0)) {
			return -1;
		}else if(lastName.charAt(0) > lastNameOther.charAt(0)) {
			return 1;
		}
		
		if(ngaySinh.equals(other.ngaySinh)) {
			
		}
		return 0;
	}
	
	public void timKiemId(int id) {
		if(this.id == id) {
			System.out.println(this.toString());
		}
	}
	
	public void timKiemName(String name) {
		if(name.equals(this.name)) {
			System.out.println(this.toString());
		}
	}
	public LocalDate getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public double getDiem() {
		return diem;
	}
	public void setDiem(double diem) {
		this.diem = diem;
	}
//	@Override
//	public int compare(Student stu1, Student stu2) {
//		if(stu1 == null || stu2 == null)
//			return -1;
//		
//		
////		if(stu1.id < stu2.id) {
////			return -1;
////		}else if(stu1.id > stu2.id) {
////			return 1;
////		}
//		
//		stu1.compareTo(stu2);
//		
//		if(stu1.ngaySinh.isBefore(stu2.ngaySinh)) {
//			return -1;
//		}else if(stu1.ngaySinh.isAfter(stu2.ngaySinh)) {
//			return 1;
//		}
//		
//		if(stu1.diem < stu2.diem) {
//			return -1;
//		}else if(stu1.diem > stu2.diem) {
//			return 1;
//		}
//		
//		return 0;
//	}
}
