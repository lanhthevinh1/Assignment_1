package com.vti.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TuyenSinh implements ITuyenSinh{
	List<ThiSinh> listThiSinh = new ArrayList<ThiSinh>();

	public void ThemThiSinh(int n) {
		Scanner sc = new Scanner(System.in);
		int key = -1;
		for(int i = 0;i<n;i++) {
			ThiSinh thiSinh = new ThiSinh();
			System.out.println("Chọn Khối thi muốn nhập: ");
			System.out.println("1. Khối A");
			System.out.println("2. Khối B");
			System.out.println("3. Khối C");
			key = Integer.parseInt(sc.nextLine());
			switch (key) {
			case 1:
				thiSinh = new ThiSinhKhoiA();
				thiSinh.input();
				break;
			case 2:
				thiSinh = new ThiSinhKhoiB();
				thiSinh.input();
				break;
			case 3:
				thiSinh = new ThiSinhKhoiC();
				thiSinh.input();
				break;
			
			default:
				break;
			}
			listThiSinh.add(thiSinh);
		}
	}

	@Override
	public void HienThiThongTin() {
		for(ThiSinh thiSinh:listThiSinh) {
			thiSinh.show();
		}
		
	}

	@Override
	public void TimKiemThiSinh(String soBaoDanh) {
		for(ThiSinh thiSinh:listThiSinh) {
			if(soBaoDanh.equals(thiSinh.getSoBaoDanh())) {
				thiSinh.show();
				return ;
			}
		}
		System.out.println("Không tìm thấy thí sinh này");
	}

	
}
