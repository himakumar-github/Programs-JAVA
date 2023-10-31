package com.unocareer;
import java.util.Arrays;

public class Array123 {

	public static void main(String[] args) {
		/*
		 * int []a= new int[12]; a[0]=1; a[1]=2; a[2]=3; a[3]=4; a[4]=5; a[5]=6; a[6]=7;
		 * a[7]=8; a[8]=9; a[9]=10; a[10]=11; a[11]=12; for (int i : a) {
		 * System.out.println(i); } // System.out.println(Arrays.toString(a)); //
		 * System.out.println(a.length);
		 */

		//		int [][] array=new int[3][2]; This is one way of initialising
		//		int [][]array= {
		//				{60,61},
		//				{61,62},
		//				{62,63}
		//		};
		//		System.out.println(Arrays.deepToString(array));
		//		System.out.println(array.length);

		int [][]array=new int [3][2];
		array[0]= new int[3];
		array[1]=new int[1];
		array[2]=new int[2];

		array[0][0]=60;
		array[0][1]=70;
		array[0][2]=30;
		
		array[1][0]=10;
		
		array[2][0]=20;
		array[2][1]=30;
		
		System.out.println(Arrays.deepToString(array));
	}	
}
