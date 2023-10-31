package com.unocareer;

public class Demo2 {
	
	// 1. find  pass or fail
	// 2. passed in one subject---
	// 3. passed in 2 subjects
	
	public static void main(String[] args) {
		int s1=15;
		int s2=70;
		int s3=9;
		
		if((s1>35) && (s2>35) && (s3>35)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		if( ( (s1>35) &&(s2>35) ) || ( (s1>35) &&(s3>35) ) || ( (s2>35) &&(s3>35) )  ) {
			System.out.println("Passed in 2 Subjects");
		}
		else {
			System.out.println("Not Passed in 2 Subjects");
		}
		if((s1 > 35) ||  (s2 > 35) ||  (s3 > 35)) {
			System.out.println("Passed in 1 Subjects");
		}
		else {
			System.out.println("not Passed in 1 Subjects"); 
		}
	}	
}
