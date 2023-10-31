package com.unocareer;

public class Main {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.basicSalary=10000;
		employee.sales=100000;
		System.out.println(employee.getIncentives());
		System.out.println(employee.getTotalSalary());
	}
}