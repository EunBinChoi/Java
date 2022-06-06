package server_client_msg;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
			(new InetSocketAddress("localhost", 5011));
			
			while(true) {
				System.out.println("[���� ��ٸ�]");
				Socket socket 
				= serverSocket.accept(); // Ŭ���̾�Ʈ ���� ����
				
				InetSocketAddress isa 
				= (InetSocketAddress)socket
				.getRemoteSocketAddress();
				
				System.out.println("[���� ������] " 
				+ isa.getHostName());
				
				InputStream is = socket.getInputStream();
				byte[] bytes = new byte[100];
				
				int readBytes = is.read(bytes);
				String msg 
				= new String(bytes, 0, readBytes, "UTF-8");
				System.out.println("[������ �ޱ� ����!] " + msg);
				
				
				// ���� (OutputStream) -> Ŭ���̾�Ʈ (InputStream)
				OutputStream os = socket.getOutputStream();
				msg = "Hello Client!";
				bytes = msg.getBytes("UTF-8");
				os.write(bytes);
				os.flush();
				
				System.out.println("[������ ������ ����!]");
				
				
				os.close();
				is.close();
				socket.close();
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
