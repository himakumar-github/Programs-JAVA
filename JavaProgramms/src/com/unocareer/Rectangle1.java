package com.unocareer;

public class Rectangle1 {

	int length=4;
	int breadth=3;
	int area;
	int perimeter;
	int diagonal;

	public Rectangle1(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public void printArea() {
		area=length*breadth;
		System.out.println("Area of Rectangle = "+area);
	}
	public void printPerimeter() {
		perimeter = 2*(length+breadth);
		System.out.println("Perimeter of Rectangle = "+perimeter);
	}
	public void printDiagonal() {
		diagonal=(length*length+breadth*breadth);
		System.out.println("Diagonal of Rectangle = "+diagonal);
	}
	public static void main(String[] args) {
		Rectangle1 rectangle1 = new Rectangle1(4,3);
		int n=rectangle1.length;
		System.out.println(n);
		rectangle1.setLength(4);
		rectangle1.setBreadth(3);
		System.out.println("Length of Rectangle = "+rectangle1.getLength());
		System.out.println("Breadth of Recangle = "+rectangle1.getBreadth());
		rectangle1.printArea();
		rectangle1.printPerimeter();
		rectangle1.printDiagonal();
	}
}
