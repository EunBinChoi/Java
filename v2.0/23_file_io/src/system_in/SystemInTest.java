package system_in;

import java.io.IOException;
import java.io.InputStream;

import image_duplicate_copy.ImageDuplicateCopyTest;

public class SystemInTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputStream is = System.in;
		byte[] data = new byte[100];
		
		System.out.print("�̸� : ");
		try {
			// is.read(): 1 ����Ʈ�� �о ��ȯ
			// is.read(byte[]): byte �迭��ŭ �а� ���� ���� ����Ʈ �� ��ȯ
			
			int bytes = is.read(data);
			String name = new String(data, 0, bytes);
			System.out.println(name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			ImageDuplicateCopyTest.close(is);
		}
	}

}
