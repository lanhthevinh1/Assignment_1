package entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) throws ParseException {

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

		Account account2 = new Account();
		account2.accountID = 1;
		account2.email = "mguyenvanchien@gmail.com";
		account2.userName = "nguyenchien";
		account2.fullName = "Nguyễn Văn Chiến";
		account2.departmentID = department2;
		account2.positionID = position2;

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
//		Exercise 5: Input from console
//		Question 1:
//		Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình
		Scanner sc = new Scanner(System.in);
//		System.out.println("Nhập các số nguyên: \n");
//		System.out.println("a = "+"\n");
//		int a = scanner.nextInt();
//		System.out.println("b = ");
//		int b = scanner.nextInt();
//		System.out.println("c = ");
//		int c = scanner.nextInt();
//		
//		Question 2:
//			Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình

//		System.out.println("Nhập số thực a:");
//		double a = scanner.nextDouble();
//		
//		Question 3:
//			Viết lệnh cho phép người dùng nhập họ và tên

//		System.out.println("Nhập vào họ và tên của bạn: ");
//		System.out.printf("Nhập tên: ");
//		String ten = scanner.next();
//		System.out.printf("Nhập họ: ");
//		String ho = scanner.next();

//		Question 4:
//			Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ

//		System.out.println("Nhập vào ngày sinh của bạn: ");
//		String dateInput = scanner.next();
//		String pattern = "dd-MM-yyyy";
//		
//		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
//		Date date = dateFormat.parse(dateInput);

//		Question5:
//		inputAccount();

//		Question 6:
////			Viết lệnh cho phép người dùng tạo department (viết thành method)
//		inputDepartment();

//		Question 7:
//			Nhập số chẵn từ console
//		int i = 0;
//		do {
//			System.out.println("Nhap vao so chan: ");
//			int inputQuestion7 = sc.nextInt();
//			if(inputQuestion7 % 2 == 0) {
//				System.out.println(inputQuestion7);
//				i++;
//			}else {
//				System.out.println("so vua nhap khong phai so chan xin nhap lai");
//			}
//		}while(i == 0);

//		Question 8:
//		Viết chương trình thực hiện theo flow sau:
//		Bước 1:
//		Chương trình in ra text "mời bạn nhập vào chức năng muốn sử	dụng"
//		Bước 2:
//		Nếu người dùng nhập vào 1 thì sẽ thực hiện tạo account Nếu người dùng nhập vào 2 thì sẽ thực hiện chức năng tạo	department
//		Nếu người dùng nhập vào số khác thì in ra text "Mời bạn nhập lại" và quay trở lại bước 1

//		int i = 0;
//		do {
//			System.out.println("mời bạn nhập vào chức năng muốn sử	dụng");
//			int inputQuestion8 = sc.nextInt();
//			if(inputQuestion8 == 1) {
//				i++;
//				inputAccount();
//				
//			}else if(inputQuestion8 == 2) {
//				i++;
//				inputDepartment();
//			}else {
//				System.out.println("Mời bạn nhập lại");
//			}
//		}while(i == 0);
//
//		outputSo();

		addAccountToGroup();
	}

//	Question 5:
//		Viết lệnh cho phép người dùng tạo account (viết thành method)
//		Đối với property Position, Người dùng nhập vào 1 2 3 4 5 và vào
//		chương trình sẽ chuyển thành Position.Dev, Position.Test,
//		Position.ScrumMaster, Position.PM

	public static void inputAccount() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap vao ID: ");
		int accountID = sc.nextInt();

		System.out.println("Nhap vao userName: ");
		String userName = sc.next();

		System.out.println("Nhap vao email: ");
		String email = sc.next();

		System.out.println("Nhap vao fullname: ");
		String fullName = sc.next();

		System.out.println("Nhap vao Department: ");
		String department = sc.next();

		System.out.println("Nhap vao 1->5 de chon Position: ");
		int position = sc.nextInt();
		switch (position) {
		case 1:
			System.out.println("Dev");
			break;
		case 2:
			System.out.println("Test");
			break;
		case 3:
			System.out.println("ScrumMaster");
			break;
		case 4:
			System.out.println("PM");
			break;
		default:
			System.out.println("Unknown");
			break;
		}

		System.out.println("Nhap group: ");
		String group = sc.next();

		System.out.println("Nhap ngay: ");
		String date = sc.next();
		System.out.println(accountID + "\n" + userName + "\n" + email + "\n" + fullName + "\n" + department + "\n"
				+ group + "\n" + date);
	}

	public static void inputDepartment() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input Department: ");
		String department = sc.nextLine();
		System.out.println("department: " + department);
	}

//	Exercise 6 (Optional): Method
//	Question 1:
//	Tạo method để in ra các số chẵn nguyên dương nhỏ hơn 10

	public static void outputSoChan() {
		int i = 0;
		while (i < 10) {
			if (i % 2 == 0) {
				System.out.println(i);
				i++;
			} else
				i++;
		}
	}

//	Question 3:
//		Tạo method để in ra các số nguyên dương nhỏ hơn 10
	public static void outputSo() {
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
	}

//	Question 9:
//	Viết method cho phép người dùng thêm group vào account theo flow sau:
//	Bước 1:
//	In ra tên các usernames của user cho người dùng xem
//	Bước 2:
//	Yêu cầu người dùng nhập vào username của account
//	Bước 3:
//	In ra tên các group cho người dùng xem
//	Bước 4:
//	Yêu cầu người dùng nhập vào tên của group
//	Bước 5:
//	Dựa vào username và tên của group người dùng vừa chọn, hãy
//	thêm account vào group đó .

	public static void addAccountToGroup() {

		Scanner sc = new Scanner(System.in);
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

		Account account2 = new Account();
		account2.accountID = 1;
		account2.email = "mguyenvanchien@gmail.com";
		account2.userName = "nguyenchien";
		account2.fullName = "Nguyễn Văn Chiến";
		account2.departmentID = department2;
		account2.positionID = position2;

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
		// Question 10
		// In danh sach username
		System.out.println("Danh sách User đang có trên hệ thống. ");
		Account[] accountss = { account1, account2, account3 };
		for (Account a : accountss) {
			System.out.println(a.userName);
		}
		// Nhap username cua Account
		System.out.println("Nhập vào Username của Account: ");
		String username = sc.next();

		// danh sach group can random
		System.out.println("Danh sách Group đang có trên hệ thống. ");
		Group[] groupss = { group1, group2, group3 };
		for (Group g : groupss) {
			System.out.println(g.groupName);
		}

		// Chon ngau nhien 1 group (goi y: them thu vien Random)
//		Random random = new Random();
		System.out.println("Nhap ten Group muon add account tren: ");
		String groupName = sc.next();
		// Them Account
		int indexAccount = 0;
		for (int i = 0; i < accountss.length; i++) {
			if (accountss[i].userName.equals(username)) {
				indexAccount = i;
			}
		}
		int indexGroup= 0;
		for (int i = 0; i < accountss.length; i++) {
			if (groupss[i].groupName.equals(groupName)) {
				indexGroup = i;
			}
		}

		if (indexAccount < 0) {
			System.out.println("Kiem tra thoong tin da nhap. ");
		} else {
			for (int j = 0; j < accountss.length; j++) {
				if (accountss[j].userName.equals(username)) {
					Group[] addGroup = { groupss[indexGroup] };
					accountss[j].groups = addGroup;
					System.out.println("Bạn vừa Add group: " + accountss[indexAccount].groups[0].groupName
							+ " cho Account: " + accountss[indexAccount].userName);
				}
			}
		}
	}
}
