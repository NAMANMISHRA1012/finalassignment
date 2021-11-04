package com.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
	public static void main(String[] args) {
		File file= new File("output.txt");
		FileWriter output= null;
		try {
			 output = new FileWriter(file,true);
			String str = "hello";
			output.write(str);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				output.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}

}
