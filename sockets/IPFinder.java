package com.codegnan.sockets;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPFinder {

	public static void main(String[] args) {
		try {
			InetAddress address = InetAddress.getLocalHost();
			System.out.println("IP Address:"+address.getLocalHost());
		}catch(UnknownHostException e) {
			
		}

	}

}
