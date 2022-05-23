package com.masai;

import java.util.*;
public class Course {

	int courseId; 
	String courseName; 
	 int courseFee;
	 
	 void displayCourseDetails(){
		 System.out.println("courseId : " +courseId);
		 System.out.println("courseName : " +courseName);
		 System.out.println("courseFee : " +courseFee);
	 }
	 static void authenticate(String username,String password) {
		 if(username.equals("Admin")&&password.equals("1234")) {
			 Course object = new Course();
			 Scanner scanner = new Scanner(System.in);
			 
			 System.out.println("enter courseId");
			
			 object.courseId= scanner.nextInt();
			
			 System.out.println("enter courseName");
			
			 object.courseName= scanner.next();
			
			 System.out.println("Enter courseFee");
			
			 object.courseFee= scanner.nextInt();
			
			 object.displayCourseDetails();
		 }
		 else {
			 System.out.println("Invalid Username or password");
		 }
	 }
	public static void main(String[] args) {
		
		Course.authenticate("amd", "123");
		Course.authenticate("Admin", "1234");
	}

}
