package com.vti.entity;

public class HinhChuNhat {
	private float chieuDai;
	private float chieuRong;
	
	public float tinhChuVi() {
		
		return (chieuDai + chieuRong)*2;
	}
	public float tinhDienTich() {
		return chieuDai*chieuRong;
	}
	
}
