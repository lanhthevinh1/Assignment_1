package backend;

import java.util.Scanner;

import entity.HighSchoolStudent;

public class Ex5 {
	public static void main(String[] args) {
		
		Question4();
//		Question2();
//		Question3();
	}
	public static void Question4() {
		Scanner sc = new Scanner(System.in);
		int key = -1;
		QLTV qltv = new QLTV();
		while(true) {
			System.out.println("0. Thêm mới tài liêu: Sách, tạp chí, báo.");
			System.out.println("1. Xoá tài liệu theo mã tài liệu");
			System.out.println("2. Hiện thị thông tin về tài liệu.");
			System.out.println("3. Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo.");
			System.out.println("4. Thoát khỏi chương trình.");
			key = Integer.parseInt(sc.nextLine());
			switch (key) {
			case 0:
				System.out.println("Số tài liệu muốn thêm: ");
				int n = Integer.parseInt(sc.nextLine());
				qltv.addTaiLieu(n);
				break;
			case 1:
				System.out.println("Mã tài liệu muốn xóa: ");
				int maTaiLieu = Integer.parseInt(sc.nextLine());
				qltv.xoaTaiLieu(maTaiLieu);
				break;
			case 2:
				qltv.hienThiDanhSach();
				break;
			case 3:
				System.out.println("Mã tài liệu muốn tìm: ");
				maTaiLieu = Integer.parseInt(sc.nextLine());
				qltv.timKieuTaiLieu(maTaiLieu);
				break;
			default:
				System.out.println("OUT!");
				return;
			}
		}
	}
	public static void Question3() {
		HighSchoolStudent student1 = new HighSchoolStudent(1, "Nam", "Chuyên văn", "Đại học công nghệ");
		System.out.println(student1.toString());
	}
	public static void Question2() {
		Scanner sc = new Scanner(System.in);
		int key = -1;
		QLCB qlcb = new QLCB();
		while(true) {
			System.out.println("0:Thêm cán bộ mới");
			System.out.println("1:Tìm kiếm theo họ tên");
			System.out.println("2:Hiện thị thông tin về danh sách các cán bộ.");
			System.out.println("3:Nhập vào tên của cán bộ và delete cán bộ đó");
			System.out.println("4:Thoát khỏi chương trình");
			key = Integer.parseInt(sc.nextLine());
			switch (key) {
			case 0:
				System.out.println("Số cán bộ muốn nhập vào:");
				int n = Integer.parseInt(sc.nextLine());
				qlcb.addCanBo(n);
				break;
			case 1:
				System.out.println("Nhập tên cán bộ muốn tìm: ");
				String findName = sc.nextLine();
				qlcb.timKiemCanBo(findName);
				break;
			case 2:
				qlcb.thongTinDanhSach();
				break;
			case 3:
				System.out.println("Nhập tên cán bộ muốn xóa:");
				String name = sc.nextLine();
				qlcb.xoaCanBo(name);
				break;

			default:
				System.out.println("OUT");
				return;
			}
		}
	}
}
