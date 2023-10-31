package com.unocareer;
public class Demo {
	
	public static void main(String[] args) {
		int units= 2300,bill=0;
		//0---500----3/- per unit
		//501---1000---- 4/- per unit
		//1001-3000----7/- per unit

		// total bill;

		if ( (units> 0) &&(units <=500)) {
			bill = units * 3;
		}
		else if ( (units> 500) &&(units <=1000)) {
			bill = 500 * 3 +(units-500) * 4;
		}
		else if ( (units> 1000) &&(units <=3000)) {
			bill = 500 * 3 + 500 * 4+(units -1000) * 7;
		}
		System.out.println("Final Bill---->"+bill);
	}
}
