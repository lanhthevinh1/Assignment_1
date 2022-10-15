package entity;

import java.util.Date;

public class Question {
	int questionId;
	String content;
	CategoryQuestion categoryID;
	TypeQuestion typeID;
	Account creatorID;
	Date createDate;
}
