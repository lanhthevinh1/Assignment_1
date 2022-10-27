package xxentity;

import java.time.LocalDate;
import java.util.Date;

public class Exercise1 {
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
		account1.createDate = LocalDate.of(2020,01,3);
		
				
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
		group1.groupName  = "Java";
		
		Group group2 = new Group();
		group2.groupID = 2;
		group2.groupName  = "python";
		
		Group group3 = new Group();
		group3.groupID = 3;
		group3.groupName  = "C#";
		
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
		exam1.duration  = 30;
		exam1.creatorID = account1;
		
		Exam exam2 = new Exam();
		exam2.examID = 2;
		exam2.code = 002;
		exam2.title = "tìm hiểu về NET!";
		exam2.categoryID = categoryQuestion2;
		exam2.duration  = 60;
		exam2.creatorID = account2;
		
		Exam exam3 = new Exam();
		exam3.examID = 3;
		exam3.code = 003;
		exam3.title = "tìm hiểu về C++!";
		exam3.categoryID = categoryQuestion3;
		exam3.duration  = 40;
		exam3.creatorID = account3;
		
		ExamQuestion examQuestion1 = new ExamQuestion();
		examQuestion1.examID = exam1;
		examQuestion1.questionID = question1;
		
		ExamQuestion examQuestion2 = new ExamQuestion();
		examQuestion2.examID = exam1;
		examQuestion2.questionID = question1;
		
		// add group to account 
		Group[] groupOfAccount1 = {group1};
				
		account1.groups = groupOfAccount1;
			
		Group[] groupOfAccount2 = {group2};
		account2.groups = groupOfAccount2;
		// add account to group 
		Account[] accountOfGroup1 = {account1, account2, account3};
		group1.accounts = accountOfGroup1;
		
		Account[] accountOfGroup2 = {account1, account3};
		group2.accounts = accountOfGroup2;
		
		Account[] accountOfGroup3 = {account2};
		group3.accounts = accountOfGroup3;
//		Question 1:
//			Kiểm tra account thứ 2
//			Nếu không có phòng ban (tức là department == null) thì sẽ in ra text
//			"Nhân viên này chưa có phòng ban"
//			Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là ..."
//			
//		if (account2.departmentID == null) {
//			System.out.println("Account nay chua co phong ban!");
//		}else {
//			System.out.println("Phong ban cua account nay la" + account2.departmentID.departmentName);
//		}
		
//		Question 2:
//			Kiểm tra account thứ 2
//			Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
//			Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của nhân viên
//			này là Java Fresher, C# Fresher"
//			Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là người
//			quan trọng, tham gia nhiều group"
//			Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là
//			người hóng chuyện, tham gia tất cả các group"
		
//		if (account2.groups == null ||  account2.groups.length == 0) {
//			System.out.println("Nhân viên này chưa có group");
//		}else if (account2.groups.length == 1 || account2.groups.length == 2) {
//			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
//		}else if (account2.groups.length == 3) {
//			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
//		}else if (account2.groups.length >= 4) {
//			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
//		}
		
//		Question 3
//		Sử dụng toán tử ternary để làm Question
		
//		System.out.println((account2.departmentID == null) ? ("Account nay chua co phong ban!"): ("Phong ban cua account nay la: " + account2.departmentID.departmentName)); 
	
//		Question 4:
//			Sử dụng toán tử ternary để làm yêu cầu sau:
//			Kiểm tra Position của account thứ 1
//			Nếu Position = Dev thì in ra text "Đây là Developer"
//			Nếu không phải thì in ra text "Người này không phải là Developer"
	
//		System.out.println((account1.positionID.positionName == "Dev")?("Đây là Developer"):("Người này không phải là Developer"));
		
//		SWITCH... Case
//		Question 5
//		Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
//
//			Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
//
//			Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
//
//			Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
//
//			Còn lại in ra "Nhóm có nhiều thành viên"
//		switch (group1.accounts.length) {
//
//		case 1:
//			System.out.println("Nhóm có một thành viên");
//			break;
//		case 2:
//			System.out.println("Nhóm có hai thành viên");
//			break;
//		case 3:
//			System.out.println("Nhóm có ba thành viên");
//			break;
//		default:
//			System.out.println("Nhóm có nhiều thành viên");
//			break;
//		}
		
//		Question 6:
//			Sử dụng switch case để làm lại Question 2
//		Question 7:
//			Sử dụng switch case để làm lại Question
//		switch (group3.accounts.length) {
//		case 1:
//			System.out.println("Nhóm có một thành viên");
//			break;
//		case 2:
//			System.out.println("Nhóm có hai thành viên");
//			break;
//		case 3:
//			System.out.println("Nhóm có ba thành viên");
//			break;
//		default:
//			System.out.println("Nhóm có nhiều thành viên");
//			break;
//		}
		
//		FOREACH
//		Question 8:
//			In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
//			họ

