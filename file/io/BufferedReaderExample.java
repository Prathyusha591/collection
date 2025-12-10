package com.codegnan.file.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public  class BufferedReaderExample {

	public static void main(String[] args)throws  IOException {
		
		try(BufferedReader br=new BufferedReader(new FileReader("output.txt"))) {
			
			
			String line;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			}
	}

	}


