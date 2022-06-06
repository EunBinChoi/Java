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
		final String original = "dog"; // ���� ������ �̸�
		final String extension = ".jpg"; // Ȯ����
		final String separator = File.separator; // ���丮 ���� (\, /)
		final String dir = "."; // ���� ���丮 
		
		String appendName = "copy";
		int appendNumber = 0;
		String copy = original; // ����� ������ �̸�
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
				// read()�� ��ȯ��: ���� ���� ����Ʈ �� (int)
				os.write(readBytes, 0, data);
				// �׸� ���� / 256�� ����������� �ʱ� ������
				// ���� ���� ����Ʈ ����ŭ �����
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
				c.close(); // os�� ��� flush()�� close() ���������� ȣ���ϴϱ�
//			}
		} catch (IOException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
