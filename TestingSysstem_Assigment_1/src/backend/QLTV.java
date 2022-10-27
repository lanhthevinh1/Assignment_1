package backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.Bao;
import entity.CanBo;
import entity.CongNhan;
import entity.NhanVien;
import entity.Sach;
import entity.TaiLieu;
import entity.TapChi;
import entity.kySu;

public class QLTV {
	List<TaiLieu> listTaiLieu = new ArrayList<TaiLieu>();
	List<TaiLieu> listSach = new ArrayList<TaiLieu>();
	List<TaiLieu> listTapChi = new ArrayList<TaiLieu>();
	List<TaiLieu> listBao = new ArrayList<TaiLieu>();
	
	
	
	public void addTaiLieu(int n) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<n;i++) {
			TaiLieu taiLieu = null ;	
			System.out.println("Nhập loại tài liệu muốn thêm: (0: Sách, 1: Tạp chí,2: Báo)");
			int key = Integer.parseInt(sc.nextLine());
			switch (key) {
			case 0:
				taiLieu = new Sach();
				taiLieu.input();
				listSach.add(taiLieu);
				break;
			case 1:
				taiLieu = new TapChi();
				taiLieu.input();
				listTapChi.add(taiLieu);
				break;
			case 2:
				taiLieu = new Bao();
				taiLieu.input();
				listBao.add(taiLieu);
				break;
	
			default:
				System.out.println("OUT!");
				return;
			}
			listTaiLieu.add(taiLieu);
		}
	}
	public void xoaTaiLieu(int maTaiLieu) {
		for(TaiLieu taiLieu:listTaiLieu) {
			if(taiLieu.getMaTaiLieu() == (maTaiLieu)) {
				listTaiLieu.remove(taiLieu);
				return;
			}
		}
		System.out.println("cán bộ này không có trong danh sách");
	}
	public void hienThiDanhSach() {
		for(TaiLieu taiLieu:listTaiLieu) {
			taiLieu.show();
		}
	}
	public void timKieuTaiLieu(int maTaiLieu) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Loai tai lieu muon tim kiem: (0: Sách, 1: Tạp chí,2: Báo,3: dừng tìm kiếm)");
		int key = Integer.parseInt(sc.nextLine());
		
		switch (key) {
		case 0:
			for(TaiLieu taiLieu:listSach) {
				if(maTaiLieu == taiLieu.getMaTaiLieu()) {
					taiLieu.show();
					return;
				}
			}
			System.out.println("Khong tim thay!");
			break;
		case 1:
			for(TaiLieu taiLieu:listTapChi) {
				if(maTaiLieu == taiLieu.getMaTaiLieu()) {
					taiLieu.show();
					return;
				}
			}
			System.out.println("Khong tim thay!");
			break;
		case 2:
			for(TaiLieu taiLieu:listBao) {
				if(maTaiLieu == taiLieu.getMaTaiLieu()) {
					taiLieu.show();
					return;
				}
			}
			System.out.println("Khong tim thay!");
			break;
				
		default:
			System.out.println("Dừng tìm kiếm!");
			return;
			
		}
	}
	
}
