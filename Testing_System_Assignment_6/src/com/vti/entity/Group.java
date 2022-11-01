package com.vti.entity;

import java.time.LocalDate;
import java.util.ArrayList;

public class Group {
	private int Id;
	private String name;
	private Account creatorID;
	private Account[] accounts;
	private LocalDate createDate;
	private ScannerUtils sc;
	public Group() throws Exception {
		sc = new ScannerUtils();
		System.out.println("Nhập groupID: ");
		Id = sc.inputInt("Đây không phải ID.");
		System.out.println("Nhập tên group: ");
		name = sc.inputString();
		
		System.out.println("Group này có mấy Account: ");
		int n = sc.inputInt("Đây không phải số nguyên.");
		accounts =new Account[n];
		for(int i= 0;i<n;i++) {
			accounts[i] = new Account();
		}
		
	}
	
	public void show() {
		System.out.println("ID nhóm: " + Id);
		System.out.println("Tên nhóm: "+ name);
		System.out.println("Các Account trong nhóm: \n");
		for(Account account:accounts) {
			account.show();
			System.out.println("\n");
		}
	}
}
