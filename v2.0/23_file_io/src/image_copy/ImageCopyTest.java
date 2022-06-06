package image_copy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ImageCopyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String original = ".\\dog.jpg";
		final String copy = ".\\dog_copy.jpg";
		
		
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream(original);
			os = new FileOutputStream(copy);
			
			byte[] readBytes = new byte[256];
			int data;
			while((data = is.read(readBytes)) != -1) {
				// read()의 반환값: 실제 읽은 바이트 수 (int)
				os.write(readBytes, 0, data);
				// 그림 파일 / 256이 나누어떨어지지 않기 때문에
				// 실제 읽은 바이트 수만큼 써야함
			}
		} catch(FileNotFoundException e) {
			System.out.println(e);
		} catch(IOException e) {
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
		} finally {
			try {
				if(os != null) {
					os.flush();
					os.close();
				}
				if(is != null) {
					is.close();
				}
			} catch(IOException e) {
				System.out.println(e);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
	}

}

