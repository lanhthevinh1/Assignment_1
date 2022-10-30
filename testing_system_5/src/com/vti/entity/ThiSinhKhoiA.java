package com.vti.entity;

import java.util.Scanner;

public class ThiSinhKhoiA extends ThiSinh{

	private float toan;
	private float ly;
	private float hoa;
	
	public ThiSinhKhoiA() {
	}

	public float getToan() {
		return toan;
	}

	public void setToan(float toan) {
		this.toan = toan;
	}

	public float getLy() {
		return ly;
	}

	public void setLy(float ly) {
		this.ly = ly;
	}

	public float getHoa() {
		return hoa;
	}

	public void setHoa(float hoa) {
		this.hoa = hoa;
	}

	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập điểm môn Toán: ");
		toan = Float.parseFloat(sc.nextLine());
		System.out.println("Nhập điểm môn Lý: ");
		ly = Float.parseFloat(sc.nextLine());
		System.out.println("Nhập điểm môn Hóa: ");
		hoa = Float.parseFloat(sc.nextLine());
		
	}

	public void show() {
		super.show();
		System.out.println("Điểm môn Toán: "+ toan);
		System.out.println("Điểm môn Lý: "+ ly);
		System.out.println("Điểm môn Hóa: "+ hoa);
	}
	
}
