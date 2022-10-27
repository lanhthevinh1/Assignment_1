package entity;

import java.time.LocalDate;
import java.util.Date;

public class Account {
	private int accountID;
	private String email;
	private String userName;
	private String firstName;
	private String lastName;
	private String fullName;
	private Department departmentID;
	private Position positionID;
	private LocalDate createDate;
	private Group[] groups;
	private float luong;

	public Account(){}
	public Account(int accountID,String email,String userName,String firstName, String lastName){
		this.accountID = accountID;
		this.email = email;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = firstName + " " +lastName;
		}
	public Account(String userName) {
		super();
		this.userName = userName;
	}
	public Account(int accountID,String email,String userName,String firstName, String lastName,Position positionID){
		this.accountID = accountID;
		this.email = email;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = firstName + " " +lastName;
		this.positionID = positionID;
		this.createDate = LocalDate.now();
	}
	public int getAccountID() {
		return accountID;
	}
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Department getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(Department departmentID) {
		this.departmentID = departmentID;
	}
	public Position getPositionID() {
		return positionID;
	}
	public void setPositionID(Position positionID) {
		this.positionID = positionID;
	}
	public LocalDate getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	public Group[] getGroups() {
		return groups;
	}
	public void setGroups(Group[] groups) {
		this.groups = groups;
	}
	public float getLuong() {
		return luong;
	}
	public void setLuong(float luong) {
		this.luong = luong;
	}
	
	
	public String toString() {
		String result = "";
		result += accountID + "\n";
		result += email +" "+ userName + " " + fullName + " " + departmentID + " " + positionID;
		return result;
	}
}

