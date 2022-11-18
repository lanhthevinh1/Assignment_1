package com.vti.entity;

import java.sql.Time;
import java.util.concurrent.TimeoutException;

public class MyException extends Exception{
	
	
	public String message = getMessage();
	public StackTraceElement[] stackTrace = getStackTrace();
	public Time time ;
	public Throwable cause = getCause();
	public MyException() {
		super();
	}
}
