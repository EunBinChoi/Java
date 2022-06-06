package system_in;

import java.io.IOException;
import java.io.InputStream;

import image_duplicate_copy.ImageDuplicateCopyTest;

public class SystemInTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputStream is = System.in;
		byte[] data = new byte[100];
		
		System.out.print("이름 : ");
		try {
			// is.read(): 1 바이트를 읽어서 반환
			// is.read(byte[]): byte 배열만큼 읽고 실제 읽은 바이트 수 반환
			
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
