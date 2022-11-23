package com.vti.entity;

import java.time.LocalDate;

public class Student2<T> {
	private T id;
	private String name;
	private LocalDate ngaySinh;
	private double diem;
	public Student2(T id, String name) {
		this.id = id;
		this.name = name;
	}
	public T getId() {
		return id;
	}
	public void setId(T id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
