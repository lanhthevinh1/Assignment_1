package com.vti.backend;

import java.util.Scanner;

import com.vti.entity.TuyenSinh;

public class Ex1 {
	public static void main(String[] args) {
		Question2();
	}
	public static void Question2() {
		Scanner sc = new Scanner(System.in);
		TuyenSinh tuyenSinh = new TuyenSinh();
		int key = -1;
		while(true) {
			System.out.println("Tuyển Sinh");
			System.out.println("1. Thêm thí sinh mới.");
			System.out.println("2. Hiển thị thông tin và khối thi.");
			System.out.println("3. Tìm kiếm theo số báo danh.");
			System.out.println("4. Thoát khỏi chương trình.");
			key = Integer.parseInt(sc.nextLine());
			switch (key) {
			case 1:
				System.out.println("Nhập số thí sinh muốn thêm:");
				tuyenSinh.ThemThiSinh(Integer.parseInt(sc.nextLine()));
				break;
			case 2:
				tuyenSinh.HienThiThongTin();
				break;
			case 3:
				System.out.println("Nhập số báo danh của thí sinh muốn tìm kiếm: ");
				tuyenSinh.TimKiemThiSinh(sc.nextLine());
			default:
				System.out.println("OUT!");
				return;
			}
		}
	}
}
