package com.codegnan.file.io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {

	public static void main(String[] args) {
		String fileLocation="fos.txt";
		try(FileInputStream fis=new FileInputStream(fileLocation)){
			
			int byteData;
			while((byteData=fis.read()) !=-1) {
				System.out.print((char) byteData);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println("reading data by using BufferedInputStream");
		String FileName="bos.txt";
		try (BufferedInputStream bis=new BufferedInputStream(FileLocation)) {
				
		}
			
		}

	}


