package com.vti.entity;

public class Student {
	private int id = -1;
	private String name;
	
	public Student(String name) {
		this.id ++;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student " + id + ":\n name= " + name ;
	}
	
	@Deprecated
	public int getId() {
		return id;
	}
	
	public String newGetId() {
		return "MSV: " + id;
	}
}
