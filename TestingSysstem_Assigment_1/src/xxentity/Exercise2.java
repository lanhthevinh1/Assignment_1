package xxentity;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Exercise2 {
	


	
	public static void main(String[] args) {
		
//		Question 1:
//		Khai báo 1 số nguyên = 5 và sử dụng lệnh System out printf để in ra số
//		nguyên đó
		int xQuestion1 = 5;
		System.out.printf("%s \n",xQuestion1);
		
//		Question 2:
//			Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out printf để in
		int xQuestion2 = 1000000000;
		System.out.printf("%,d \n",xQuestion2);
		
//		Question 3:
//			Khai báo 1 số thực = 5,567098 và sử dụng lệnh System out printf để in ra số
//			thực đó chỉ bao gồm 4 số đằng sau
		
		double xQuestion3 = 5.567098;
		System.out.printf("%.4f \n",xQuestion3);
		
//		Question 4:
//			Khai báo Họ và tên của 1 học sinh và in ra họ và tên học sinh đó theo định
//			dạng như sau:
//			Họ và tên: "Nguyễn Văn A" thì sẽ in ra trên console như sau:
//			Tên tôi là "Nguyễn Văn A" và tôi đang độc thân.
		
		String ho = "Trần Đức";
		String ten = "Nam";
		
		System.out.printf("Tên tôi là \"%s %s\" và tôi đang độc thân.\n",ho,ten);
		
//		Question 5:
//		Lấy thời gian bây giờ và in ra theo định dạng sau:
//			24/04/2020 11h:16p:20s	
		
		String pattern = "dd-MM-yyyy HH:mm:ss";
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern); 
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dateTimeFormatter.format(now));
		
		
//		Question 6:
//			In ra thông tin account (như Question 8 phần FOREACH) theo định dạng
//			table (giống trong Database)
//			Chuyển sang Excercise1
				
	}
}
