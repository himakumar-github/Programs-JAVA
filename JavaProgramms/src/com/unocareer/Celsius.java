package com.unocareer;
public class Celsius {
	public static void main(String[] args) {
		double fh=200;
		double celsius=(fh-32)*5/9;
		int temp=(int) celsius;
		double d=celsius-temp;
		if (d>=0.6 && d<=0.9) {
			System.out.println(temp+1);
		}
		else {
			System.out.println(temp);
		}	
	}
}
