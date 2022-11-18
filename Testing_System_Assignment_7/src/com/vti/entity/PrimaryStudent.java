package com.vti.entity;

public final class PrimaryStudent extends Student{

	private static int primaryCount = 0;
	
	public PrimaryStudent(int id, String name) {
		super(id, name);
		primaryCount++;
		// TODO Auto-generated constructor stub
	}
	
	public int getPrimaryStudentCount() {
		return primaryCount;
	}
}
