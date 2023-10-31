package com.unocareer;

public class PalindromeNumber {
	public static void main(String[] args) {
		int number=121;
		int reverse = 0;
		int orginalNumber=number;
		
		while (number!=0) {
			reverse=(reverse*10+number%10);
			number=number/10;
			
		}if (orginalNumber==reverse) {
			System.out.println("Palindrome Number");
		}else {
			System.out.println("Not Palindrome Number");
		}
	}
}
