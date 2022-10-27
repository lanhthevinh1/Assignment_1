package backend;

import java.time.LocalDate;

import entity.Account;
import entity.Department;
import entity.Group;

public class Contructor {
	public static void main(String[] args) {
	}
	public void Question1() {
		Department department = new Department();
		Department department1 = new Department("Sale");
		Department department2 = new Department("Dev");
		System.out.println(department + "\n"+ department1 + "\n"+ department2);
	}
	public void Question2() {
		Account account = new Account();
		Account account1  = new Account(2,"lanhthevinh1@gmail.com", "thevinh2" ,"Lành Thế ","Vinh");
		Account account2  = new Account(3,"lanhthevinh2@gmail.com", "thevinh3" ,"Lành Thế ","Vinh");
		System.out.println(account + "\n"+ account1 + "\n"+ account2);
	}
	public void Question3() {
		Account account1  = new Account(1,"lanhthevinh1@gmail.com", "thevinh2" ,"Lành Thế ","Vinh");
		Account account2  = new Account(2,"lanhthevinh2@gmail.com", "thevinh3" ,"Lành Thế ","Vinh");
		Account[] accounts = {account2 , account1};
		String[] userNames = {"thevinh1","thevinh2"};
		Group group = new Group();
		Group group1 = new Group("group1", account1, accounts,LocalDate.parse("2022-05-13"));
		Group group2 = new Group("group2", account2, userNames, LocalDate.parse("2020-07-13"));
		System.out.println(group + "\n"+ group1 + "\n"+group2);
	}
	
}
