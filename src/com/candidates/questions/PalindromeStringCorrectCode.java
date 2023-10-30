package com.candidates.questions;

import java.util.Scanner;

public class PalindromeStringCorrectCode {

	
		    public static void main(String[] args) {
		        Scanner in = new Scanner(System.in);
		        System.out.println("please enter a string:");
		        String name = in.nextLine();
		        String reversedName = "";
		        
		       String sameAsReversedString="lll";

		        // Reverse the string using StringBuilder
		        StringBuilder reversedBuilder = new StringBuilder(name);
		        reversedBuilder.reverse();
		        reversedName = reversedBuilder.toString();

		        System.out.println("reverse a word: " + reversedName);
		        System.out.println(name.equals(reversedName)); // Check if it's a palindrome
		        System.out.println(name == reversedName); // Likely false due to different object references

		        // Check for reversed String manually with the user input string
		        System.out.println("check for reversed String manually with the user input string: " +
		                (sameAsReversedString.equals(reversedName)));

		        // It does not violate the rule of equals() method
		        System.out.println(reversedName.equals(sameAsReversedString));
		    }
		

		
		
		

	}


