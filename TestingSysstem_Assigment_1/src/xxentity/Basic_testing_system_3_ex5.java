package xxentity;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;

public class Basic_testing_system_3_ex5 {
	public static void main(String[] args) {
		Department department1 = new Department();
		department1.departmentID = 1;
		department1.departmentName = "Accounting";

		Department department2 = new Department();
		department2.departmentID = 2;
		department2.departmentName = "Boss of director";

		Department department3 = new Department();
		department3.departmentID = 3;
		department3.departmentName = "Marketing";

		Department department4 = new Department();
		department4.departmentID = 4;
		department4.departmentName = "Sale";
		
		Department department5 = new Department();
		department5.departmentID = 5;
		department5.departmentName = "Waiting room";
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
		
		Department[] allOfDepartment = {department1, department2,department3,department4, department5};
		
//		Exercise 5: Object’s Method
//		Question 1:
//		In ra thông tin của phòng ban thứ 1 (sử dụng toString())
//		System.out.println(department1.toString() + "\n");
		
		
//		Question 2:
//			In ra thông tin của tất cả phòng ban (sử dụng toString())
//		for(Department department :allOfDepartment) {
//			System.out.println(department.toString());
//		}
//		Question 3:
//			In ra địa chỉ của phòng ban thứ 1
//		System.out.println(department1);
		
		
//		Question 4: Kiểm tra xem phòng ban thứ 1 có tên là "Phòng A" không?
//		for(Department department:allOfDepartment) {
//			if(department.departmentName.equals("Phòng A")) {
//				System.out.println("Phòng ban "+ department.departmentID+ " tên là phòng A");
//			}
//		}
		
//		Question 5: So sánh 2 phòng ban thứ 1 và phòng ban thứ 2 xem có bằng nhau
//		không (bằng nhau khi tên của 2 phòng ban đó bằng nhau)
//		if(department1.equals(department2)) {
//			System.out.println("Giống nhau");
//		}else System.out.println("Khác nhau");
		
		
//		Question 6: Khởi tạo 1 array phòng ban gồm 5 phòng ban, sau đó in ra danh
//		sách phòng ban theo thứ tự tăng dần theo tên (sắp xếp theo vần ABCD)
//		VD:
//		Accounting
//		Boss of director
//		Marketing
//		Sale
//		Waiting room
//		Collections.sort(Arrays.asList(allOfDepartment));
//		for(Department department:allOfDepartment) {
//			System.out.println(department +"\n");
//		}
		
//		Question 7: Khởi tạo 1 array phòng ban gồm 5 phòng ban, sau đó in ra danh
//		sách phòng ban được sắp xếp theo tên
//		VD:
//		Accounting
//		Boss of director
//		Marketing
//		waiting room
//		Sale
		
		Collections.sort(Arrays.asList(allOfDepartment),new ComparatorDepartmentName());
		for(Department department:allOfDepartment) {
			System.out.println(department +"\n");
		}
		
		
		
	}
}
