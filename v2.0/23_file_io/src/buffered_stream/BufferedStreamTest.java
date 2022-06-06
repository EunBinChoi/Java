package buffered_stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import image_duplicate_copy.ImageDuplicateCopyTest;

public class BufferedStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Buffer ����� ��Ʈ��: �Է�/��� ���� ���
		// - ����Ʈ ����: BufferedInputStream, BufferedOutputStream
		// - ���� ����: BufferedReader, BufferedWriter
		// - ��ü������ ����� �Ұ��� (������ ����� ��Ʈ���� �����ؼ� ���)
		// - ������ ������ (8192)�� ���� á�� ������ ����� ����
		// - ������ ���ۿ� �����ִ� �����Ͱ� �������� ���� ���� ���� ���� 
		// => flush() �����ؾ� ��!
		InputStream fis = null;
		BufferedInputStream bis = null;
		OutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fis = new FileInputStream("dog.jpg");
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream("dog_with_buffer.jpg");
			bos = new BufferedOutputStream(fos);
			
			// �̹��� ����
			int data;
			while((data = bis.read()) != -1) {
				bos.write(data);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			ImageDuplicateCopyTest.close(bos);
			ImageDuplicateCopyTest.close(fos);
			ImageDuplicateCopyTest.close(bis);
			ImageDuplicateCopyTest.close(fis);
		}
		
	}

}
