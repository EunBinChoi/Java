package server_client_msg;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
					5011));
			System.out.println("[���� ����]");
			
			// �޼��� ���� (Ŭ���̾�Ʈ -> ����)
			OutputStream os = socket.getOutputStream();
			String msg = "Hello Server~!";
			byte[] bytes = msg.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			
			
			System.out.println("[������ ������ ����!]");
			
			InputStream is 
			= socket.getInputStream();
			
			bytes = new byte[100];
			int readByte = is.read(bytes);
			msg = new String(bytes, 0, readByte, "UTF-8");
			System.out.println("[������ �ޱ� ���� !] " + msg);
			
			os.close();
			is.close();
			
			
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
