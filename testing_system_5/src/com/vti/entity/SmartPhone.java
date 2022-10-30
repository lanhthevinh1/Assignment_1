package com.vti.entity;

public class SmartPhone extends Phone{
	
	public SmartPhone(String soDT) {
		super(soDT);
	}
	public String ngheDT() {
		return super.ngheDT();
	}
	public void goiDT(String soDT) {
		super.goiDT(soDT);
	}
	public void nhanTN(String[] arraySoDTAndTN){
		super.nhanTN(arraySoDTAndTN);
	}
	public String[] guiTN(){
		return super.guiTN();
	}
	public void suDung3G() {
		System.out.println("Bật chế độ sử dụng 3G");
	}
	public void chupHinh() {
		System.out.println("Đang ở chế độ chụp hình");
	}
}
