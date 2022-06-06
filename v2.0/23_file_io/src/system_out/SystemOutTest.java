package system_out;

import java.io.IOException;
import java.io.OutputStream;

import image_duplicate_copy.ImageDuplicateCopyTest;

public class SystemOutTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutputStream os = System.out;
		String str = "가나다라";
		byte[] data = str.getBytes();
		try {
			os.write(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			ImageDuplicateCopyTest.close(os);
		}
	}

}
