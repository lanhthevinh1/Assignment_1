package com.vti.entity;

public class MyMath {
	private static final float PI = (float) 3.14;	
	
	public float sum(int a) {
		return a+PI;
	}
	public static int max(int a,int b) {
		return a>b ? a:b;
	}
	
	public static int min(int a,int b) {
		return a<b ? a:b;
	}
	public static int sum(int a,int b) {
		return a+b;
	}
	public static float getPI() {
		return PI;
	}
}
