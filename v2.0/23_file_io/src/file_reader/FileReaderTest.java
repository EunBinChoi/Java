package file_reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;

import image_duplicate_copy.ImageDuplicateCopyTest;
public class FileReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Charset.defaultCharset());
		
		Reader reader = null;
		try {
			reader = new FileReader("input.txt");
//			int data = reader.read();
//			String s = ((char)data);
//			System.out.print((char)data);
			
			
			char[] data = new char[8];
			reader.read(data); 
			// 문자단위로 읽어오기 때문에 한국어 인식 가능 (현재 .java 파일을 utf-8 변경)
			for(char c : data) {
				System.out.print(c);
			}
			// 가 + cr lf 
			// 나 + cr lf
			// 다 + cr
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			ImageDuplicateCopyTest.close(reader);
		}
	}

}
