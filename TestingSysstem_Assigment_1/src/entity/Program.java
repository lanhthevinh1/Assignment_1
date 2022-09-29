package entity;

public class Program {
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
		
		System.out.println("Department: " + department1.departmentID + "\n" + department1.departmentName);
		
		Position position1 = new Position();
		position1.positionID = 1;
		position1.positionName = "Dev";
		
		Position position2 = new Position();
		position2.positionID = 2;
		position2.positionName = "Test";
		
		Position position3 = new Position();
		position3.positionID = 3;
		position3.positionName = "PM";
		
		System.out.println("Position: " + position1.positionID + "\n" + position2.positionName);
		
		Account account1 = new Account();
		account1.accountID = 1;
		account1.email = "Lanhthevinh1@gmail.com";
		account1.userName = "thevinh";
		account1.fullName = "Lành Thế Vinh";
		account1.departmentID = department1.departmentID;
		account1.positionID = position1.positionID;
		
		Account account2 = new Account();
		account2.accountID = 1;
		account2.email = "mguyenvanchien@gmail.com";
		account2.userName = "nguyenchien";
		account2.fullName = "Nguyễn Văn Chiến";
		account2.departmentID = department2.departmentID;
		account2.positionID = position2.positionID;
		
		Account account3 = new Account();
		account3.accountID = 1;
		account3.email = "caosondinh@gmail.com";
		account3.userName = "sondinh";
		account3.fullName = "Cao Sơn Đỉnh";
		account3.departmentID = department3.departmentID;
		account3.positionID = position3.positionID;
		
		System.out.println("Account: " + account1.accountID +
		account1.email + "\n" +
		account1.userName + "\n" +
		account1.fullName + "\n" +
		account1.departmentID + "\n" +
		account1.positionID );
		
		
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
		groupAccount1.groupID = group1.groupID;
		groupAccount1.accountID = account1.accountID;
		
		GroupAccount groupAccount2 = new GroupAccount();
		groupAccount2.groupID = group2.groupID;
		groupAccount2.accountID = account2.accountID;
		
		GroupAccount groupAccount3 = new GroupAccount();
		groupAccount3.groupID = group3.groupID;
		groupAccount3.accountID = account3.accountID;
		
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
		question1.categoryID = categoryQuestion1.categoryID;
		question1.typeID = typeQuestion1.typeID;
		question1.creatorID = account1.accountID;
		
		Question question2 = new Question();
		question2.questionId = 2;
		question2.content = "NET là gì?";
		question2.categoryID = categoryQuestion2.categoryID;
		question2.typeID = typeQuestion2.typeID;
		question2.creatorID = account2.accountID;
		
		Question question3 = new Question();
		question3.questionId = 3;
		question3.content = "C++ là gì?";
		question3.categoryID = categoryQuestion3.categoryID;
		question3.typeID = typeQuestion2.typeID;
		question3.creatorID = account3.accountID;
		
		Answer answer1 = new Answer();
		answer1.answerID = 1;
		answer1.Content = "Java là 1 ngôn ngữ hướng đối tượng?";
		answer1.questionID = question1.questionId;
		answer1.isCorrect = true;
		
		Answer answer2 = new Answer();
		answer2.answerID = 1;
		answer2.Content = "NET là Ngôn ngứ lập trình cho các chương trình trên windows";
		answer2.questionID = question2.questionId;
		answer2.isCorrect = true;
		
		Answer answer3 = new Answer();
		answer3.answerID = 1;
		answer3.Content = "C++ là ngôn ngữ được nâng cấp từ ngôn ngữ của C";
		answer3.questionID = question3.questionId;
		answer3.isCorrect = true;
		
		Exam exam1 = new Exam();
		exam1.examID = 1;
		exam1.code = 001;
		exam1.title = "tìm hiểu về Java!";
		exam1.categoryID = 1;
		exam1.duration  = 30;
		exam1.creatorID = account1.accountID;
		
		Exam exam2 = new Exam();
		exam2.examID = 2;
		exam2.code = 002;
		exam2.title = "tìm hiểu về NET!";
		exam2.categoryID = 3;
		exam2.duration  = 60;
		exam2.creatorID = account2.accountID;
		
		Exam exam3 = new Exam();
		exam3.examID = 3;
		exam3.code = 003;
		exam3.title = "tìm hiểu về C++!";
		exam3.categoryID = 3;
		exam3.duration  = 40;
		exam3.creatorID = account3.accountID;
		
		ExamQuestion examQuestion1 = new ExamQuestion();
		examQuestion1.examID = 1;
		examQuestion1.questionID = 1;
		
		ExamQuestion examQuestion2 = new ExamQuestion();
		examQuestion2.examID = 2;
		examQuestion2.questionID = 2;
	}
}
