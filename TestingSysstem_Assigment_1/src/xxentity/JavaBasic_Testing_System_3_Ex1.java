package xxentity;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class JavaBasic_Testing_System_3_Ex1 {
	public static void main(String[] args) {
		Department department1 = new Department();
		department1.departmentID = 1;
		department1.departmentName = "Sale";

		Department department2 = new Department();
		department2.departmentID = 2;
		department2.departmentName = "Marketing";

		Department department3 = new Department();
		department3.departmentID = 3;
		department3.departmentName = "IT";

//		System.out.println("Department: " + department1.departmentID + "\n" + department1.departmentName);
//		
		Position position1 = new Position();
		position1.positionID = 1;
		position1.positionName = "Dev";

		Position position2 = new Position();
		position2.positionID = 2;
		position2.positionName = "Test";

		Position position3 = new Position();
		position3.positionID = 3;
		position3.positionName = "PM";

//		System.out.println("Position: " + position1.positionID + "\n" + position2.positionName);
//		
		Account account1 = new Account();
		account1.accountID = 1;
		account1.email = "Lanhthevinh1@gmail.com";
		account1.userName = "thevinh";
		account1.fullName = "Lành Thế Vinh";
		account1.departmentID = department1;
		account1.positionID = position1;
		account1.createDate = LocalDate.of(2020, 01, 3);
		account1.luong = (float) 5240.5;

		Account account2 = new Account();
		account2.accountID = 1;
		account2.email = "mguyenvanchien@gmail.com";
		account2.userName = "nguyenchien";
		account2.fullName = "Nguyễn Văn Chiến";
		account2.departmentID = department2;
		account2.positionID = position2;
		account2.luong = (float) 10970.055;

		Account account3 = new Account();
		account3.accountID = 1;
		account3.email = "caosondinh@gmail.com";
		account3.userName = "sondinh";
		account3.fullName = "Cao Sơn Đỉnh";
		account3.departmentID = department3;
		account3.positionID = position3;

//		System.out.println("Account: " + account1.accountID +
//		account1.email + "\n" +
//		account1.userName + "\n" +
//		account1.fullName + "\n" +
//		account1.departmentID + "\n" +
//		account1.positionID );
//		

		Group group1 = new Group();
		group1.groupID = 1;
		group1.groupName = "Java";

		Group group2 = new Group();
		group2.groupID = 2;
		group2.groupName = "python";

		Group group3 = new Group();
		group3.groupID = 3;
		group3.groupName = "C#";

		GroupAccount groupAccount1 = new GroupAccount();
		groupAccount1.groupID = group1;
		groupAccount1.accountID = account1;

		GroupAccount groupAccount2 = new GroupAccount();
		groupAccount2.groupID = group2;
		groupAccount2.accountID = account2;

		GroupAccount groupAccount3 = new GroupAccount();
		groupAccount3.groupID = group3;
		groupAccount3.accountID = account3;

		TypeQuestion typeQuestion1 = new TypeQuestion();
		typeQuestion1.typeID = 1;
		typeQuestion1.typeName = "Essay";

		TypeQuestion typeQuestion2 = new TypeQuestion();
		typeQuestion2.typeID = 2;
		typeQuestion2.typeName = "Multiple-Choice";

		CategoryQuestion categoryQuestion1 = new CategoryQuestion();
		categoryQuestion1.categoryID = 1;
		categoryQuestion1.categoryName = "Java";

		CategoryQuestion categoryQuestion2 = new CategoryQuestion();
		categoryQuestion2.categoryID = 2;
		categoryQuestion2.categoryName = "NET";

		CategoryQuestion categoryQuestion3 = new CategoryQuestion();
		categoryQuestion3.categoryID = 3;
		categoryQuestion3.categoryName = "SQL";

		Question question1 = new Question();
		question1.questionId = 1;
		question1.content = "Java là gì";
		question1.categoryID = categoryQuestion1;
		question1.typeID = typeQuestion1;
		question1.creatorID = account1;

		Question question2 = new Question();
		question2.questionId = 2;
		question2.content = "NET là gì?";
		question2.categoryID = categoryQuestion2;
		question2.typeID = typeQuestion2;
		question2.creatorID = account2;

		Question question3 = new Question();
		question3.questionId = 3;
		question3.content = "C++ là gì?";
		question3.categoryID = categoryQuestion3;
		question3.typeID = typeQuestion2;
		question3.creatorID = account3;

		Answer answer1 = new Answer();
		answer1.answerID = 1;
		answer1.Content = "Java là 1 ngôn ngữ hướng đối tượng?";
		answer1.questionID = question1;
		answer1.isCorrect = true;

		Answer answer2 = new Answer();
		answer2.answerID = 1;
		answer2.Content = "NET là Ngôn ngứ lập trình cho các chương trình trên windows";
		answer2.questionID = question2;
		answer2.isCorrect = true;

		Answer answer3 = new Answer();
		answer3.answerID = 1;
		answer3.Content = "C++ là ngôn ngữ được nâng cấp từ ngôn ngữ của C";
		answer3.questionID = question3;
		answer3.isCorrect = true;

		Exam exam1 = new Exam();
		exam1.examID = 1;
		exam1.code = 001;
		exam1.title = "tìm hiểu về Java!";
		exam1.categoryID = categoryQuestion1;
		exam1.duration = 30;
		exam1.creatorID = account1;

		Exam exam2 = new Exam();
		exam2.examID = 2;
		exam2.code = 002;
		exam2.title = "tìm hiểu về NET!";
		exam2.categoryID = categoryQuestion2;
		exam2.duration = 60;
		exam2.creatorID = account2;

		Exam exam3 = new Exam();
		exam3.examID = 3;
		exam3.code = 003;
		exam3.title = "tìm hiểu về C++!";
		exam3.categoryID = categoryQuestion3;
		exam3.duration = 40;
		exam3.creatorID = account3;

		ExamQuestion examQuestion1 = new ExamQuestion();
		examQuestion1.examID = exam1;
		examQuestion1.questionID = question1;

		ExamQuestion examQuestion2 = new ExamQuestion();
		examQuestion2.examID = exam1;
		examQuestion2.questionID = question1;

		// add group to account
		Group[] groupOfAccount1 = { group1 };

		account1.groups = groupOfAccount1;

		Group[] groupOfAccount2 = { group2 };
		account2.groups = groupOfAccount2;
		// add account to group
		Account[] accountOfGroup1 = { account1, account2, account3 };
		group1.accounts = accountOfGroup1;

		Account[] accountOfGroup2 = { account1, account3 };
		group2.accounts = accountOfGroup2;

		Account[] accountOfGroup3 = { account2 };
		group3.accounts = accountOfGroup3;

		Account[] allOfAccount = { account1, account2, account3 };

		Group[] allOfGroup = { group1, group2, group3 };
		
		
//		Exercise 1 (Optional): Datatype Casting
//		Question 1:
//		Khai báo 2 số lương có kiểu dữ liệu là float.
//		Khởi tạo Lương của Account 1 là 5240.5 $
//		Khởi tạo Lương của Account 2 là 10970.055$
//		Khai báo 1 số int để làm tròn Lương của Account 1 và in số int đó ra
//		Khai báo 1 số int để làm tròn Lương của Account 2 và in số int đó ra
		
		int account1Luong = (int) account1.luong;
		int account2Luong = (int) account2.luong;
//		System.out.println("Lương của " + account1.fullName + " là: " + account1Luong);
//		System.out.println("Lương của " + account2.fullName + " là: " + account2Luong);
		
//		Question 2:
//			Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ thêm
//			có số 0 ở đầu cho đủ 5 chữ số)
		
		Random rd5 = new Random();
		int xQuestion21 = rd5.nextInt(99999);
		int xQuestion22 = rd5.nextInt(99999);
		int xQuestion23 = rd5.nextInt(99999);
		
		System.out.println(xQuestion21);
		System.out.println(xQuestion22);
		System.out.println(xQuestion23);
//		Question 3:
//			Lấy 2 số cuối của số ở Question 2 và in ra.
//			Gợi ý:
//			Cách 1: convert số có 5 chữ số ra String, sau đó lấy 2 số cuối
//			Cách 2: chia lấy dư số đó cho 100
		
		System.out.println(xQuestion21 % 100);
//		Question 4:
		tinhThuong();
	
		
	}
//	Question 4:
//	Viết 1 method nhập vào 2 số nguyên a và b và trả về thương của chúng
	public static void tinhThuong() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào a và b: ");
		System.out.println("a = ");
		int a = sc.nextInt();
		System.out.println("b = ");
		int b = sc.nextInt();
		System.out.println("Thương của a và b là: " + a/b);
	}
	
}
