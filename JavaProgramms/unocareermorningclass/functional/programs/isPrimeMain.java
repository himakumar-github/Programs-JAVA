package com.functional.programs;

public class isPrimeMain {
	public static void main(String[] args) {
		isPrime prime=(x)->{
			int count=0;
			for (int i = 1; i <= x; i++) {
				if (x%i==0)count++;
			}
			if (count==2) {
				System.out.println("True");
			}else {
				System.out.println("False");
			}
			return false;
		};
		prime.isPrime(17);
	}
}