		System.out.printf("%10s			%10s			%10s \n","Email","Fullname","Phong Ban");
		Account[] allOfAccount = {account1, account2,account3};
		for(Account accounts : allOfAccount){
			System.out.printf("%10s			%10s		%10s \n",accounts.email,accounts.fullName,accounts.departmentID.departmentName);
		}
		
//		Question 9:
//			In ra thông tin các phòng ban bao gồm: id và name
		
//		System.out.printf("%10s		%10s	 \n","DepartmentID","Ten Phong Ban");
		Department[] allOfDepartment = {department1, department2,department3};
//		
//		for(Department departments: allOfDepartment) {
//			System.out.printf("%10s		%10s	\n",departments.departmentID,departments.departmentName);
//		}
		
//		FOR
//		Question 10:
//		In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
//		họ theo định dạng như sau:
//		Thông tin account thứ 1 là:
//		Email: NguyenVanA@gmail.com
//		Full name: Nguyễn Văn A
//		Phòng ban: Sale
		
//		Thông tin account thứ 2 là:
//		Email: NguyenVanB@gmail.com
//		Full name: Nguyễn Văn B
//		Phòng ban: Marketting
		
//		for(int i = 0;i<allOfAccount.length;i++) {
//			System.out.printf("Thông tin account thứ %10s là:\nEmail: %10s\nFull name:%10s\nPhòng ban:%10s\n\n"
//													,i+1		,allOfAccount[i].email	,allOfAccount[i].fullName, allOfAccount[i].departmentID.departmentName);
//		}
		
//		Question 11:
//			In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau:
//			Thông tin department thứ 1 là:
//			Id: 1
		
//		for(int i = 0;i<allOfDepartment.length;i++) {
//			System.out.printf("Thông tin Department thứ %10s là:\nId: %10s\nName: %10s\n\n"
//													,i+1		,allOfDepartment[i].departmentID	,allOfDepartment[i].departmentName);
//		}
		
//		Question 12:
//			Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10
		
//		for(int i = 0;i<2;i++) {
//			System.out.printf("Thông tin Department thứ %10s là:\nId: %10s\nName: %10s\n\n"
//													,i+1		,allOfDepartment[i].departmentID	,allOfDepartment[i].departmentName);
//		}
		
		
//		Question 13:
//			In ra thông tin tất cả các account ngoại trừ account thứ 2
		
//		for(int i = 0;i<allOfAccount.length;i++) {
//			if(i == 1) {continue;}
//			System.out.printf("Thông tin account thứ %10s là:\nEmail: %10s\nFull name:%10s\nPhòng ban:%10s\n\n"
//					,i+1		,allOfAccount[i].email	,allOfAccount[i].fullName, allOfAccount[i].departmentID.departmentName);
//		
//		}
		
//		Question 14:
//			In ra thông tin tất cả các account có id < 4
		
//		for(int i = 0;i<allOfAccount.length;i++) {
//			if(allOfAccount[i].accountID < 4) {
//				System.out.printf("Thông tin account thứ %10s là:\nEmail: %10s\nFull name:%10s\nPhòng ban:%10s\n\n"
//						,i+1		,allOfAccount[i].email	,allOfAccount[i].fullName, allOfAccount[i].departmentID.departmentName);
//			}else {break;}
//		}
		
		
//		Question 15:
//			In ra các số chẵn nhỏ hơn hoặc bằng 20
//
//		for(int i = 0;i<=20;i++) {
//			if(i%2 == 0) {
//				System.out.println(i);
//			}
//		}
		
//		WHILE
//		Question 16:
//		Làm lại các Question ở phần FOR bằng cách sử dụng WHILE kết hợp với
//		lệnh break, continue
		
//		Question 10
		int i = 0;
//		while(i< allOfAccount.length) {
//			System.out.printf("Thông tin account thứ %10s là:\nEmail: %10s\nFull name:%10s\nPhòng ban:%10s\n\n"
//					,i+1		,allOfAccount[i].email	,allOfAccount[i].fullName, allOfAccount[i].departmentID.departmentName);
//			i++;
//		}
		
//		Question 11
//		while (i<allOfDepartment.length) {
//			System.out.printf("Thông tin Department thứ %10s là:\nId: %10s\nName: %10s\n\n"
//			,i+1		,allOfDepartment[i].departmentID	,allOfDepartment[i].departmentName);
//			i++;
//		}
		
//		Question 12
//		while (i<2) {
//			System.out.printf("Thông tin Department thứ %10s là:\nId: %10s\nName: %10s\n\n"
//						,i+1		,allOfDepartment[i].departmentID	,allOfDepartment[i].departmentName);
//			i++;
//		}
		
//		Question 13
//		while (i<allOfDepartment.length) {
//			if(i==1) {
//				i++;
//				continue;
//			}
//			System.out.printf("Thông tin Department thứ %10s là:\nId: %10s\nName: %10s\n\n"
//					,i+1		,allOfDepartment[i].departmentID	,allOfDepartment[i].departmentName);
//			i++;
//	}
//		Question 14
//		while(i<allOfAccount.length) {
//			if(allOfAccount[i].accountID< 4) {
//				System.out.printf("Thông tin Department thứ %10s là:\nId: %10s\nName: %10s\n\n"
//						,i+1		,allOfDepartment[i].departmentID	,allOfDepartment[i].departmentName);
//			}else {break;}
//			i++;
//		
//		}
		
//		Question 15
//		while(i<=20) {
//			if(i%2 == 0) {
//				System.out.println(i);
//			}
//			i++;
//		}
		
//		DO-WHILE
//		Question 17:
//		Làm lại các Question ở phần FOR bằng cách sử dụng DO-WHILE kết hợp với
//		lệnh break, continue
		
//		do {
//			System.out.printf("Thông tin account thứ %10s là:\nEmail: %10s\nFull name:%10s\nPhòng ban:%10s\n\n"
//					,i+1		,allOfAccount[i].email	,allOfAccount[i].fullName, allOfAccount[i].departmentID.departmentName);
//			i++;
//		}while(i<allOfAccount.length);
		
//		Question 6:
//		In ra thông tin account (như Question 8 phần FOREACH) theo định dạng
//		table (giống trong Database)
//		Chuyển sang Excercise1		
		
//		System.out.printf("%10s			%10s			%10s \n","Email","Fullname","Phong Ban");
//		Account[] allOfAccount = {account1, account2,account3};
//		for(Account accounts : allOfAccount){
//			System.out.printf("%10s			%10s		%10s \n",accounts.email,accounts.fullName,accounts.departmentID.departmentName);
//		}
	}
}
