package com.codegnan.file.io;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CSVExample {

	public static void main(String[] args) {
		
		List<Person> people=new ArrayList<>();
		people.add(new Person(101, "pathu", "pathu@gmail.com"));
		people.add(new Person(101, "arjun", "arjun@gmail.com"));
        people.add(new Person(101, "ravi", "ravi@gmail.com"));
		people.add(new Person(101, "radha", "radha@gmail.com"));
		people.add(new Person(101, "sri", "sri@gmail.com"));
		try (PrintWriter pw = new PrintWriter("people.csv")) {
			pw.println("Id,Name,Email");
			for (Person p : people) {
				pw.println(p.toCSV());
				pw.println();
			}
			System.out.println("persons detyails successfully writen to a file");
		}catch (IOException e) {
			e.printStackTrace();
			}
		}


	}


