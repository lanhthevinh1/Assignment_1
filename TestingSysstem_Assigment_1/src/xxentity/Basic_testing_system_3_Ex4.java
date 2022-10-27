package xxentity;

import java.time.LocalDate;
import java.util.Scanner;

public class Basic_testing_system_3_Ex4 {
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
		group1.groupName = "Fresher Java";

		Group group2 = new Group();
		group2.groupID = 2;
		group2.groupName = "python";

		Group group3 = new Group();
		group3.groupID = 3;
		group3.groupName = "C#";

		Group group4 = new Group();
		group4.groupID = 4;
		group4.groupName = "Java";

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

		Group[] allOfGroup = { group1, group2, group3, group4 };
//		Exercise 4: String
//		Question 1:
//		Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí tự đó (các từ có
//		thể cách nhau bằng nhiều khoảng trắng );
		String a = "lam  the  nao?";

		String b = a.replaceAll(" ", "");
		System.out.println(b.length());

//		Question 2:
//			Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1;
		String c = "deo biet!";
		a = a.concat(c);
		System.out.println(a);
//		Question 3:
//		nhapTenQuestion3();

//		Question4:
//		nhapTenQuestion4();

//		Question5:
//		nhapTenQuestion5();

//		Question6:
//		nhapTenQuestion6();

//		Question7:
//		nhapTenQuestion7();

//		Question 8:
//			In ra tất cả các group có chứa chữ "Java"
		for (Group group : allOfGroup) {
			String[] nameArray = group.groupName.split(" ");
			for (String name : nameArray) {
				if (name.equals("Java")) {
					System.out.println(group.groupName);
				}
			}

		}

//		Question 9: In ra tất cả các group "Java"
		for (Group group : allOfGroup) {
			if (group.groupName.equals("Java")) {
				System.out.println(group.groupName);
			}
		}

//		Question 10 (Optional):
//			Kiểm tra 2 chuỗi có là đảo ngược của nhau hay không.
//			Nếu có xuất ra “OK” ngược lại “KO”.
//			Ví dụ “word” và “drow” là 2 chuỗi đảo ngược nhau
		String s1 = "word";
		String s2 = "dro";
		String s1Reverse = "";
		char[] s1Array = s1.toCharArray();
		for (int i = s1Array.length - 1; i >= 0; i--) {
			s1Reverse += s1Array[i]; //Question 12
		}
		if (s2.equals(s1Reverse)) {
			System.out.println("OK");
		} else {
			System.out.println("KO");
		}

//		Question 11 (Optional): Count special Character
//		Tìm số lần xuất hiện ký tự "a" trong chuỗi
		String xQuestion11 = "aavvssaaca";
		char[] xArray = xQuestion11.toCharArray();
		int dem =0;
		for(char x:xArray) {
			if(x == 'a') dem++;
		}
		System.out.println(dem);
		
//		Question 12 (Optional): Reverse String
//		Đảo ngược chuỗi sử dụng vòng lặp
//		Question 13 (Optional): String not contains digit
//		Kiểm tra một chuỗi có chứa chữ số hay không, nếu có in ra false ngược
//		lại true.
//		Ví dụ:
//		"abc" => true
//		"1abc", "abc1", "123", "a1bc", null => false
		
		String strQuestion12 = "a1bc";
		for (int i = 0;i<strQuestion12.length();i++) {
			if(Character.isDigit(strQuestion12.charAt(i))) {
				System.out.println(false);
				break;
			}
			
		}
		
//		Question 14 (Optional): Replace character
//		Cho một chuỗi str, chuyển các ký tự được chỉ định sang một ký tự khác
//		cho trước.
//		Ví dụ:
//		"VTI Academy" chuyển ký tự 'e' sang '*' kết quả " VTI Acad*my"
//		String strQuestion14 = "Academy";
		Scanner sc = new Scanner(System.in);
//		System.out.println("Nhập ký tự chỉ định muốn thay thế:");
//		String xReplace = sc.next();
//		char xxReplace = xReplace.charAt(0);
//		char[] strArray14 = strQuestion14.toCharArray();
//		for(int i = 0;i<strArray14.length ;i++) {
//			if(strArray14[i] == xxReplace||strArray14[i] +32 == xxReplace) {
//				strQuestion14 = strQuestion14.replace(strQuestion14.charAt(i), '*');
//			}
//		}
//		System.out.println(strQuestion14);
		
//		Question 15 (Optional): Revert string by word
//		Đảo ngược các ký tự của chuỗi cách nhau bởi dấu cách mà không dùng
//		thư viện.
//		Ví dụ: " I am developer " => "developer am I".
//		Các ký tự bên trong chỉ cách nhau đúng một dấu khoảng cách.
//		Gợi ý: Các bạn cần loại bỏ dấu cách ở đầu và cuối câu, thao tác cắt
//		chuỗi theo dấu cách
		
