package com.codegnan.sockets;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPEchoServer {
		
		private static ServerSocket ss;
		private static final int p=1234;

		public static void main(String[] args) {
			System.out.println("Opening port....\n");
			try {
				ss=new ServerSocket(p);
			}catch(IOException e){
				System.out.println("Unable to attach port");
				System.exit(1);
				
			}
			do {
				handleClient();
			}while(true);

		}

		private static void handleClient() {
			Socket link=null;
			try {
				link=ss.accept();
				BufferedReader input=new BufferedReader(new InputStreamReader(link.getInputStream()));
				PrintWriter output=new PrintWriter(link.getOutputStream());
				int numMess=0;
				String message=input.readLine();
				while(!message.equals("CLOSE")) {
					System.out.println("Message Received.");
					numMess++;
					output.println(numMess+"Message:"+numMess+":"+message);
					message=input.readLine();
				}
				output.println(numMess+"Message Received");
				
				}catch(IOException e) {
					e.printStackTrace();
					
				}finally {
					try {
						System.out.println("Closing Connection...");
						link.close();
					}catch(IOException e) {
						System.out.println("Unable to Disconnect");
						System.exit(1);
					}
				}
			}
			
		}
	


