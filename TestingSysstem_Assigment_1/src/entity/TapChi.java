package entity;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class TapChi extends TaiLieu{
	private int soPhatHanh;
	private int thangPhatHanh;
	public TapChi() {}
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so phat hanh: ");
		soPhatHanh = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap thang phat hanh: (MM-yyyy)");
		thangPhatHanh = Integer.parseInt(sc.nextLine());
	}
	public void show() {
		super.show();
		System.out.println("So phat hanh: "+ soPhatHanh);
		System.out.println("Tháng phát hành: "+ thangPhatHanh);
	}
	
}
