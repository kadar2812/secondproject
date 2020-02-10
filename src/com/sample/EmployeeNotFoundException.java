package com.sample;

public class EmployeeNotFoundException extends Exception
{
	
	@Override
	public String getMessage() {
				return "Employee is invalid";
				
	}
}

