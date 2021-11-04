package com.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.util.Scanner;

public class FileCopying {
	public static void main(String[] args) {
		File file = new File("file1.txt");
		FileReader inputStream = null;
		try {
			inputStream = new FileReader(file);
			Scanner sc = new Scanner(inputStream);
			while(sc.hasNextLine()) {
				String s =sc.nextLine();
				System.out.println(s);
			}
		} catch ( Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
