package entity;

import java.time.LocalDate;
import java.util.Date;

public class Account {
	int accountID;
	String email;
	String userName;
	String fullName;
	Department departmentID;
	Position positionID;
	LocalDate createDate;
	Group[] groups;
	float luong;
}

