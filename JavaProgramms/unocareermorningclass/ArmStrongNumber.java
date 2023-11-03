package com.unocareermorningclass;

public class ArmStrongNumber {

	public static void main(String[] args){
		int num=153;
		int n;
		int ld=0;
		int t=num;
		
		while(num!=0) {
			n=num%10;
			num=num/10;
			ld=ld+n*n*n;
		}
		if(t==ld) {
			System.out.println("ArmStrong Number --> True");
		} else {
			System.out.println("ArmStrong Number --> False");
		}
	}
}
