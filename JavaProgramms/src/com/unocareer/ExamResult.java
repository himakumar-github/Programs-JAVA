package com.unocareer;

public class ExamResult {
	public static void main(String[] args) {
		
	    int mainSubjectA=67;
		int subsidarySubjectB=41;
		
        if (mainSubjectA>=55 && subsidarySubjectB>=45) {
			System.out.println("The Student has passed.");
			
		}else if (mainSubjectA<55 && subsidarySubjectB>45) {
			System.out.println("The Student has failed");
			
		}else if (subsidarySubjectB<=45 && mainSubjectA>=65) {
			System.out.println("The Student has failed but appear the exam for B");
			
		}else {
			System.out.println("The Student has failed");
		}
	}
}
