package com.unocareermorningclass;

public class ArmStrongNumber2 {
	public static void main(String[] args) {
		int num=1000;
		int n;
		int ld=0;
		int t=num;
		
		for(int i=0;i<=num;i++) {
			n = num%10;
			num = num/10;
			ld=0+n*n*n;
			
			while (n*n*n < 1000) {
				System.out.println();
			}
		}
	}
}
