package com.codegnan.file.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

	public static void main(String[] args) {
		String filePath="fos.txt";
		String content="hello jfs27 batch.\n"+"how are you";
		
		try(FileOutputStream fos=new FileOutputStream(filePath)){
			byte[] data=content.getBytes();
			fos.write(data);
			System.out.println("file created and successfully written to data");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
