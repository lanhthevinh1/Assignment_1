package com.vti.entity;

public class HinhTron extends HinhHoc implements IHinhHoc{
	private float banKinh;
	
	public HinhTron() throws HinhHocException {
		super();
		
	}
	public HinhTron(float banKinh) throws HinhHocException {
		super();
		this.banKinh = banKinh;
	}
	@Override
	public float tinhDienTich() {
		return banKinh*MyMath.getPI()*banKinh;
	}
	@Override
	public float tinhChuVi() {
		return banKinh*MyMath.getPI();
	}
}
