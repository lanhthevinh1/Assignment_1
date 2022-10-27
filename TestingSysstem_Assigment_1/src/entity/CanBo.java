package entity;

import java.util.Scanner;

public class CanBo {
	private String hoTen;
	private int tuoi;
	private Gender gioiTinh;
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public Gender getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(int gioiTinh) {
		
		if(gioiTinh == 0) {
			this.gioiTinh = Gender.MALE;
		}else if(gioiTinh == 1) {
			this.gioiTinh = Gender.FEMALE;
		}else this.gioiTinh= Gender.UNKNOWN;
		
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập họ tên: ");
		this.hoTen = sc.nextLine();
		
		System.out.println("Nhập tuổi: ");
		this.tuoi = Integer.parseInt(sc.nextLine());
		
		System.out.println("Nhập họ giới tính (0:nam , 1:nữ, 2:Unknown): ");
		this.setGioiTinh(sc.nextInt());
		
	}
	public void show() {
		System.out.println("Họ tên: " + hoTen);
		System.out.println("Tuổi: " + tuoi);
		System.out.println("Giới tính: "+ gioiTinh);
	}
	@Override
	public String toString() {
		return hoTen + " "+ tuoi + " " + gioiTinh; 
	}
	
}
