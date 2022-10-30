package com.vti.entity;

import java.util.Scanner;

public class ThiSinh {
	private String soBaoDanh;
	private String hoTen;
	private String diaChi;
	private int mucUuTien;
	public ThiSinh() {
	}
	public String getSoBaoDanh() {
		return soBaoDanh;
	}
	public void setSoBaoDanh(String soBaoDanh) {
		this.soBaoDanh = soBaoDanh;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public int getMucUuTien() {
		return mucUuTien;
	}
	public void setMucUuTien(int mucUuTien) {
		this.mucUuTien = mucUuTien;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số báo danh: ");
		this.soBaoDanh = sc.nextLine();
		System.out.println("Nhập họ và tên: ");
		this.hoTen = sc.nextLine();
		System.out.println("Nhập địa chỉ: ");
		this.diaChi = sc.nextLine();
		System.out.println("Nhập mức độ ưu tiên: ");
		this.mucUuTien = Integer.parseInt(sc.nextLine());
		
	}
	public void show() {
		System.out.println("Thông tin thí sinh: ");
		System.out.println("Số Báo Danh: "+soBaoDanh);
		System.out.println("Họ và tên: "+hoTen);
		System.out.println("Địa chỉ: "+diaChi);
		System.out.println("Độ ưu tiên: "+mucUuTien);
		
	}
}
