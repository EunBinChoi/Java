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
		
		// Buffer 입출력 스트림: 입력/출력 성능 향상
		// - 바이트 단위: BufferedInputStream, BufferedOutputStream
		// - 문자 단위: BufferedReader, BufferedWriter
		// - 자체적으로 입출력 불가능 (기존의 입출력 스트림에 연결해서 사용)
		// - 버퍼의 사이즈 (8192)이 가득 찼을 때에만 입출력 수행
		// - 마지막 버퍼에 남겨있는 데이터가 목적지로 가지 못할 수도 있음 
		// => flush() 수행해야 함!
		InputStream fis = null;
		BufferedInputStream bis = null;
		OutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fis = new FileInputStream("dog.jpg");
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream("dog_with_buffer.jpg");
			bos = new BufferedOutputStream(fos);
			
			// 이미지 복사
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
