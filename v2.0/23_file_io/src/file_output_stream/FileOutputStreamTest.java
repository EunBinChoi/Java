package file_output_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte[] byteArr = {'a', 'b', 'c'};
		OutputStream os = null;
		try {
			os = new FileOutputStream(".\\output.txt");
			// 파일이 없을 경우 파일을 생성
			// 이미 파일이 있을 경우에는 파일을 덮어씀
			
			os.write(byteArr);
			
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
					// 버퍼에 남아있는 데이터를 강제적으로 쓰게 함
					// write() 성능을 향상시킴
					os.close();
				}
			} catch(IOException e) {
				System.out.println(e);
			} catch(Exception e) {
				System.out.println(e);
			}
		}
	}

}
