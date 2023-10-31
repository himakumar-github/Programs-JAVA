package com.unocareer;
public class ThirdDigitNumber {
	public static void main(String[] args) {
		int n=789125;
		int index=2;
		String s=String.valueOf(n);
		char str=s.charAt(2);
		if (str%2!=0) {
             System.out.println("Odd");
		}else {
			System.out.println("Even");
		}
	}
}