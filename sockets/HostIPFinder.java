package com.codegnan.sockets;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;



public class HostIPFinder {

	public static void main(String[] args) {
		String name;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Host name");
		name=scanner.next();
		try {
			InetAddress add=InetAddress.getByName(name);
			System.out.println("IP OF THE HOST:"+add);
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}
		

	}

}
