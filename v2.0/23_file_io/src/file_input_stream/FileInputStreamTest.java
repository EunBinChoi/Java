package file_input_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputStream is = null;
		try {
			is = new FileInputStream(".\\input.txt");
			// FileNotFoundException
			
//			int data;
//			data = is.read(); 
//			// 1 ����Ʈ�� ���� (���̻� ���� �� ������ -1 ����)
//			// 'a': 1����Ʈ
//			// '��': 2����Ʈ (euc-kr), 3����Ʈ (utf-8)
//			// IOException
////			
//			while((data = is.read()) != -1) {
////				
//				System.out.print((char)data);
////				System.out.println(data);
//				// enter: cr (13) + lf (10) (windows)
//				// 		: cr (13) (mac)
//			}
			
			byte[] dataArr = new byte[10];
			is.read(dataArr);
			
			for(byte data : dataArr) {
				System.out.print((char)data);
			}
			
		} catch(FileNotFoundException e) {
			System.out.println(e);
		} catch(IOException e) { // ������
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
		} finally {
			try {
				if(is != null) {
					is.close();
				}
			} catch(IOException e) {
				System.out.println(e);
			} catch(Exception e) {
				System.out.println(e);
			}
		}
		
	}

}
