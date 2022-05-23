package com.masai;

import java.util.*;

public class Main2 {
	
	public static void main(String[] args) {
		
		Student student = new Student();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number of Students you want to enter");
		int number = scanner.nextInt();
		System.out.println("Enter the Roll Number :");
		student.rollNumber = scanner.nextInt();
		System.out.println("Enter the Name :");
		student.studentName= scanner.next(); 
		
		

	}

}
