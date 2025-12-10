
package com.codegnan.foundation;

import java.util.Scanner;

public class TaxiFair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Distance travelled (in Kilometers):");
        double distance=scanner.nextDouble();

         double fare=(distance<2)?50:
        	              (distance<=10)?(50+(distance-2)*15):
		                      (50+(8*15)+(10)*10);
         fare=(distance>20)?fare*0.95:fare;
         System.out.println("Total fare : "+fare);
         scanner.close();
	}

}
