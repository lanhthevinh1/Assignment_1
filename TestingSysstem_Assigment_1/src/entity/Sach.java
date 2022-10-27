package entity;

import java.util.Scanner;

public class Sach extends TaiLieu{
	private String tenTacGia;
	private int soTrang;
	public Sach() {}
	
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten tac gia: ");
		tenTacGia = sc.nextLine();
		System.out.println("Nhap so trang: ");
		soTrang = Integer.parseInt(sc.nextLine());
	}
	
	public void show() {
		super.show();
		System.out.println("Ten Tac Gia: " + tenTacGia);
		System.out.println("So Trang: " + soTrang);
	}

}
