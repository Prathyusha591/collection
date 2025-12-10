package com.codegnan.foundation;

import java.util.Scanner;

public class VoteChecker {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
        System.out.println("Enter age");

        int age = scanner.nextInt();
        //ternary operator
        //exp1?exp2:exp3
        String eligibility = age >18 ?"eligibility to vote":"not eligibility to vote";
        System.out.println(eligibility);
	}

}
