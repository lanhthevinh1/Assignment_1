package backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.CanBo;
import entity.CongNhan;
import entity.Gender;
import entity.NhanVien;
import entity.kySu;

public class QLCB {
	
	List<CanBo> listCanBo = new ArrayList<CanBo>();
	public void addCanBo(int n) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<n;i++) {
			CanBo canBo = new CanBo();		
			System.out.println("Nhập loại cán bộ muốn thêm: (0: Nhân viên, 1: Kỹ sư,2: Công nhân)");
			int key = Integer.parseInt(sc.nextLine());
			switch (key) {
			case 0:
				canBo = new NhanVien();
				canBo.input();
				break;
			case 1:
				canBo = new kySu();
				canBo.input();
				break;
			case 2:
				canBo = new CongNhan();
				canBo.input();
				break;
	
			default:
				System.out.println("OUT!");
				return;
			}
			listCanBo.add(canBo);
		}
	}
	public void timKiemCanBo(String findName) {
		for(CanBo canbo:listCanBo) {
			if(canbo.getHoTen().equals(findName)) {
				canbo.show();
				return;
			}
		}
		System.out.println("Không tìm thấy cán bộ này");
	}
	public void thongTinDanhSach() {
		for(CanBo canbo:listCanBo) {
			canbo.show();
		}
	}
	public void xoaCanBo(String name) {
		for(CanBo canBo:listCanBo) {
			if(canBo.getHoTen().equals(name)) {
				listCanBo.remove(canBo);
				return;
			}
		}
		System.out.println("cán bộ này không có trong danh sách");
	}
}
