package inet_address;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ���� ��ǻ���� InetAddress ���
		// ���� (UnknownHost Exception) ó���ؾ���
		
		try {
			InetAddress local 
			= InetAddress.getLocalHost();
			System.out.println("IP �ּ� : " + local.getHostAddress());
			
			// InetAddress �������� IP �ּ�
			InetAddress[] arr = 
					InetAddress.getAllByName("www.naver.com");
			for(InetAddress i : arr) {
				System.out.println("IP �ּ� : " + i.getHostAddress());
			}
		} 
		catch(UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
