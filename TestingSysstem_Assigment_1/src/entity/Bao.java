package entity;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Bao extends TaiLieu{
	private LocalDate ngayPhatHanh;
	public Bao() {}
	
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ngay phat hanh: (dd-MM-yyyy)");
		String ngayPhatHanhString = sc.nextLine();
	    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	    ngayPhatHanh = LocalDate.parse(ngayPhatHanhString,dateFormat);
	}
	public void show() {
		super.show();
		Date input = Date.from(ngayPhatHanh.atStartOfDay(ZoneId.systemDefault()).toInstant());
        Locale locale = new Locale("vi","VN");
        DateFormat dateformat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
        String date = dateformat.format(input);
        System.out.println("Ngay phat hanh: " + date);
	}

}
