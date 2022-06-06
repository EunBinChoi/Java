package server_client_test;

import java.io.IOException;
import java.net.*;

// localhost 5001 ��Ʈ�� ���� ��û
// connect() ���� ���� -> ���� ����!

public class ServerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();
//			System.out.println("[���� ��û]");
			serverSocket.bind
			(new InetSocketAddress("localhost", 5009));
			
			while(true) {
				System.out.println("[���� ��ٸ�]");
				Socket socket 
				= serverSocket.accept(); // Ŭ���̾�Ʈ ���� ����
				
				InetSocketAddress isa 
				= (InetSocketAddress)socket
				.getRemoteSocketAddress();
				
				System.out.println("[���� ������] " 
				+ isa.getHostName());
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		// ServerSocket�� ���� ���� ���� ���
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close(); // ServerSocket �ݱ�
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
