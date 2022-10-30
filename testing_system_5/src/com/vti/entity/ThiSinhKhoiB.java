package com.vti.entity;

import java.util.Scanner;

public class ThiSinhKhoiB extends ThiSinh{
	private float toan;
	private float hoa;
	private float sinh;
	public ThiSinhKhoiB() {
	}
	public float getToan() {
		return toan;
	}
	public void setToan(float toan) {
		this.toan = toan;
	}
	public float getHoa() {
		return hoa;
	}
	public void setHoa(float hoa) {
		this.hoa = hoa;
	}
	public float getSinh() {
		return sinh;
	}
	public void setSinh(float sinh) {
		this.sinh = sinh;
	}
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập điểm môn Toán: ");
		toan = Float.parseFloat(sc.nextLine());
		System.out.println("Nhập điểm môn Sinh: ");
		sinh = Float.parseFloat(sc.nextLine());
		System.out.println("Nhập điểm môn Hóa: ");
		hoa = Float.parseFloat(sc.nextLine());
		
	}
	public void show() {
		super.show();
		System.out.println("Điểm môn Toán: "+ toan);
		System.out.println("Điểm môn Sinh: "+ sinh);
		System.out.println("Điểm môn Hóa: "+ hoa);
	}
}
