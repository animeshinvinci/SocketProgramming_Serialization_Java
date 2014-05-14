package com.learn.socket.udp;

import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.net.SocketException;

public class UDPServer  extends Thread{

	int port=4444;
	DatagramSocket datagramSocket;
	SocketAddress addr;
	public UDPServer(int port) {
		try {
			datagramSocket = new DatagramSocket(port);
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public UDPServer() {
		try {
			datagramSocket = new DatagramSocket();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		createAndListen();
	
	}

	private void createAndListen() {
		// TODO Auto-generated method stub

		
	}
}
