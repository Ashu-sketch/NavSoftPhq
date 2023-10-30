package com.candidates.questions;

import java.util.Scanner;

public class AskedQuestions {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("please enter a string:");
		String name=in.nextLine();
		String reversedName=" ";
				
		
		//check with same name as the reversed string
		String sameAsReversedString="civic";
		
		 char check=' ';
		 
		 for(int i=0;i<name.length(); i++) {
			 check=name.charAt(i);
			 reversedName=check+reversedName;
			 
		 }
		 
		 System.out.println("reverse a word: "+ reversedName);
		 System.out.println(name.equals(reversedName));
		 System.out.println(name==reversedName);
		 
		 System.out.println("check for revrsed String manually with the user input string: "
		 +sameAsReversedString==reversedName);
		
		 
		
		 //it does not violet the rule of equals() method
		 System.out.println(reversedName.equals(sameAsReversedString));
		 
		 
		 
		
		

	}

}
