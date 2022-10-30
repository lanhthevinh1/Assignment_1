package com.vti.entity;

import java.util.Scanner;

public class ThiSinhKhoiC extends ThiSinh{
	private float van;
	private float su;
	private float dia;
	public ThiSinhKhoiC() {
	}
	public float getVan() {
		return van;
	}
	public void setVan(float van) {
		this.van = van;
	}
	public float getSu() {
		return su;
	}
	public void setSu(float su) {
		this.su = su;
	}
	public float getDia() {
		return dia;
	}
	public void setDia(float dia) {
		this.dia = dia;
	}
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập điểm môn Văn: ");
		van = Float.parseFloat(sc.nextLine());
		System.out.println("Nhập điểm môn Sử: ");
		su = Float.parseFloat(sc.nextLine());
		System.out.println("Nhập điểm môn Địa: ");
		dia = Float.parseFloat(sc.nextLine());
		
	}
}
