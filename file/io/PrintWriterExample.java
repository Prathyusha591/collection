package com.codegnan.file.io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterExample {

	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter("output.txt");
			pw.println("Hello, this is a Message Written to the file");
			pw.println("this is another line");
			pw.println("hello java programmers");
			pw.println("java is very easy to make practice");
			pw.println("end of the message");
			System.out.println("data written to a file successfully");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
