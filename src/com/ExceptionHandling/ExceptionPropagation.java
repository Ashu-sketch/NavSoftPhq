package com.ExceptionHandling;

public class ExceptionPropagation {
	void divide() {
		int data=10/0;
	}
	void numaricalError() {
		divide();
	}
	void anArithmaticError() {
		try {
			numaricalError();
		} catch (Exception e) {
			System.err.println("exception handlecd...");
		}
	}
	
	
	public ExceptionPropagation(String message) {
		super();
		
	}
	public ExceptionPropagation() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String args[]){
		ExceptionPropagation ex=new ExceptionPropagation();
		ex.anArithmaticError();
	}
}
