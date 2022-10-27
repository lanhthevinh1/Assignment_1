package entity;

import java.util.Scanner;

public class kySu extends CanBo{
	private String nganhDaoTao;

	public kySu(String nganhDaoTao) {
		super();
		this.nganhDaoTao = nganhDaoTao;
	}

	public kySu() {
		// TODO Auto-generated constructor stub
	}

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}

	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập ngành đào tạo:");
		nganhDaoTao = sc.next();
	}
	public void show() {
		super.show();
		System.out.println("Ngành đào tạo: " + nganhDaoTao);
	}
	@Override
	public String toString() {
		return super.toString() +" "+ nganhDaoTao;
	}
	
	
}
