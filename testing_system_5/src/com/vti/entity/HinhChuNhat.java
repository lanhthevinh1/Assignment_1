package com.vti.entity;

public abstract class HinhChuNhat implements IHinhChuNhat {
	
	@Override
	public float tinhChuVi(float a, float b) {
		
		return (a + b)*2;
	}
	@Override
	public float tinhDienTich(float a, float b) {
		return a + b;
	}
	
}
