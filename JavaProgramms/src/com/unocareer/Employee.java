package com.unocareer;

public class Employee {

	double basicSalary;
	double sales;
	double incentives;

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public void setSales(double sales) {
		this.sales = sales;
	}
	public double getIncentives(){
		incentives=sales*(20/100);
		return incentives;
	}
	public double getTotalSalary() {
		return basicSalary+incentives;
	}
}
