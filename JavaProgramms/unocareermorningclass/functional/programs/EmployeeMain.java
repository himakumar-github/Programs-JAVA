package com.functional.programs;

public class EmployeeMain {
	public static void main(String[] args) {
		
//		AddNumber addNumber = new AddNumber();
//		int result=addNumber.add(10,20);
//		System.out.println(result);
		
		Employee e=(a,b)->{
			return a+b;
		};
		int res=e.add(10, 20);
		System.out.println(res);
	}
}
