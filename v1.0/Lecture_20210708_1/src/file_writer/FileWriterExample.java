package file_writer;

import java.io.*;


public class FileWriterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// FileWriter(File file, boolean append);
		// FileWriter(File file);
		// FileWriter(String str, boolean append);
		// FileWriter(String str);
		
		try {
			File file = new File("C:\\Users"
					+ "\\goott2\\Desktop"
					+ "\\������\\Lecture_20210708_1"
					+ "\\src\\file_writer\\test2.txt");
			FileWriter fw = new FileWriter(file);
			
			fw.write("�����ϼ���!\n");
			fw.write("�����ϼ���!\n");
			fw.flush();
			fw.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}


/* 
 * [���� ����]
 * 
 * ������ �ϳ� ���� ���� (input.txt)�� �ִ� �����͸� �а� 
 * (FileReader)
 * �� �����͸� �ٸ� ���� (output.txt)�� ����ϴ� ���α׷� 
 * (FileWriter)
 * */