		String strQs15 = " I am developer  ";
		strQs15 =strQs15.trim();
		String[] strQs15Array = strQs15.split(" ");
		strQs15 = "";
		for(int i = strQs15Array.length - 1;i >= 0;i--) {
			strQs15 += strQs15Array[i] +" ";
		}
		System.out.println(strQs15);
		
		
		sc.close();
	}

	public static void nhapTenQuestion3() {
//		Question 3:
//		Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên chư
//		viết hoa chữ cái đầu thì viết hoa lên
		Scanner sc = new Scanner(System.in);
		System.out.printf("Nhập vào tên: ");
		String name = sc.next();
		char first = name.charAt(0);
		if (first >= 97 && first <= 122) {
			first -= 32;
		}
		name = name.replace(name.charAt(0), first);
		System.out.println(name);
		sc.close();
	}

	public static void nhapTenQuestion4() {
//		Question 4:
//		Viết chương trình để người dùng nhập vào tên in từng ký tự trong tên
//		của người dùng ra
//		VD:
//			Người dùng nhập vào "Nam", hệ thống sẽ in ra
//			"Ký tự thứ 1 là: N"
//			"Ký tự thứ 1 là: A"
//			"Ký tự thứ 1 là: M"
		Scanner sc = new Scanner(System.in);
		System.out.printf("Nhập vào tên: ");
		String name = sc.next();
		char[] toChar = name.toCharArray();
		int i = 0;
		for (char toCharI : toChar) {
			if (toCharI >= 97 && toCharI <= 122) {
				toCharI -= 32;
			}
			System.out.println("Ký tự thứ " + ++i + " là: " + toCharI);
		}
		
		
		sc.close();
	}

	public static void nhapTenQuestion5() {
//		Question 5:
//			Viết chương trình để người dùng nhập vào họ, sau đó yêu cầu người
//			dùng nhập vào tên và hệ thống sẽ in ra họ và tên đầy đủ
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào họ: ");
		String ho = sc.nextLine();
		System.out.println("Nhập vào tên: ");
		String ten = sc.nextLine();
//		System.out.println(ten);
//		String hoTen = ho.concat(ten);
//		hoTen = hoTen.concat(ten);
		System.out.println(ho + " " + ten);
		sc.close();
	}

	public static void nhapTenQuestion6() {
//		Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và
//		sau đó hệ thống sẽ tách ra họ, tên , tên đệm
//		VD:
//		Người dùng nhập vào "Nguyễn Văn Nam"
//		Hệ thống sẽ in ra
//		"Họ là: Nguyễn"
//		"Tên đệm là: Văn"
//		"Tên là: Nam"
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào họ và tên: ");
		String hoTen = sc.nextLine();
		String[] hoTenArray = hoTen.split(" ");
		System.out.println("Họ là: " + hoTenArray[0]);
		System.out.println("Tên đệm là: " + hoTenArray[1]);
		System.out.println("Tên là: " + hoTenArray[2]);

		sc.close();
	}

	public static void nhapTenQuestion7() {
//		Question 7:
//			Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và
//			chuẩn hóa họ và tên của họ như sau:
//			a) Xóa dấu cách ở đầu và cuối và giữa của chuỗi người dùng nhập
//			vào
//			VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ
//			chuẩn hóa thành "nguyễn văn nam"
//			b) Viết hoa chữ cái mỗi từ của người dùng
//			VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ
//			chuẩn hóa thành "Nguyễn Văn Nam"
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào họ và tên: ");
		String hoTen = sc.nextLine();
		String[] hoTenArray = hoTen.split(" ");
		hoTen = "";
		for (String hoTenEach : hoTenArray) {
			char first = hoTenEach.charAt(0);
			if (first >= 97 && first <= 122) {
				first -= 32;
				hoTenEach = hoTenEach.replace(hoTenEach.charAt(0), first);
			}
			hoTen += hoTenEach + " ";
		}
		System.out.println(hoTen);

		sc.close();

	}

}
