package com.sample;

import java.util.Scanner;

public class sssss {
	
	public static void main(String[] args) throws EmployeeNotFoundException {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
				
		if (a==1) {
			
			throw new EmployeeNotFoundException();
		}
		
		else
		{
			System.out.println(a);
		}
	
}
}

	
	