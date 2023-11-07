package com.functional.programs;

public class EvenOddMain {

	public static void main(String[] args) {
		EvenOdd e=(num)->{
			if (num%2!=0) return true;
			else return false;
			};
			boolean res=e.isEven(13);
			System.out.println(res);
		};
	}
