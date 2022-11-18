package com.vti.entity;

import java.io.Serializable;

public class Student2 implements Serializable{
	private int id;
	private String name;
	
	public Student2() {
	}

	public Student2(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student "+ id+":\n\tid = " + id + "\n\tname =  " + name;
	}
	
	
}
