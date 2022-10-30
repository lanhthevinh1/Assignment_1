package com.vti.entity;

import java.util.Scanner;

public class OldPhone extends Phone{
	private float tanSoRadio;
	
	public OldPhone(String soDT) {
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
	public void ngheRadio() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tần số radio muốn nghe: ");
		this.tanSoRadio = Float.parseFloat(sc.nextLine());
		sc.close();
	}
	
}
