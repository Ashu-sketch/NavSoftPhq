package com.candidates.questions;

import java.util.Scanner;

public class MyPalindromeProgramme {

	public static void main(String[] args) {
		/*  radar
		 *madam
		 *deified
		 *civic
		 **/
		
//		String value="radar";
//		String reversedName="";
//		char check=' ';
//		 
//		 for(int i=0;i<value.length(); i++) {
//			 check=value.charAt(i);
//			 reversedName=check+reversedName;
//			 
//		 }
//		 
//		 System.out.println("reverse a word: "+ reversedName);
//		 System.out.println(value.equals(reversedName));
//		 System.out.println(value==reversedName);
		
		
		//approach follow by navsoft class
		Scanner in=new Scanner(System.in);
		System.out.print(" enter a string: ");
		String value=in.nextLine();
		String reversedName="";
		char check=' ';
		 
		 for(int i=0;i<value.length(); i++) {
			 check=value.charAt(i);
			 reversedName=check+reversedName;
			 
		 }
		 
		 System.out.println("reverse a word: "+ reversedName);
		 System.out.println(value.equals(reversedName));
		 System.out.println(value==reversedName);
		
		
	}

}
