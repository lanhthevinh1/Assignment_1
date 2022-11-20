package com.vti.entity;

import java.util.List;

public class Student<T> implements Comparable<Student> {
	private int id;
	private static int count = -1;
	private String name;
	public Student() {
		this.id =++count;
	}
	public Student( String name) {
		this.id =++count;
		this.name = name;
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
		return "Student " + id + "\n name=" + name;
	}
	@Override
	public int compareTo(Student other) {
		if(other == null)
		return -1;
		
		if(id < other.id) {
			return -1;
		}else if(id > other.id) {
			return 1;
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
	
	public boolean cacStudentTrungTen(Student other) {
		if(this.id != other.id || this.name.equalsIgnoreCase(other.name)) {
//			System.out.println("Student "+ id + " and "+ other.id +" trùng tên");
//			System.out.println("Cùng là: " + name);
			return true;
		}
		return false;
	}
}
