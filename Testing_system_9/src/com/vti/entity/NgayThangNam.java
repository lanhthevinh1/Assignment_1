package com.vti.entity;

public class NgayThangNam {
	public int ngay, thang, nam;
	
	public class GioPhutGIay{
		public int gio, phut, giay;
		
		public void xuatThongTin() {
			System.out.println("Ngày: "+ ngay + "/"+ thang + "/"+ nam);
			System.out.println("Giờ: " + gio + ":" + phut + ":" +giay);
		}
	}
}
