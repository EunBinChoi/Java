package server_client_test;

import java.io.IOException;
import java.net.*;

// localhost 5001 ��Ʈ�� ���� ��û
// connect() ���� ���� -> ���� ����!

public class ClientExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket socket = new Socket();
		
		try {
			
			System.out.println("[���� ��û]");
			socket.connect
			(new InetSocketAddress("localhost", 
					5009));
			System.out.println("[���� ����]");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		// ���� ����Ǿ�������
		if(!socket.isClosed()) {
			try {
				socket.close(); // ���� ����
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
