package file_test;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// 현재 디렉토리에 폴더 생성
		File dir = new File(".\\newFolder"); 
		// . : ~~~~\\java-workspace\\23_file_io
		if(!dir.exists()) dir.mkdir(); 
		// mkdir: make directory
		
		// 현재 디렉토리에 파일 생성
		File file = new File(".\\newFile.txt");
		if(!file.exists()) file.createNewFile();
		if(file.exists()) file.delete(); // 생성한 파일 삭제
		
		
		// 현재 디렉토리에 파일 리스트 확인
		File curDir = new File(".");
		File[] fileLists = curDir.listFiles();
		for(File f : fileLists) {
			System.out.println(f);
		}
		
		// OS가 무엇인지에 따라서 파일 구분자가 다름
		// \: 윈도우
		// /: MacOS
		System.out.println(File.separator);
		
	}

}
