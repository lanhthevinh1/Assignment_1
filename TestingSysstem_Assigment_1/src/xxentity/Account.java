package xxentity;

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
	public String toString() {
		String result = "";
		result += accountID + "\n";
		result += email +" "+ userName + " " + fullName + " " + departmentID + " " + positionID;
		return result;
	}
}

