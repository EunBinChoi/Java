package system_out;

import java.io.*;

public class SystemOutExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		OutputStream os = System.out;
		String hangul = "�����ٶ�";
		byte[] hByte = hangul.getBytes();
		os.write(hByte);
		os.flush();
	}

}
