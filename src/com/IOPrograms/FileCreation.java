package com.IOPrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class FileCreation {

	public static void main(String[] args) throws FileNotFoundException {
		 // File name specified
        File file = new File("E:\\Trick.txt");
       
        if(!file.exists()) {
        	
        	try {
				if(file.createNewFile()) {
					System.out.println("file created ");
				}else {
					System.out.println("not created");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }else {
        	System.out.println("file is already there");
        }
        
        PrintWriter print=new PrintWriter(file);
        print.println("my text inside a file");
        print.close();
        
//        try {
//			if(file.createNewFile()) {
//				System.out.println("file created ");
//			}else {
//				System.out.println("not created");
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

}
