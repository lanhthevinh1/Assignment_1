package entity;

import java.time.LocalDate;

public class basic_testing_system_3_ex2 {
	public static void main(String[] args) {
//		Exercise 2 (Optional): Default value
//		Question 1:
//		Không sử dụng data đã insert từ bài trước, tạo 1 array Account và khởi
//		tạo 5 phần tử theo cú pháp (sử dụng vòng for để khởi tạo):
//		Email: "Em	ail 1"
//		Username: "User name 1"
//		FullName: "Full name 1"
//		CreateDate: now
		
		Account[] accounts = new Account[5];
		for(int i = 0;i<accounts.length;i++) {
			accounts[i] = new Account();
			accounts[i].accountID = i;
			accounts[i].userName = "User name " + i;
			accounts[i].fullName = "Full name " + i;
			accounts[i].createDate = LocalDate.now();
		}
		for(Account account: accounts) {
			System.out.println(account.accountID + "\n" +account.userName + "\n" + account.fullName + "\n" + account.createDate + "\n");
		}
		
		
	}
}	
