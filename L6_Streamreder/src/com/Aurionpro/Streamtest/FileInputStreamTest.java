	package com.Aurionpro.Streamtest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fileInputStream = new FileInputStream("D:\\Aurionpro\\L6_Streamreder\\src\\com\\Aurionpro\\Streamtest\\Untitled 1");
		
		FileOutputStream fileOutputStream = new FileOutputStream("D:\\Aurionpro\\L6_Streamreder\\src\\com\\Aurionpro\\Streamtest\\MyFile2");
		
		int ch ;
		
		while((ch =fileInputStream.read())!= -1) {
			  fileOutputStream.write(ch);
		}
		
		System.out.println("File Copied Succefully.");
		
		fileInputStream.close();
	}
}
