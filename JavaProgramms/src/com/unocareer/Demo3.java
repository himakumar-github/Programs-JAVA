package com.unocareer;
import java.util.Scanner;

public class Demo3 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number a:");
		int a=scanner.nextInt();
		System.out.println("Enter number b:");
		int b=scanner.nextInt();
		if (a>b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}
}
