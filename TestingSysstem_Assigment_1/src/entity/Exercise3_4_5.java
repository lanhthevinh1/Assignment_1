package entity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class Exercise3_4_5 {
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
		
	//	System.out.println("Department: " + department1.departmentID + "\n" + department1.departmentName);
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
		
	//	System.out.println("Position: " + position1.positionID + "\n" + position2.positionName);
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
		account2.createDate = LocalDate.of(2022, 01, 23);
		
		Account account3 = new Account();
		account3.accountID = 1;
		account3.email = "caosondinh@gmail.com";
		account3.userName = "sondinh";
		account3.fullName = "Cao Sơn Đỉnh";
		account3.departmentID = department3;
		account3.positionID = position3;
		
	//	System.out.println("Account: " + account1.accountID +
	//	account1.email + "\n" +
	//	account1.userName + "\n" +
	//	account1.fullName + "\n" +
	//	account1.departmentID + "\n" +
	//	account1.positionID );
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
		question1.createDate = new Date(2020,5,30);
		
		Question question2 = new Question();
		question2.questionId = 2;
		question2.content = "NET là gì?";
		question2.categoryID = categoryQuestion2;
		question2.typeID = typeQuestion2;
		question2.creatorID = account2;
		question2.createDate = new Date(2020,5,30);
		
		Question question3 = new Question();
		question3.questionId = 3;
		question3.content = "C++ là gì?";
		question3.categoryID = categoryQuestion3;
		question3.typeID = typeQuestion2;
		question3.creatorID = account3;
		question3.createDate = new Date(2020,5,30);
		
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
		exam1.createDate =LocalDate.of(2022,01,12);
		
		Exam exam2 = new Exam();
		exam2.examID = 2;
		exam2.code = 002;
		exam2.title = "tìm hiểu về NET!";
		exam2.categoryID = categoryQuestion2;
		exam2.duration  = 60;
		exam2.creatorID = account2;
		exam2.createDate =LocalDate.of(2022,05,15);
		
		Exam exam3 = new Exam();
		exam3.examID = 3;
		exam3.code = 003;
		exam3.title = "tìm hiểu về C++!";
		exam3.categoryID = categoryQuestion3;
		exam3.duration  = 40;
		exam3.creatorID = account3;
		exam3.createDate =LocalDate.of(2022,05,15);
		
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
	//	Exercise 3 (Optional): Date Format
		
	//	Question 1:
	//	In ra thông tin Exam thứ 1 và property create date sẽ được format theo định
	//	dạng vietnamese
	//	Question 2:
	//	In ra thông tin: Exam đã tạo ngày nào theo định dạng
	//	Năm – tháng – ngày – giờ – phút – giây
		
//		String pattern = "dd-MM-YYYY HH:mm:ss";
	//	DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern); 
	//	DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT);
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//		System.out.println("Question1");
//		System.out.printf("%10d  %10d  %10s  %10s  %10s	%10s	%10s \n",exam1.examID,exam1.code,exam1.title, exam1.categoryID.categoryID,exam1.duration, exam1.creatorID.accountID,simpleDateFormat.format(exam1.createDate));
//		
	//	Question 3:
	//		Chỉ in ra năm của create date property trong Question 2
//		System.out.println("Question3");
//		SimpleDateFormat simpleDateFormatQuestion3 = new SimpleDateFormat("yyyy");
//		System.out.printf("%10s\n",simpleDateFormatQuestion3.format(question2.createDate));
//		
	//	Question 4:
	//		Chỉ in ra tháng và năm của create date property trong Question 2
//		SimpleDateFormat simpleDateFormatQuestion4 = new SimpleDateFormat("MM");
//		System.out.printf("%10s\n",simpleDateFormatQuestion4.format(question2.createDate));
//		
	//	Question 5:
	//		Chỉ in ra "MM-DD" của create date trong Question 2
		
//		SimpleDateFormat simpleDateFormatQuestion5 = new SimpleDateFormat("MM-dd");
//		System.out.printf("%10s\n",simpleDateFormatQuestion5.format(question2.createDate));
//	
//		Exercise 4 (Optional): Random Number
		
		
//		Question 1:
//		In ngẫu nhiên ra 1 số nguyên

		Random random = new Random();
 		
//		int xQuestion1 = random.nextInt();
//		System.out.println(xQuestion1);
//		
//		Question 2:
//			In ngẫu nhiên ra 1 số thực
		
//		float xQuestion2 = random.nextFloat();
//		System.out.println(xQuestion2);
//		
//		Question 3:
//			Khai báo 1 array bao gồm các tên của các bạn trong lớp, sau đó in ngẫu nhiên
//			ra tên của 1 bạn
		
//		String[] nameArray = {"Nam","Hung","Vinh","Chien"};
//		int xQuestion3 = random.nextInt(nameArray.length);	
//		System.out.println(xQuestion3);
//		System.out.println(nameArray[xQuestion3]);
//		
//		Question 4:
//			Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 24-07-1995 tới ngày 20-12-
//			1995
		
//		int minDay =(int) LocalDate.of(1995,07,24).toEpochDay();
//		int maxDay =(int) LocalDate.of(1995,12,20).toEpochDay();
//		
//		long randomInt = minDay+ random.nextInt(maxDay - minDay);
//		
//		LocalDate randomDay = LocalDate.ofEpochDay(randomInt);
//		System.out.println(randomDay);
		
//		Question 5:
//			Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 1 năm trở lại đây
//		LocalDate now = LocalDate.now();
//		
//		int nowDay =(int) LocalDate.now().toEpochDay();
//		int nowExcepAYear = nowDay - 365;
//		long randomInt2 = nowExcepAYear + random.nextInt(nowDay - nowExcepAYear);
//		LocalDate randomDay2 = LocalDate.ofEpochDay(randomInt2);
//		System.out.println(randomDay2);
//		
//		Question 6:
//			Lấy ngẫu nhiên 1 ngày trong quá khứ
//		
//		int minDay =(int) LocalDate.of(1900,01,01).toEpochDay();
//		int maxDay =(int) LocalDate.now().toEpochDay();
//		long randomInt = minDay+ random.nextInt(maxDay - minDay);
//		
//		LocalDate randomDay = LocalDate.ofEpochDay(randomInt);
//		System.out.println(randomDay);
//		
		Date input = Date.from(exam1.createDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        Locale locale = new Locale("vi","VN");
        DateFormat dateformat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
        String date = dateformat.format(input);
        System.out.println("Created at: " + date);
	}
	
	
}
