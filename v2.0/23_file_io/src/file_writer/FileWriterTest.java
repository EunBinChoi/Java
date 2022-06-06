package file_writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import image_duplicate_copy.ImageDuplicateCopyTest;

public class FileWriterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] sentences 
		= {"안녕하세요!", "\n", "구트아카데미입니다.", "\n", "메리크리스마스!"};
		
		Writer writer = null;
		try {
			writer = new FileWriter("output.txt");
//			writer.write("맛점하세요!!");
//			writer.write("\n");
//			writer.write("맛점하세요!!");
			
			for(String s : sentences) {
				writer.write(s);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			ImageDuplicateCopyTest.close(writer);
		}
	}

}
