package entity;

import java.util.Scanner;

public class CongNhan extends CanBo{
	private int bac;

	public CongNhan(int bac) {
		super();
		this.bac = bac;
	}



	public CongNhan() {
		// TODO Auto-generated constructor stub
	}

	public int getBac() {
		return bac;
	}

	public void setBac(int bac) {
		this.bac = bac;
	}
	
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập bậc:");
		this.bac = Integer.parseInt(sc.nextLine());
	}
	public void show() {
		super.show();
		System.out.println(bac +"\n");
	}
	@Override
	public String toString() {
		return "CongNhan [bac=" + bac + ", toString()=" + super.toString() + "]";
	}

	
	
	
}
