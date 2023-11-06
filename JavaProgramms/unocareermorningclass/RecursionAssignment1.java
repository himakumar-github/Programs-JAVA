package com.unocareermorningclass;

public class RecursionAssignment1 {
	static int n1=1;
	static int fact(int n) {
		if (n==0) return 1;
		else {
			return(n1++)*fact(n-1);
		}
	}
	public static void main(String[] args){
		System.out.println("Factorial number is: "+fact(5));
	}
}
