package entity;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

public class Group {
	private int groupID;
	private String groupName;
	private Account creatorID;
	private Account[] accounts;
	private LocalDate createDate;
	public Group(){
		
	}

	//	b) Có các parameter là GroupName, Creator, array Account[]
	public Group(String groupName,Account creatorID,Account[] accounts,LocalDate createDate){
		this.groupName = groupName;
		this.creatorID = creatorID;
		this.accounts = accounts;
		this.createDate = createDate;
	}
//	c) Có các parameter là GroupName, Creator, array String[]
//			usernames , CreateDate
//			Với mỗi username thì sẽ khởi tạo 1 Account (chỉ có thông tin
//			username, các thông tin còn lại = null).
	public Group(String groupName,Account creatorID,String[] userNames,LocalDate createDate){
		this.groupName = groupName;
		this.creatorID = creatorID;
		Account[] accounts = new Account[userNames.length];
		for(int i = 0;i < userNames.length ;i++) {
			accounts[i] = new Account(userNames[i]);
		}
		this.accounts = accounts;
		this.createDate = createDate;
		
	}
	public int getGroupID() {
		return groupID;
	}
	public void setGroupID(int groupID) {
		this.groupID = groupID;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public Account getCreatorID() {
		return creatorID;
	}
	public void setCreatorID(Account creatorID) {
		this.creatorID = creatorID;
	}
	public Account[] getAccounts() {
		return accounts;
	}
	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}
	public LocalDate getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		return "Group [groupID=" + groupID + ", groupName=" + groupName + ", creatorID=" + creatorID + ", accounts="
				+ Arrays.toString(accounts) + ", createDate=" + createDate + "]";
	}
}