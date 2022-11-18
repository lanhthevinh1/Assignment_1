package com.vti.entity;

import java.util.Scanner;

import com.vti.ultis.IOManager;
import com.vti.ultis.ScannerUtils;

public class Account {
	private int id ;
	private String userName;
	private String password;
	private typeAccount typeAccount;
	private double money;
	
	
	public Account() {
	}

	public Account(int id,String userName, String password,typeAccount typeAccount, double money) {
		this.setId(id);
		this.userName = userName;
		this.password = password;
		this.typeAccount = typeAccount;
		this.money = money;
	}

	public int getId() {
		return id;
	}

	public final void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public typeAccount getTypeAccount() {
		return typeAccount;
	}

	public void setTypeAccount(typeAccount typeAccount) {
		this.typeAccount = typeAccount;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	
	public void addMoney(double money) {
		this.money += money;
	}
	
	public void takeMoney (double money) {
		this.money -= money;
	}
	
	public void dangKy() throws Exception {
		
		System.out.println("Nhập loại Account: (1: Admin, 2:User)");
		String choice = ScannerUtils.inputString();
		int choiceInt = Integer.parseInt(choice);
		if(choiceInt == 1) this.typeAccount = typeAccount.admin;
		else if (choiceInt == 2) this.typeAccount = typeAccount.user;
		
		System.out.println("Mời nhập UserName: ");
		this.userName = ScannerUtils.inputString();
		
		System.out.println("Mời nhập password: ");
		this.password = ScannerUtils.inputString();
		
		this.money = 0;
		System.out.println("Bạn muốn thêm tiền vào tk không? (1: có, 2: không)");
		int check  = ScannerUtils.inputInt("Đây không phải số");
		System.out.println("Nhập số tiền muốn thêm");
		double money = ScannerUtils.inputDouble("Đây không phải số");
		if(check == 1) addMoney(money);
		
		writeAccountInfoInFile();
		
	}
	
	public void writeAccountInfoInFile() throws Exception {
		IOManager.writeFile("E:\\JAVA Doccument\\accountInfo.txt", true, this.toString());
	}

	@Override
	public String toString() {
		return "Account " + id + ":\n\t userName=" + userName + 
				"\n\t password=" + password + 
				"\n\t typeAccount="+ typeAccount + 
				"\n\t money=" + money;
	}
	
	
	
}
