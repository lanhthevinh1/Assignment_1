package com.vti.entity;

import java.util.Scanner;

public class Phone implements IPhone{
	private String soDT;
	
	public Phone() {}
	public Phone(String soDT) {
		this.soDT = soDT;
	}
	public String ngheDT() {
		return soDT;
	}
	public void goiDT(String soDT) {
		System.out.println("Đang gọi: " + soDT +" từ số: "+this.soDT);
		
	}
	public void nhanTN(String[] arraySoDTAndTN){
		
		System.out.println("Đã nhận đc tn này: "+arraySoDTAndTN[1]);
		System.out.println("Từ số này: "+ arraySoDTAndTN[0]);
	}
	public String[] guiTN(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Nội dung tn: " );
		String noiDungTN = sc.nextLine();
		
		String[] arrayStr = {soDT,noiDungTN};
		return arrayStr;
	}
	
	
	
}
