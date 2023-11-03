package com.unocareermorningclass;

public class RepeatedCharacter2 {
	
	public static void main(String[] args) {
		String str="10339033414";
		char[]strArray= str.toCharArray();
		char eachChar;
		char lastRepeatedChar=' ';
		int count;
		for (int i = 0; i < strArray.length; i++) {
			eachChar=strArray[i];
			count=0;
			for (int j = 0; j < strArray.length; j++){
				if (eachChar==strArray[j]) {
					count++;	
				}
			}
			if (count>1) {
				lastRepeatedChar=eachChar;
			}
		}
		System.out.println("Last Repeated Char-->"+lastRepeatedChar);
	}
}
