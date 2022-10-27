package entity;

import java.util.Scanner;

public class NhanVien extends CanBo{
	private String congViec;

	public NhanVien() {
		super();
	}

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập công việc:");
		congViec = sc.nextLine();
	}
	public void show() {
		super.show();
		System.out.println(congViec+ "\n");
		
	}
	@Override
	public String toString() {
		return "NhanVien [congViec=" + congViec + ", toString()=" + super.toString() + "]";
	}
	
}
