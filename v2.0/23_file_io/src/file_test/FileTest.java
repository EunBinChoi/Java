package file_test;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// ���� ���丮�� ���� ����
		File dir = new File(".\\newFolder"); 
		// . : ~~~~\\java-workspace\\23_file_io
		if(!dir.exists()) dir.mkdir(); 
		// mkdir: make directory
		
		// ���� ���丮�� ���� ����
		File file = new File(".\\newFile.txt");
		if(!file.exists()) file.createNewFile();
		if(file.exists()) file.delete(); // ������ ���� ����
		
		
		// ���� ���丮�� ���� ����Ʈ Ȯ��
		File curDir = new File(".");
		File[] fileLists = curDir.listFiles();
		for(File f : fileLists) {
			System.out.println(f);
		}
		
		// OS�� ���������� ���� ���� �����ڰ� �ٸ�
		// \: ������
		// /: MacOS
		System.out.println(File.separator);
		
	}

}
