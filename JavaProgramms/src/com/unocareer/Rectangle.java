package com.unocareer;

public class Rectangle {
	 public static void main(String[] args) { 
		 
		int length=3;
		int breadth=6;
		int area=length*breadth;
		int perimeter=2*(length+breadth);
		
		if (perimeter>area) {
			System.out.println("perimeter is greater than area");
		}
		else if (area==perimeter) {
			System.out.println("Area is equal to Perimeter");
			
		} else if (area>perimeter) {
			System.out.println("Area is greater than perimeter");
		}
	}
}
