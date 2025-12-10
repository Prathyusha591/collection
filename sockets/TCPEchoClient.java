package com.codegnan.sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPEchoClient {
	private static InetAddress host;
	private static final int port=1234;

	public static void main(String[] args) {
		try {  
		host=InetAddress.getLocalHost();
		}catch(UnknownHostException e) {
			System.out.println("Host Id Not Found");
			System.exit(1);
		}
		accessServer();
	}
	
	
		 private static void accessServer() {
		Socket link=null;
		try {
			link=new Socket(host,port);
			BufferedReader input = new BufferedReader(new InputStreamReader (link.getInputStream()));
			PrintWriter output = new PrintWriter(link.getOutputStream());
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String message ,response;
			do {
				System.out.println("Enter Message:");
				message=br.readLine();
				output.println(message);
				response=input.readLine();
				System.out.println("\nserver>"+response);
			}while(!message.equals("***CLOSE***"));
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				System.out.println("Closing connection...");
				link.close();
			}catch(IOException e) {
				System.out.println("Unable to Discount");
				System.exit(1);
			}
		}
	}

}					
		
			
	
		

	


