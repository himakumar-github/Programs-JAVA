package com.unocareer;

import java.util.Scanner;

public class PrintGrade {
	public static void main(String[] args) {
		
//		int A=90;
//		String result=(A>=90 || A<=100)? "Z" : "A";
//		System.out.println(result);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number = ");
		Integer number= scanner.nextInt();
		
		if (number>=90 && number<=100) {
			System.out.println("A");
			
		}else if (number>75 && number<=89) {
			System.out.println("B");
			
		}else if (number>=60 && number<=74) {
			System.out.println("C");
			
		} else if(number<60) {
			System.out.println("F");
		}
	}
}
