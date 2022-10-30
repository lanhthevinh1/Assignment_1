package com.vti.entity;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Person implements IPerson{
	private String name;
	private gioiTinh gioiTinh;
	private LocalDate ngaySinh;
	private String diaChi;
	
	public Person() {
	}

	public Person(String name, com.vti.entity.gioiTinh gioiTinh, LocalDate ngaySinh, String diaChi) {
		this.name = name;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public gioiTinh getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(gioiTinh gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public LocalDate getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	@Override
	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên: ");
		name = sc.nextLine();
		System.out.println("Nhập giới tính: (0: Nam,1: Nữ,2: Unknown)");
		int check = Integer.parseInt(sc.nextLine());
		if(check == 0) {
			gioiTinh = gioiTinh.Nam;
		}else if(check == 1) {
			gioiTinh = gioiTinh.Nu;
		}else gioiTinh = gioiTinh.Unknown;
		System.out.println("Nhập ngày sinh: (dd-MM-yyyy)");
		String ngaySinhString = sc.nextLine();
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		ngaySinh = LocalDate.parse(ngaySinhString, dateFormat);
		System.out.println("Nhập địa chỉ: ");
		diaChi = sc.nextLine();
	}
	@Override
	public void showInfo() {
		System.out.println("Tên: " + name);
		System.out.println("Giới tính: " + gioiTinh);
		
		Date input = Date.from(ngaySinh.atStartOfDay(ZoneId.systemDefault()).toInstant());
		Locale locale = new Locale("vi","VN");
		DateFormat dateformat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
		String date = dateformat.format(input);
		System.out.println("Ngày Sinh: " + date);
		
		System.out.println("Địa chỉ: "+ diaChi);
	}
	
}
