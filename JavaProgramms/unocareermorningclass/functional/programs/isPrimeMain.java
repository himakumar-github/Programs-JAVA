package com.functional.programs;

public class isPrimeMain {
	public static void main(String[] args) {
		isPrime prime=(x)->{
			boolean a=true;
			int count=0;
			for (int i = 1; i <= x; i++) {
				if (x%i==0)count++;
			}
			if (count==2) {
				a=true;
			}else {
				a=false;
			}
			return a;
		};
		boolean b=prime.isPrime(18);
		System.out.println(b);
	}
}
