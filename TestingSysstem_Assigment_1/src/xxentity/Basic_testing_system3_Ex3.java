package xxentity;

public class Basic_testing_system3_Ex3 {
	public static void main(String[] args) {
//		Exercise 3(Optional): Boxing & Unboxing
//		Question 1:
//			Khởi tạo lương có datatype là Integer có giá trị bằng 5000.
//			Sau đó convert lương ra float và hiển thị lương lên màn hình (với số
//			float có 2 số sau dấu thập phân)
		
		Integer luong = new Integer(5000);
		float luongFloat = luong;
		System.out.printf("%.2f \n",luongFloat);
		
//		Question 2:
//			Khai báo 1 String có value = "1234567"
//			Hãy convert String đó ra số int
		String xQuestion2 = "1234567";
		Integer xxQuestion2 = Integer.valueOf(xQuestion2);
		int xxxQuestion2 = xxQuestion2; //Question 3
		System.out.println(xxxQuestion2); 
		
		
//		Question 3:
//			Khởi tạo 1 số Integer có value là chữ "1234567"
//			Sau đó convert số trên thành datatype int
		
	}

}
