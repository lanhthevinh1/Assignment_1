package entity;

import java.util.Scanner;

public abstract class TaiLieu {
	private int maTaiLieu;
	private String tenNhaXuatBan;
	private int soBanPhatHanh;
	public TaiLieu() {}
	public int getMaTaiLieu() {
		return maTaiLieu;
	}
	public void setMaTaiLieu(int maTaiLieu) {
		this.maTaiLieu = maTaiLieu;
	}
	public String getTenNhaXuatBan() {
		return tenNhaXuatBan;
	}
	public void setTenNhaXuatBan(String tenNhaXuatBan) {
		this.tenNhaXuatBan = tenNhaXuatBan;
	}
	public int getSoBanPhatHanh() {
		return soBanPhatHanh;
	}
	public void setSoBanPhatHanh(int soBanPhatHanh) {
		this.soBanPhatHanh = soBanPhatHanh;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma tai lieu!");
		maTaiLieu = Integer.parseInt(sc.nextLine());
		
		System.out.println("Nhap ten nha xuat ban");
		tenNhaXuatBan = sc.nextLine();
		
		System.out.println("Nhap so ban phat hanh");
		soBanPhatHanh = Integer.parseInt(sc.nextLine());
		
	}
	public void show() {
		System.out.println(maTaiLieu + "\n"+ tenNhaXuatBan+"\n"+soBanPhatHanh);
		
	}
	
}
