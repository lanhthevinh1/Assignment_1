package com.vti.entity;

public class HinhChuNhat extends HinhHoc implements IHinhHoc {
	private float a;
	private float b;
	
	public HinhChuNhat() throws HinhHocException {
		super();
		
	}
	
	public HinhChuNhat(float a,float b) throws HinhHocException {
		super();
		this.a = a;
		this.b = b;
	}
	@Override
	public float tinhDienTich() {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public float tinhChuVi() {
		// TODO Auto-generated method stub
		return (a+b)*2;
	}

}
