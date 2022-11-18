package com.vti.entity;

public final class SecondaryStudent extends Student{
	private static int secondaryCount = 0;
	
	public SecondaryStudent(int id, String name) {
		super(id, name);
		secondaryCount++;
	}
	public int getSecondaryCount() {
		return secondaryCount;
	}
	
}
