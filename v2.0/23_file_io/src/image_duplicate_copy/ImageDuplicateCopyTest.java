package image_duplicate_copy;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ImageDuplicateCopyTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		final String original = "dog"; // 원본 파일의 이름
		final String extension = ".jpg"; // 확장자
		final String separator = File.separator; // 디렉토리 구분 (\, /)
		final String dir = "."; // 현재 디렉토리 
		
		String appendName = "copy";
		int appendNumber = 0;
		String copy = original; // 복사될 파일의 이름
		// copy = "dog"
		while (true) {
//			appendNumber++;
			
			copy = original + " (" + (++appendNumber) + ")"; 

			File file = new File(dir + separator + copy + extension);
			if (!file.exists()) {
				file.createNewFile();
				break;
			}	
		}
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream(dir + separator + original + extension);
			os = new FileOutputStream(dir + separator + copy + extension);

			byte[] readBytes = new byte[256];
			int data;
			while ((data = is.read(readBytes)) != -1) {
				// read()의 반환값: 실제 읽은 바이트 수 (int)
				os.write(readBytes, 0, data);
				// 그림 파일 / 256이 나누어떨어지지 않기 때문에
				// 실제 읽은 바이트 수만큼 써야함
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			close(os);
			close(is);
		}
	}
	public static void close(Closeable c) {
		if(c == null) return;
		try {
//			if(c != null) {
				c.close(); // os인 경우 flush()는 close() 내부적으로 호출하니까
//			}
		} catch (IOException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
