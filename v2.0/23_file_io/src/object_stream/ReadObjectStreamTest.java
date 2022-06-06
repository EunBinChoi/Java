package object_stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.List;

import image_duplicate_copy.ImageDuplicateCopyTest;


public class ReadObjectStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(".\\students.dat");
			ois = new ObjectInputStream(fis);
			
			@SuppressWarnings("unchecked")
			List<Student> students = (List<Student>)ois.readObject();
			System.out.println(students);
			System.out.println(students.get(0).getName());
			System.out.println(students.get(1).getGender());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			ImageDuplicateCopyTest.close(ois);
			ImageDuplicateCopyTest.close(fis);
		}
	}

}
