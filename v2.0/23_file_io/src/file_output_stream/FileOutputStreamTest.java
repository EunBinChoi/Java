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
			// ������ ���� ��� ������ ����
			// �̹� ������ ���� ��쿡�� ������ ���
			
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
					// ���ۿ� �����ִ� �����͸� ���������� ���� ��
					// write() ������ ����Ŵ
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
