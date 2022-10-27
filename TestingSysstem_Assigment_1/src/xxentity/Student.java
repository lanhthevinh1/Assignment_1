package xxentity;

import java.time.LocalDate;
import java.util.Date;
//Tạo Object Student có các property id, name, hometown, điểm học lực
//a) Tất cả các property sẽ để là private để các class khác không
//chỉnh sửa hay nhìn thấy
public class Student {
	private int id = -1;
	private String name;
	private String homeTown;
	private double diemHocLuc;
	public Student(String name, String homeTown) {
		this.id++;
		this.name = name;
		this.homeTown = homeTown;
		this.diemHocLuc = 0;
	}
	public String getHocLuc() {
		String hocLuc;
		if(diemHocLuc< 4.0) {
			hocLuc = "Yếu";
		}else if(diemHocLuc < 6.0) {
			hocLuc = "trung bình";
		}else if(diemHocLuc < 8.0) {
			hocLuc = "khá";
		}else hocLuc = "giỏi";
		return name + " " + diemHocLuc + " " + hocLuc;
	}
//	c) Tạo 1 method cho phép set điểm vào
	public void setDiemHocLuc(double diemHocLuc) {
		this.diemHocLuc = diemHocLuc;
	}
	
//	d) Tạo 1 method cho phép cộng thêm điểm
	public void congDiem(double diemCong) {
		if(diemHocLuc + diemCong > 10) {
			System.out.println("Điểm cộng không hợp lệ!");
		}else {
			this.diemHocLuc += diemCong;
		}
	}
	
	
	
}